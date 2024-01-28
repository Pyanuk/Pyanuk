import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Proktoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет дорогой пользователь");
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите вашу дату рождения (формат: дд.мм.гггг): ");
        String birthDateInput = scanner.next();
        LocalDate birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        User user = new User(name, birthDate);
        user.display();
    }
}

class User {
    String name;
    LocalDate birthDate;
    User(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    void display() {
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваша дата рождения: " + birthDate);
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();
        if (age >= 18) {
            System.out.println("Вам больше 18 лет. Всеравно ваш паспорт!");
        } else {
            System.out.println("Вам не больше 18 лет. Ваш паспорт!");
        }
    }
}