package com.uruburu.treasuebin.treasure.Entity;

import com.uruburu.treasuebin.article.Article;
import com.uruburu.treasuebin.comment.Entity.Comment;
import com.uruburu.treasuebin.treasure.TimeGap;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

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

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    private LocalDateTime willExpireTime;

    private Boolean isTrash;

    @OneToMany(mappedBy = "Comment")
    private List<Comment> comments;

    private Integer initialPrice;

    private Integer maginotPrice;

    private Integer minusPrice;

    private Boolean isSold;

    private TimeGap timeGap;

    //사진파일 저장용
    @Value("${file.dir}/")
    private String fileDirPath;

    //좋아요 기능
    private Integer like;


    public Integer getTimeGap() {return timeGap.getNum();}

    public Integer getCurrentPrice(){
        Integer time = lastModifiedAt.compareTo(LocalDateTime.now());
        Integer priceGap = (time/getTimeGap()) * minusPrice;
        if(initialPrice - priceGap > maginotPrice)return initialPrice - priceGap;
        return maginotPrice;
    }

}