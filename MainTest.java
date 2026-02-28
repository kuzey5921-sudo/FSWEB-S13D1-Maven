public class Main {

    public static void main(String[] args) {

        // Testler
        System.out.println(shouldWakeUp(true, 1));   // true
        System.out.println(shouldWakeUp(false, 2));  // false
        System.out.println(shouldWakeUp(true, 8));   // false
        System.out.println(shouldWakeUp(true, -1));  // false

        System.out.println(hasTeen(9, 99, 19));      // true
        System.out.println(hasTeen(23, 15, 42));     // true
        System.out.println(hasTeen(22, 23, 34));     // false

        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        System.out.println(area(5.0, 4.0));          // 20.0
        System.out.println(area(-1.0, 4.0));         // -1

        System.out.println(area(5.0));               // 78.53975
        System.out.println(area(-1));                // -1
    }

    // 1. Havlayan Köpek
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay >= 20)) {
            return true;
        }

        return false;
    }

    // 2. Yaş Tespiti
    public static boolean hasTeen(int a, int b, int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    // 3. Oyuncu Kedi
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    // 4. Dikdörtgen Alanı
    public static double area(double a, double b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return a * b;
    }

    // 5. Daire Alanı (Overload)
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}