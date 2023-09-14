package com.excellence.spring_one_to_many_mapping.service;

import com.excellence.spring_one_to_many_mapping.payload.PostDto;
import com.excellence.spring_one_to_many_mapping.payload.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto);

	PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

	PostDto getPostById(long id);

	PostDto updatePost(PostDto postDto, long id);

	void deletePostById(long id);

}
