package org.example;

public class Main {

    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) return false;
        if (!barking) return false;
        return hour < 8 || hour >= 20;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int maxTemp = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        // shouldWakeUp testleri
        System.out.println(shouldWakeUp(true, 1));    // true
        System.out.println(shouldWakeUp(false, 2));   // false
        System.out.println(shouldWakeUp(true, 8));    // false
        System.out.println(shouldWakeUp(true, -1));   // false

        // hasTeen testleri
        System.out.println(hasTeen(9, 99, 19));       // true
        System.out.println(hasTeen(23, 15, 42));      // true
        System.out.println(hasTeen(22, 23, 34));      // false

        // isCatPlaying testleri
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true

        // area testleri
        System.out.println(area(5.0, 4.0));           // 20.0
        System.out.println(area(-1.0, 4.0));          // -1.0
        System.out.println(area(5.0));                // 78.53981...
        System.out.println(area(-1.0));               // -1.0
    }
}