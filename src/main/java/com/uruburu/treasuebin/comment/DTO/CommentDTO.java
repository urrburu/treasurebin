package com.uruburu.treasuebin.comment.DTO;

import com.uruburu.treasuebin.article.Article;
import lombok.Data;

@Data
public class CommentDTO {
    private String contents;

    private Article mother;

}
