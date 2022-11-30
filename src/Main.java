public class Main {
    public static void main(String[] args) {
        String firstName = "Иван";
        String middleName = "Дикарев";
        String lastName = "Сергеевич";
        String fullName = middleName + " " + firstName + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("1 Задание: ФИО сотрудника — " + fullName + "\n2 Задание: Данные ФИО сотрудника для заполнения отчета  — " + fullNameUpper + "\n3 Задание: Данные ФИО сотрудника — " + fullName2);
    }
}