package com.github.bakerzhu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @auther bozhu
 */
public class App {

    public Integer age = 10;

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime ldt = LocalDateTime.now();
        String format = dtf.format(ldt);
        System.out.println(format);
    }
}
