package com.uruburu.treasuebin.treasure;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.Comment;
import com.uruburu.treasuebin.price.Price;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.time.LocalDateTime;
import java.util.List;

@Entity@AllArgsConstructor@NoArgsConstructor
@Getter@Builder
public class Treasure implements Article{

    @Id@GeneratedValue
    private Long id;

    private Long author;

    private String title;

    private String contents;

    private LocalDateTime writeInTime;

    private Boolean isTrash;

    @OneToMany(mappedBy = "Comment")
    private List<Comment> comments;

    @OneToOne(mappedBy = "price")
    private Price price;



}
