package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.comment.DTO.CommentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private CommentRepository commentRepository;

    public Comment makeNewComment(CommentDTO commentDTO){

        Comment comment = Comment.builder()
                .build();
        return commentRepository.save(comment);
    }

}
