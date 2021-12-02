package hw1;

public class Employee {
    private String name;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Employee: Name = %s, Post = %s, Email = %s, Phone = %d, Salary = %d$, Age = %d.\n", name, post, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }
}
