package com.uruburu.treasuebin.treasure;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.Comment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    private Integer initialPrice;

    private Integer currentPrice;

    private Integer maginotPrice;

    private Integer minusPrice;

    private Boolean isSold;

    private TimeGap timeGap;

    public Integer getTimeGap() {
        return timeGap.getNum();
    }
}
