package com.uruburu.treasuebin.comment.Entity;

import com.uruburu.treasuebin.article.Article;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
* SingleTableStrategy
* 달린 댓글은 무식하게 한 테이블에 때려박고
* 필요할때 땡긴다.
* */
@Entity@Builder@Getter@Setter
@NoArgsConstructor@AllArgsConstructor@Table(name = "Comment")
public abstract class Comment implements Article {

    @Id@GeneratedValue
    private Long id;

    private String contents;

    private LocalDateTime createdAt;

    private LocalDateTime lastModified;

    @OneToMany(mappedBy = "comment")
    private List<Comment> comments ;

    @Override
    public String toString(){
        return String.format("Comment contents", contents);
    }
    public Comment (String contents){
        this.createdAt = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
        this.contents = contents;
        this.comments = new ArrayList<>();
    }
}
