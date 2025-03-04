package com.rest.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoResourceFoundException extends RuntimeException {

	private String resourceName;
	private String fieldName;
	private Integer fieldValue;

	public NoResourceFoundException(String resourceName, String fieldName, Integer fieldValue) {
		super(String.format(resourceName + " not found with " + fieldName + ": " + fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Integer getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(Integer fieldValue) {
		this.fieldValue = fieldValue;
	}

}
