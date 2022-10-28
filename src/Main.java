public class Main {
    public static void main(String[] args) {

        // Домашнее задание
        // Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задача 2
        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capitalLetters);

        // Задача 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace ('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);


    }
}





