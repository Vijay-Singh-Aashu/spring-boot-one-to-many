package com.excellence.spring_one_to_many_mapping.payload;

import java.util.Set;

import lombok.Data;

@Data
public class PostDto {
	
	private long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;

}
