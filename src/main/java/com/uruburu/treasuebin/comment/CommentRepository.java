package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.comment.Entity.Comment;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public class CommentRepository {

    @Autowired
    EntityManager em;
    public Comment findById(Long id){
        return em.find(Comment.class, id);
    }

    public void save(Comment comment){
        if(comment.getId() == null)em.persist(comment);
        else em.merge(comment);
    }



}
