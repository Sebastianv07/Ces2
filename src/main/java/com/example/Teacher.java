package com.example;

public class Teacher {
    private String name;
    private String lastName;
    private String subject;
    private Double salary;
    private String email;

    public Teacher(String name, String lastName, String subject, Double salary, String email) {
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
        this.salary = salary;
        this.email = email;
    }

    public Teacher(){
        name = "Sebastian";
        lastName = "Vargas";
        subject = "Logica";
        salary = 3.0;
        email = "s.vargas@poli.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double calcularSalarioAnual(){
        return this.salary * 12;
    }

    @Override
    public String toString() {
        return "Teacher [El nombre del profesor es=" + name + ", su apellido es=" + lastName + ", dicta la asignatura=" + subject + 
               ", gana este salario=" + salary + ", y su correo es=" + email + "]";
    }
}
