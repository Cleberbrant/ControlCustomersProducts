package utils;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Sc {

    private Sc() {
    }

    public static int nextInt() {
        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String nextLine() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double nextDouble() {
        var scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
