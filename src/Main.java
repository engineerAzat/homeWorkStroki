public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask1\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("\nTask2\n");
        System.out.print("Данные Ф.И.О. сотрудника для заполнения отчета - ");
        System.out.println(fullName.toUpperCase());

        System.out.println("\nTask3\n");
        fullName = "Иванов Семён Семёнович";
        String nameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + nameTrue);


    }
}