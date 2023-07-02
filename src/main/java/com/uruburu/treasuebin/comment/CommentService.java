package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.DTO.CommentDTO;
import com.uruburu.treasuebin.comment.Entity.Cocomment;
import com.uruburu.treasuebin.comment.Entity.Comment;
import com.uruburu.treasuebin.comment.Entity.TreasureComment;
import com.uruburu.treasuebin.treasure.Treasure;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {
    private CommentRepository commentRepository;

    public Comment makeNewComment(CommentDTO commentDTO){
        if(commentDTO.getMother().getClass() == Treasure.class){
            TreasureComment comment = new TreasureComment(commentDTO.getContents(), (Treasure) commentDTO.getMother());
            commentRepository.save(comment);
            return comment;
        }
        if(commentDTO.getMother().getClass() == Cocomment.class){
            Cocomment comment = new Cocomment(commentDTO.getContents(), (Cocomment) commentDTO.getMother());
            commentRepository.save(comment);
            return comment;
        }
        return null;
    }

}
