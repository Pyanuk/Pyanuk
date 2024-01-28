import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Proktoz {
    public static void main(String[] args) {
        System.out.println("Привет в программу под название ^Проверка возраста^ ");
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println("\n1. Создать пользователя");
            System.out.println("2. Персональные данные");
            System.out.println("3. Проверка возраста");
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Привет, ты успешно создан");
            } else if (option == 2) {
                System.out.print("Введите ваш год рождения (yyyy-MM-dd): ");
                String dateInput = scanner.next();
                LocalDate dateOfBirth = LocalDate.parse(dateInput, dateFormatter);
                System.out.println("Ваша дата рождения: " + dateOfBirth.format(dateFormatter));
            } else if (option == 3) {
                System.out.println("Введите ваш год рождения, для проверки (yyyy-MM-dd): ");
                String dateInput = scanner.next();
                LocalDate dateOfBirth = LocalDate.parse(dateInput, dateFormatter);
                long age = ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
                if (age < 18) {
                    System.out.println("Доступ запрещен :(");
                } else {
                    System.out.println("Доступ разрешен :) ");
                }
            } else if (option == 4) {
                System.out.println("Пока");
                break;
            } else {
                System.out.println("Неверный запрос");
            }
        }

        scanner.close();
    }
}
