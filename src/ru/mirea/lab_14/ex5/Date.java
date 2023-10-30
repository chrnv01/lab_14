package ru.mirea.lab_14.ex5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {
        System.out.println("Введите любую дату (от 1900 до 9999 гг.) в формате (дд/мм/гггг):");

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$");

        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Дата соответствует формату (1900-9999гг.)");
            } else{
                System.out.println("Дата не соотвествует формату,\nПопробуйте еще раз");

            }
        }
    }
}
