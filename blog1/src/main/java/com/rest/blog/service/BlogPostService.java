package com.rest.blog.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.rest.blog.Dto.BlogPostDto;

public interface BlogPostService {
	
	BlogPostDto createBlogPost(BlogPostDto blogPostDto);

	BlogPostDto findBlogPostById(Integer postid);

	List<BlogPostDto> findAllBlogPosts(PageRequest page); 
	
	BlogPostDto updateBlogPost(BlogPostDto blogPostDto);
	
	BlogPostDto deleteBlogPostById(Integer postid);
}
