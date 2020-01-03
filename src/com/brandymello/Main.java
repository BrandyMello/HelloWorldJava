package com.brandymello;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Work through Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[2] = 2;
////        numbers[10] = 3;
////        Arrays.toString(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int[] nums = {2,3,5,1,4};
//        Arrays.sort(nums);
//        System.out.println(nums);
//        System.out.println(Arrays.toString(nums));
//
//        //multi dimensional arrays
//        int[][] multiDimeNums = new int[2][3];
//        multiDimeNums[0][0] = 1;
//        System.out.println(Arrays.deepToString(multiDimeNums));
//
//        int[][] doubleDime = { { 1, 2, 3}, { 2, 4, 6} };
//        System.out.println(Arrays.deepToString(doubleDime));
//
//
//        //final treats variable as constant; cannot change; use all caps for name
//        final float PI = 3.14F;

//        //Arithmetic expressions
//        int result = 10 + 3;
//        double divResult = (double)10 / (double)3;
//        int x = 1;
//        //x++; || ++x; If you put the incrementer before the variable when assigning it to a new variable, it will increment before the assignment verses being incremented after.
//        int y = ++x;
//        // x += 2, x -=2, x /= 2, x *= 2
//        // multiplication and division take higher priority in order of operation just like in math
//        System.out.println(result);
//        System.out.println(divResult);
//        System.out.println(x);
//        System.out.println(y);

        //Casting and Type diversion: implicit casting - converts to the bigger(byte) type or more precise
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//        //Explicit casting (only with compatible types):
//        //byte > short > int > long > float > double
//        double b = 3.4;
//        int c = (int)b + 2;
//        System.out.println(c);
//        //ParseInt
//        String d = "5";
////        Integer.parseInt() //wrapper class for the int primitive type...
//        int f = Integer.parseInt(d) + 2;
//        System.out.println(f);
//        String g = "5.7";
//        float h = Float.parseFloat(g) + 3;
//        System.out.println(h);

//        //Math class
//        int result = Math.round(1.1F); //or float result = Math.round(1.1) for 1.0 returned;
//        System.out.println(result);
//        int ceilResult = (int)Math.ceil(1.1F);
//        System.out.println(ceilResult);
//        int floorResult = (int)Math.floor(1.1F);
//        System.out.println(floorResult);
//        int maxResult = Math.max(1, 4);
//        System.out.println(maxResult);
//        double randomResult = Math.random();
//        System.out.println(randomResult);
//        int randomResult2 = (int)Math.round(Math.random() * 100); // or int randomResult2 = (int)(Math.random() * 100);
//        System.out.println(randomResult2);

        //Formatting Numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.896);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
        //refactor with method chaining...
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);

        //Reading Input from user
//        Scanner scanner = new Scanner(System.in);
////        System.out.print("Age: "); //just use print because you do not want a line break after
////        byte age = scanner.nextByte();
////        System.out.println("You are " + age);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim(); // nextLine prints entire line rather than just next token
//        //and trim() ensures that extra spaces before and after the input are trimmed from the output
//        System.out.println("You are " + name);

        final byte monthsInYear = 12;
        final byte percentDivisor = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Annual Interest Rate: ");
        double annualIntrstRate = (Double.parseDouble(scanner.nextLine().trim()));
        double rate = (annualIntrstRate/percentDivisor)/monthsInYear;

        System.out.print("Period (Years): ");
        byte years = Byte.parseByte(scanner.nextLine().trim());
        int numOfPayments = years * monthsInYear;

        double ratePow = Math.pow(rate +1, numOfPayments);
        double topLineOfEquation = ratePow * rate;
        double bottomLineOfEquation = ratePow - 1;
        double result = principal * (topLineOfEquation/bottomLineOfEquation);

        String mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Mortgage " + mortgage);

        //Work through Strings:

//        int age = 30;
//        age = 35;
//        byte myAge = 30;
//        short herAge = myAge;
//        Date now = new Date();
//        System.out.println(now);
////        now.getTime();
//        long viewCount = 3_123_456_789L;
//        double oldPrice = 9.99;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//	    System.out.println("Hello World!");
//	    System.out.println(age);
//        System.out.println(herAge);
//        byte x = 1;
//        byte y = x;
//        x = 2;
////        System.out.println(y);
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//        String message = "Hello World" + "!!";
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("e"));
//        System.out.println(message.indexOf("sky"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
//        System.out.println(message.toUpperCase());
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());
//        String nameMessage = "Hello \"Mosh\"";
//        System.out.println(nameMessage);
//        String brokenMessage = "Hello \nMosh";
//        String tabbedMessage = "Hello \tMosh";
//        System.out.println(brokenMessage);
//        System.out.println(tabbedMessage);
    }
}
