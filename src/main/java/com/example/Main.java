package com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Oscar", "Mesa", "Ces3", 3.5, "o.mesa@poli.com");
        Teacher teacher3 = new Teacher();        
        Teacher teacher4 = new Teacher("Mario", "Bros", "BD", 2.5, "m.bros@poli.com");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " " + teacher.getLastName() + " tiene un su salario de : $ " + teacher.calcularSalarioAnual() + " Millones al año");
        }
    }
}

