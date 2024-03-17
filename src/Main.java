import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // zadanie 1

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        // zadanie 2

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        // zadanie 3
        String fullName2 = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName2);





    }
}