package com.uruburu.treasuebin.treasure;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.Comment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity@AllArgsConstructor@NoArgsConstructor
@Getter
public class Treasure implements Article{

    @Id@GeneratedValue
    private Long id;

    private Long author;

    private String contents;

    private LocalDateTime writeInTime;

    private Boolean isTrash;

    @OneToMany(mappedBy = "Comment")
    private List<Comment> comments;


}
