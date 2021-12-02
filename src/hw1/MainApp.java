package hw1;

public class MainApp {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("nikita", "programmer", "Nikita@mail.ru", 79784, 15000, 25);
        employees[1] = new Employee("sasha", "teacher", "sasha@mail.ru", 12345, 22000, 30);
        employees[2] = new Employee("will", "driver", "will@mail.ru", 56768, 12000, 42);
        employees[3] = new Employee("mak", "seller", "mak@mail.ru", 23634, 10000, 41);
        employees[4] = new Employee("bryan", "manager", "bryan@mail.ru", 98754, 17000, 26);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}

