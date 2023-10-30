package ru.mirea.lab_14.ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        System.out.println("----------------------------Придумайте надежный пароль----------------------------\n" +
                "╭---------------------------------------------------------------------------------╮\n" +
                "|     Пароль считается надежным, если он состоит из 8 или более символов. Где     |\n" +
                "| символом может быть цифр, английская буква, и знак подчеркивания. Пароль должен |\n" +
                "|    содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.   |\n" +
                "╰---------------------------------------------------------------------------------╯\n" +
                "Введите пароль: ");

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9_]{8,}$");
        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Отлично, у Вас надежный пароль!");
            } else{
                System.out.println("Пароль ненадежный,\nПопробуйте еще раз!");

            }
        }
    }
}
