package com.uruburu.treasuebin.treasure;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TimeGap {
        OneMinute("One",1),
        FiveMinute("Five",5),
        TenMinute("Ten",10),
        FifteenMinute("Fifteen",15),
        ThirtyMinute("Thirty",30),
        SixtyMinute("Sixty",60),
    ;

    public final String timeGap;
    public Integer num;


    TimeGap(String count, Integer num) {
        this.timeGap = count;
        this.num = num;
    }

    TimeGap(String count){
        this.timeGap = count;
    }

    public String getTimeGap(){
        return timeGap;
    }
    public Integer getNum(){
        return num;
    }

    private static final Map<String, TimeGap> BY_TIME =
            Stream.of(values()).collect(Collectors.toMap(TimeGap::getTimeGap, Function.identity()));

    private static final Map<Integer, TimeGap> BY_NUMBER =
            Stream.of(values()).collect(Collectors.toMap(TimeGap::getNum, Function.identity()));
    public static TimeGap valueOfTimeGap(String timeGap) {
        return BY_TIME.get(timeGap);
    }

    public static TimeGap valueOfNumber(Integer number) {
        return BY_NUMBER.get(number);
    }
}
