package com.uruburu.treasuebin.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    public Optional<Comment> findById(Long id);


}
