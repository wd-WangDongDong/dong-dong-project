package com.itwd.learnproject.basiclearningexercise.string;

import org.junit.Test;

import java.io.Console;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Author: wangdong
 * @Date: 2021/5/15 21:30
 * @Version 1.0
 */
public class LearnStringDemo1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        String str = in.nextLine();
        System.out.println("str:" + str);
    }

    @Test
    public void test1(){

        String str = "abcdefghijklmnopqrst";
        System.out.println(str.codePointAt(1));
        System.out.println(str.compareTo("abcdefghijklmnopqrst"));
    }


    /**
     * 打印路径下的文件到控制台
     */
    @Test
    public void test2(){
        LocalDate newYearsEve = LocalDate.of(1000,11,12);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

    }
}
