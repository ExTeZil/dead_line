package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.io.FileWriter;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<CD> cdArrayList = new ArrayList<>();
        LocalDate localDate1 = LocalDate.now();
        cdArrayList.add(new CD(1,"K",1,"g",localDate1));

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                1.Ввести дані з клавіатури
                2.Вивести дані\s
                3.Видалити запис
                4.Пошук запису та редагування 
                5.Зчитати дані з файлу
                6.Записати дані в файл
                7.Сортування
                8.Вихід
                Введіть число :\s""");

        int num = scanner.nextInt();

        while (num!=8){
            switch (num){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    try {
                        LocalDate localDate = LocalDate.now();
                        System.out.println("Введіть інвентарний номер ");
                        int inventorynumber = scanner1.nextInt();
                        System.out.println("Введіть назву альбому ");
                        String name = scanner1.next();
                        System.out.println("Введіть об'єм диску ");
                        int size = scanner1.nextInt();
                        System.out.println("Ввеіть тип диску ");
                        String type = scanner1.next();
                        cdArrayList.add(new CD(inventorynumber,name,size,type, localDate));
                    } catch (Exception e) {
                        System.out.println("некоректно введений тип даних");
                        //e.printStackTrace();
                    }
                    break;
                case 2:
                    for(CD cd : cdArrayList) {
                        System.out.println(cd);
                    }
                    break;
                case 3:
                    int p = 0;
                    for(CD cd : cdArrayList) {
                        String s = String.valueOf(p=p+1);
                        System.out.println("Номер "+ s);
                        System.out.println(cd);
                    }
                    System.out.println("Введіть номер який потрібно видалити = ");
                    Scanner scanner2 = new Scanner(System.in);
                    int y = scanner2.nextInt();
                    cdArrayList.remove(y-1);
                    break;
                case 4:
                    Scanner scanner3 = new Scanner(System.in);
                    /*System.out.println("Введіть рік ");
                    int year = scanner3.nextInt();
                    System.out.println("Введіть місяць(1-12) ");
                    int month = scanner3.nextInt();
                    System.out.println("Введіть день ");
                    int day = scanner3.nextInt();
                    LocalDate date = LocalDate.of(year,month,day);
                    boolean k = false;

                    for (CD cd:cdArrayList){
                            if(cd.getLocalDate().equals(date)){
                                System.out.println(cd);
                            k=true;
                            }
                    }
                    if(k==false){
                        System.out.println("Нічого не знайдено!");
                    }
                    */

                    System.out.println("Введіть назву альбому ");
                    String albumname = scanner3.next();

                    boolean k = false;

                    for (CD cd11: cdArrayList) {
                        if(cd11.getAlbumName().equals(albumname)){
                            System.out.println(cd11);
                            System.out.println("Введіть новий об'єм диску");
                            int diskvol = scanner3.nextInt();
                            cd11.setDiskVolume(diskvol);
                            System.out.println("Результат після редагування - " + cd11);
                            k=true;
                            break;
                        }

                    }
                        if(k==false){
                            System.out.println("Нічого не знайдено!");
                        }
                    break;
                case 5:
                    try {
                        FileReader reader = new FileReader("load.txt");
                        BufferedReader bufferedReader = new BufferedReader(reader);
                        String line = bufferedReader.readLine();
                        while (line!=null){
                            String[] words = line.split(" ");
                            int inventorynumber = Integer.parseInt(words[0]);
                            String name = words[1];
                            int size = Integer.parseInt(words[2]);
                            String type = words[3];
                            LocalDate localDate = LocalDate.parse(words[4]);
                            cdArrayList.add(new CD(inventorynumber,name,size,type, localDate));
                            line = bufferedReader.readLine();
                        }
                    }
                    catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try(FileWriter writer = new FileWriter("save.txt", false)) {
                        for (CD cd:cdArrayList) {
                            writer.write(cd.toSave());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                    default:
                    System.out.println("Не вірно введене число!Введіть ще раз :");
                    break;

            case 7:
                cdArrayList = (ArrayList<CD>) cdArrayList.stream().sorted(Comparator.comparing(CD::getLocalDate)
                ).collect(Collectors.toList());
                for (CD cd:cdArrayList){
                    System.out.println(cd);
                }
                break;
            }
            System.out.print("""
                1.Ввести дані з клавіатури
                2.Вивести дані\s
                3.Видалити запис
                4.Пошук запису та редагування 
                5.Зчитати дані з файлу
                6.Записати дані в файл
                7.Cортування 
                8.Вихід
                Введіть число :\s""");
            num = scanner.nextInt();
        }
    }
}