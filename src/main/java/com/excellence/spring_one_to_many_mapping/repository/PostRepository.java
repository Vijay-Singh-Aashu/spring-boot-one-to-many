package com.excellence.spring_one_to_many_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.spring_one_to_many_mapping.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}