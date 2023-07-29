package com.uruburu.treasuebin.comment.Entity;

import com.uruburu.treasuebin.treasure.Entity.Treasure;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class TreasureComment extends Comment{

    protected TreasureComment(){}

    @ManyToOne
    private Treasure treasure;

    public TreasureComment(String contents, Treasure mother){
        super(contents);
        this.treasure = mother;
    }

}
