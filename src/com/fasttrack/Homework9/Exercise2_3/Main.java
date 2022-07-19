package com.fasttrack.Homework9.Exercise2_3;

public class Main {
    public static void main(String[] args) {

        Employee dude = new Employee("Horia", " Popa");
        dude.setAddress("City: Cluj Napoca, Street: Memorandumului, Number: 18");
        dude.setBirthday(1987, 4, 28);
        dude.setDateOfEmployment(2020, 01, 13);
        System.out.println(dude.toString());
        System.out.println("============================================================================");


        Programmer programmer = new Programmer("ION", "Zapada");
        programmer.setAddress("City: Cluj Napoca, Street: Napoca, Number: 1");
        programmer.setBirthday(1993, 11, 2);
        programmer.setDateOfEmployment(2008, 9, 27);
        programmer.setLanguage("java");
        System.out.println(programmer.toString());
        System.out.println("============================================================================");


        DatabaseAdmin admin = new DatabaseAdmin("Mihai", "Rosu");
        admin.setBirthday(1985, 4, 10);
        admin.setAddress("City: Cluj Napoca, Street: Aleea Peana, Number: 18");
        admin.setDateOfEmployment(2012, 5, 2);
        System.out.println(admin.toString());
        admin.setDbTechnology(" 'SECRET JOB ' ");
        System.out.println(admin.getDbTechnology());
    }
}
