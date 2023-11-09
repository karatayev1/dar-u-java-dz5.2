//Homework 5.2
public class Main {
    public static void main(String[] args) {
        //Task 4
        int number = 12345;
        String s = String.valueOf(number);
        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        System.out.println(r);
        System.out.println("--------");

        //Task 5
        int p = 7;
        boolean prime = false;

        if (p < 2) {
            prime = false;
        } else if (p == 2) {
            prime = true;
        } else {
            for (int i = 2; i * i < p; i++) {
                if (p % i == 0) {
                    prime = false;
                } else {
                    prime = true;
                }
            }
        }
        System.out.println("Простое число: " + prime);
        System.out.println("--------");

        //Task 6 (i)
        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 9; b++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("--------");

        //Task 6 (ii)
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("--------");

        //Task 6 (iii)
        String str = "";

        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                str = str + i;
            } else {
                str = i + str + i;
            }

            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(str);
        }
        System.out.println("--------");

        //Task 7
        int a = 2, b = 4;
        int sum = 0;

        if (a >= 0 && b > 0) {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    sum += i;
                }
            } else {
                System.out.println("Число a должно быть меньше b");
            }
        } else {
            System.out.println("Введите натуральные числа");
        }
        System.out.println(sum);
        System.out.println("--------");

        //Task 8
        double wage = 100000;
        double bonus = 0;
        int percent = 0;
        char c = 'A';

        switch (c) {
            case 'A' -> {
                percent = 50;
            }
            case 'B' -> {
                percent = 25;
            }
            case 'C' -> {
                percent = 0;
            }
        }

        bonus = wage * percent / 100;
        System.out.println(bonus);
        System.out.println("--------");

        //Task 9
        int n = 9;
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;

        System.out.print(n0 + " " + n1 + " ");
        if (n > 0) {
            for (int i = 3; i <= n; i++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
        }
    }
}