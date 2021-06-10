package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Task1(int n) {
        switch (n) {
            case (1) -> System.out.println("Початкова зупинка - 'Держуніверситет'\t Кінцева зупинка - 'вул. Ясська'");
            case (2) -> System.out.println("Початкова зупинка - 'Дріжзавод'\t Кінцева зупинка - 'завод \"Кварц\"'");
            case (3) -> System.out.println("Початкова зупинка - 'Держуніверситет'\t Кінцева зупинка - 'Поліклініка профоглядів'");
            case (4) -> System.out.println("Початкова зупинка - 'Держуніверситет'\t Кінцева зупинка - 'Музей народної архітектури та побуту'");
            case (5) -> System.out.println("Початкова зупинка - 'Калинівський ринок'\t Кінцева зупинка - 'вул. Південно-Кільцева'");
            case (6) -> System.out.println("Початкова зупинка - пл. Соборна'\t Кінцева зупинка - 'Училище №15'");
            case (7) -> System.out.println("Початкова зупинка - 'Держуніверситет'\t Кінцева зупинка - 'вул. Південно-Кільцева'");
            case (8) -> System.out.println("Початкова зупинка - 'пл. Соборна'\t Кінцева зупинка - 'Поліклініка профоглядів'");
            case (9) -> System.out.println("Початкова зупинка - 'Садгора'\t Кінцева зупинка - 'Училище №15'");
            default -> System.out.println("Ви ввели невірний номер тролейбусу");
        }
    }

    public static void Task2 () {
        {
            double a, b, dx;
            a = 0.5;
            b = 4.5;
            dx = 0.4;
            double x = a;
            System.out.println("x" + "\t\t\t\t y = ln(x)\n");
            while (x < b){
                double y = Math.log10(x);
                String result = String.format("%.3f", y);
                String result1 = String.format("%.1f", x);
                System.out.println("x= " + result1 + "\t\t\ty= " + result);
                x = x + dx;

        }

        System.out.println("-----------------------------------------------------");
        {
            double a1, b1, dx1;
            a1 = 0.5;
            b1 = 4.5;
            dx1 = 0.4;
            double x1 = a1;
            System.out.println("x" + "\t\t\t\t y = ln(x)\n");
            do {
                double y1 = Math.log10(x1);
                String result = String.format("%.3f", y1);
                String result1 = String.format("%.1f", x1);
                System.out.println("x= " + result1 + "\t\t\ty= " + result);
                x1 = x1 + dx1;
            }
            while (x1 < b1);
        }
    }}

    public static int[] creata_mass1_1(int n) {
        Scanner myObj = new Scanner(System.in);
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {mass[i] = myObj.nextInt();}
        return mass;
    }

    public static void Task3_1(int[] mass) {
        int max = mass[0];
        int i_max = 0;
        int i = 0;
        while (i < mass.length) {
            if (mass[i] > max) {
                max = mass[i];
                i_max = i;
            }
            i++;
        }
            System.out.println("Номер максимального елемента масиву " + (i_max + 1));
        }

    public static void product(int[] mass)throws Exception{
        if(mass.length == 0) throw new ArrayIndexOutOfBoundsException("Масив не містить жодного елемента");
        int first = -1;
        int last = -1;
        for (int i = 0; i < mass.length;i++){
            if(mass[i] == 0){

                first = i;
                break;
            }
        }
        if(first == -1) throw new Exception("Не знайдено жодного нульового елемента");
        for (int i = first + 1; i < mass.length;i++){
            if(mass[i] == 0) {
                last = i;
            }
        }

        if(last == -1) throw new Exception("Не знайдено останього нульового елемента");
        if(first== last - 1) throw new Exception("Між першим і останім елементом немає елементів");
        int suma = 0;
        for (int i = first + 1; i < last;i++){
             suma += Math.abs(mass[i]);
        }
        System.out.println("Cумa модулів елементів масиву, розташованих між першим й останнім нульовими елементами"+suma);
    }

    public static void print_mass (int[] mass) {
        for (int element:
                mass)
            System.out.println(element + " ");
    }

    public static int[][] create_mass2 (int a, int b){
        int[][] mass2 = new int[a][b];
        Random rnd = new Random();
        for (int i=0;i < mass2.length;i++)
            for (int j = 0; j < mass2[i].length; j++) mass2[i][j] = rnd.nextInt(201) - 100;
        for (int i=0;i < mass2.length;i++,System.out.println())
            for (int j = 0; j < mass2[i].length; j++) System.out.print(mass2[i][j] + " ");
        return mass2;
    }
    public static void Task4(int[][] nat){
        int max = 0;
        int suma = 0;
        int v = 0;
        for (int i=0;i < nat.length;i++) {
            for (int j = 0; j < nat[i].length; j++) {
                if (nat[i][j] > max) max = nat[i][j];
            }
            System.out.println(v++ + " "+ max);
            max = nat[i++][0];
            suma = suma +max;
            //suma=+max;
        }
        System.out.println(suma);
    }
    public static int[] create_mass1_2(int n) {
        Random random = new Random();
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) mass[i] = -100 + random.nextInt(200);
        return mass;
    }


    public static void main(String[] args) {
        int k;
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("""
                    1. Task 1\s
                    2. Task 2\s
                    3. Task 3\s
                    4. Task 4
                    5. Task 5""");
            k = myObj.nextInt();
            switch (k) {
                case 1: {
                    System.out.println("");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть номер маршруту(1-9)");
                    int n = scanner.nextInt();
                    Task1(n);
                }
                    break;
                case 2: {
                    Task2();
                }
                    break;
                case 3:{
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Виберіть спосіб вводу (1 - вручну, 2 - рандомайзером)");
                    int q = scanner.nextInt();
                    switch (q){
                        case 1:
                            System.out.println("Введіть розмір масиву ");
                            int u = scanner.nextInt();
                            int[] mass = creata_mass1_1(u);
                            System.out.println();
                            print_mass(mass);
                            Task3_1(mass);
                            try {
                                product(mass);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("Введіть розмір масиву ");
                            u = scanner.nextInt();
                            mass = create_mass1_2(u);
                            System.out.println();
                            print_mass(mass);
                            Task3_1(mass);
                            try {
                                product(mass);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                }
                break;
                case 4:
                    System.out.println("Введіть розміри матриці");

                    int a = myObj.nextInt();
                    int b = myObj.nextInt();
                    int[][] mass2 = new int[a][b];
                    mass2 = create_mass2(a,b);
                    Task4(mass2);
            }

        }
        while (k<6);
    }
}