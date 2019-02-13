package com.github.bakerzhu.java.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description
 * @auther bozhu
 */
public class Local {

    public static void main(String[] args) {
        String str = "2019-01-11";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parse = LocalDate.parse(str, formatter);
        System.out.println(parse.toString());

        LocalDate of = LocalDate.of(1991, 8, 1);
        System.out.println(of.format(formatter));

        fromDateToLocalDate();
        System.out.println("======================================");
        fromLocalDateToDate();
    }

    // -- Date 和 Java8 LocalDate 互相转换
    /**
     * 1）将java.util.Date转换为ZonedDateTime。
     * 2）使用它的toLocalDate（）方法从ZonedDateTime获取LocalDate。
     */
    private static void fromDateToLocalDate() {
        Date dt = new Date();
        Instant instant = dt.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println(localDateTime.toString());
    }

    private static void fromLocalDateToDate() {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        Instant instant = zonedDateTime.toInstant();
        Date from = Date.from(instant);
        System.out.println(from);
    }


}
