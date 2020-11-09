package ru.eit.ps_java.eugenBorisov.lesson5.salary.type.plain;

public class Worker {
    private String fio;
    private int salary;
    private int age;

    public Worker(String fio, int salary, int age) {
        this.fio = fio;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
