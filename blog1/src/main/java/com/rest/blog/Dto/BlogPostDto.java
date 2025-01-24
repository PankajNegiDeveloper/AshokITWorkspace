package com.rest.blog.Dto;

import lombok.Data;

@Data
public class BlogPostDto {

	private Integer id;
	private String title;
	private String description;
	private String content;
}
