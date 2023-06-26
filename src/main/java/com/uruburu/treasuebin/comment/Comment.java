package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.treasure.Treasure;
import jakarta.persistence.*;

import javax.annotation.Nullable;

@Entity
public class Comment implements Article {

    @Id@GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)@Nullable
    private Treasure treasure;

    @ManyToOne(fetch = FetchType.LAZY)@Nullable
    private Comment comment;

    @Embedded
    private CommentType commentType;



}
