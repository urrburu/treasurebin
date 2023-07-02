package com.uruburu.treasuebin.comment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter@Entity
public class Cocomment extends Comment{

    protected Cocomment(){}

    @ManyToOne
    private Comment mother;
    /*
    * 여기에 달리는 코멘트 엔티티
    * */

    public Cocomment(String contents, Comment mother){
        super(contents);
        this.mother = mother;
    }
}
