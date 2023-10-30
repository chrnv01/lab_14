package ru.mirea.lab_14.ex6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        System.out.println("Введите Email:");

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Письмо с кодом подтверждения уже отправленно на вашу электронную почту!");
            } else{
                System.out.println("Адрес электронной почты введен некоректно,\nпопробуйте еще раз.");

            }
        }
    }
}