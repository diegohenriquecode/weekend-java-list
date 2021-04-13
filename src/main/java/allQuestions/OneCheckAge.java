package allQuestions;

import java.util.Scanner;

public class OneCheckAge {
    public int checkAge(int age, int month, int days) {
        Scanner sc = new Scanner(System.in);
        String messageToUser = "Sua idade em DIAS: ";

        System.out.println("Você irá informar sua idade em Anos, Meses e Dias");

        System.out.print("Digite quantos Anos você tem: ");
        int userAge = sc.nextInt();
        System.out.print("Digite quantos Meses você tem: ");
        int userMonth = sc.nextInt();
        System.out.print("Digite quantos Dias: ");
        int userDays = sc.nextInt();

        int userAgeInDays = ((userAge * 365) + (userMonth * 30) + (userDays));

        System.out.println(messageToUser + userAgeInDays);

        return (userAgeInDays);
    }
}
