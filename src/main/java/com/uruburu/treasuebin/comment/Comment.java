package com.uruburu.treasuebin.comment;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.treasure.Treasure;
import jakarta.persistence.*;
import lombok.*;

import javax.annotation.Nullable;
import java.util.List;

@Entity@Builder@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class Comment implements Article {

    @Id@GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)@Nullable
    private Treasure treasure;

    @ManyToOne(fetch = FetchType.LAZY)@Nullable
    private Comment comment;

    @Embedded
    private CommentType commentType;

    @OneToMany(mappedBy = "Comment")
    private List<Comment> coComments;



}
