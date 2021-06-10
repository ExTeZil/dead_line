package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Enterprise> enterprise = new ArrayList<Enterprise>();
        enterprise.add(new Enterprise(Month.April, 1000, 1200));
        enterprise.add(new Enterprise(Month.May, 25, 40));
        enterprise.add(new Enterprise(Month.December, 4000, 4000));
        enterprise.add(new Enterprise(Month.January, 2643, 4422));
        enterprise.add(new Enterprise(Month.July, 2252, 3236));
        enterprise.add(new Enterprise(Month.August, 6472, 3784));
        enterprise.add(new Enterprise(Month.March, 464, 4667));
        enterprise.add(new Enterprise(Month.September, 4542, 4564));
        enterprise.add(new Enterprise(Month.November, 2444, 3654));
        enterprise.add(new Enterprise(Month.June, 5476, 5685));

        System.out.println("\n1.Додати дані підприємства "+
                "\n2.Вивести дані підприємств "+
                "\n3.Вивести підприємства з недовикананням план ");
        num = scanner.nextInt();
        while (num != 4) {
            switch (num) {
                case 1:
                    System.out.print("Виберіть місяць "+
                            "\n1.Січень"+
                            "\n2.Лютий"+
                            "\n3.Березень"+
                            "\n4.Квітень"+
                            "\n5.Травень"+
                            "\n6.Червень"+
                            "\n7.Липень"+
                            "\n8.Серпень"+
                            "\n9.Вересень"+
                            "\n10.Жовтень"+
                            "\n11.Листопад"+
                            "\n12.Грудень\n");

                    try {
                        int mont = scanner.nextInt();
                        System.out.println("Введіть кількість планованої кількоті продукції ");
                        int plOutput = scanner.nextInt();
                        System.out.println("Введіть кількість реальної кількості продукції ");
                        int realOutput = scanner.nextInt();
                        enterprise.add(new Enterprise(Month.setMonthByNumber(mont), realOutput, plOutput));

                        if (mont < 1 || mont > 12) throw new Exception();
                    } catch (Exception e ) {
                      System.out.println("Некоректно введено номер місяця ");
                    }
                    break;
                case 2:
                    for (var enter : enterprise) {
                        enter.ToString();
                    }
                    break;
                case 3:
                    System.out.println("\n\n\n" + "Назви місяців з недовиконанням плану випуску продукції" +
                            "\n-------------------------");
                    for (var enter : enterprise) {
                        if (enter.GetPlaneOutput() <= enter.GetRrealOutput()) {
                            enter.ToString();
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                default:
                    System.out.println("Не вірно введене число!Введіть ще раз :");
                   break;
            }

            System.out.println("\n1.Додати дані підприємства "+
                    "\n2.Вивести дані підприємств "+
                    "\n3.Вивести підприємства з недовикананням план ");
            num = scanner.nextInt();
            }
        }

    }