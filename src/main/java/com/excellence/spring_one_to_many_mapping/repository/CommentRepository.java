package com.excellence.spring_one_to_many_mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.spring_one_to_many_mapping.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
