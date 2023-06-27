package com.uruburu.treasuebin.price;

public enum TimeGap {
    OneMinute(1),
    FiveMinute(5),
    ;

    private Integer timeValue;

    TimeGap(int i) {
        this.timeValue =i;
    }
}
