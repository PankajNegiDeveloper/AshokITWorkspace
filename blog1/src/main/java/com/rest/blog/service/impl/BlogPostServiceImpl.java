package com.rest.blog.service.impl;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.rest.blog.Dto.BlogPostDto;
import com.rest.blog.entity.BlogPost;
import com.rest.blog.exception.NoResourceFoundException;
import com.rest.blog.repository.BlogPostRepo;
import com.rest.blog.service.BlogPostService;

@Service
public class BlogPostServiceImpl implements BlogPostService {

	private BlogPostRepo blogPostRepo;

	@Autowired
	public BlogPostServiceImpl(BlogPostRepo blogPostRepo) {
		super();
		this.blogPostRepo = blogPostRepo;
	}

	// **********************************************************
	// changing DtoToEntity
	private BlogPost mapDtoToEntity(BlogPostDto blogPostDto) {
		BlogPost blogPost = new BlogPost();
		blogPost.setBlogid(blogPostDto.getId());
		blogPost.setTitle(blogPostDto.getTitle());
		blogPost.setDescription(blogPostDto.getDescription());
		blogPost.setContent(blogPostDto.getContent());
		return blogPost;
	}

	// changing EntityToDto
	private BlogPostDto mapEntityToDto(BlogPost blogPost) {
		BlogPostDto blogPostDto = new BlogPostDto();
		blogPostDto.setId(blogPost.getBlogid());
		blogPostDto.setTitle(blogPost.getTitle());
		blogPostDto.setDescription(blogPost.getDescription());
		blogPostDto.setContent(blogPost.getContent());
		return blogPostDto;
	}
	// ************************************************************

	// creating blogs
	@Override
	public BlogPostDto createBlogPost(BlogPostDto blogPostDto) {
		BlogPost blogPost = blogPostRepo.save(mapDtoToEntity(blogPostDto));
		return mapEntityToDto(blogPost);
	}

	// finding blog by Id
	@Override
	public BlogPostDto findBlogPostById(Integer postid) {
		Optional<BlogPost> blogPostById = blogPostRepo.findById(postid);
		BlogPost blogPost = blogPostById.orElseThrow(() -> new NoResourceFoundException("BlogPost", "ID", postid));
		return mapEntityToDto(blogPost);
	}

	// finding all blogs
	@Override
	public List<BlogPostDto> findAllBlogPosts(PageRequest page) {
		Page<BlogPost> findAll=blogPostRepo.findAll(page);
//		List<BlogPost> blogPosts = blogPostRepo.findAll();
		List<BlogPost> content = findAll.getContent();
		return content.stream().map(blogPost -> mapEntityToDto(blogPost)).toList();
	}

	// updating blog
	@Override
	public BlogPostDto updateBlogPost(BlogPostDto blogPostDto) {
		Optional<BlogPost> blogPostId = blogPostRepo.findById(blogPostDto.getId());
		BlogPost blogPost = blogPostId
				.orElseThrow(() -> new NoResourceFoundException("BlogPost", "ID", blogPostDto.getId()));
		BlogPost updateBlogPost = blogPostRepo.save(mapDtoToEntity(blogPostDto));
		return mapEntityToDto(updateBlogPost);
	}

	// deleting post
	@Override
	public BlogPostDto deleteBlogPostById(Integer postid) {
		BlogPost blogPostId = blogPostRepo.findById(postid)
				.orElseThrow(() -> new NoResourceFoundException("Blog Post", "ID", postid));
		blogPostRepo.deleteById(postid);
		return mapEntityToDto(blogPostId);
	}

}
