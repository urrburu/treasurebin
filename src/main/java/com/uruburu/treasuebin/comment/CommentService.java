package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.DTO.CommentDTO;
import com.uruburu.treasuebin.treasure.Treasure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private CommentRepository commentRepository;

    public Comment makeNewComment(Article mother, CommentDTO commentDTO){

        Comment comment = Comment.builder()
                .build();
        return commentRepository.save(comment);
    }

    public Treasure commentMother(Comment comment){
        return comment.getTreasure();
    }
}
