package com.fasttrack.Homework9.Exercise2_3;

import java.time.LocalDate;

public class Employee implements Person {
    private LocalDate dateOfEmployment;
    private String position;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setBirthday(int year, int month, int dayOfMonth) {

        this.birthday = LocalDate.of(year, month, dayOfMonth);
    }


    public void setDateOfEmployment(int year, int month, int dayOfMonth) {

        this.dateOfEmployment = LocalDate.of(year, month, dayOfMonth);
    }

    @Override
    public String getPosition() {
        return position;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String completeName() {
        return getFirstName() + getLastName();
    }

    public int age() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int birthYear = (getBirthday()).getYear();
        int birthMonth = (getBirthday()).getMonthValue();
        int birthDay = (getBirthday()).getDayOfMonth();
        int age = 0;
        if (month < birthMonth) {
            age = year - birthYear - 1;
        } else if (month > birthMonth) {
            age = year - birthYear;
        } else if (month == birthMonth) {
            if (day < birthDay) {
                age = year - birthYear - 1;
            } else {
                age = year - birthYear;
            }
        }
        return age;
    }

    @Override
    public String toString() {
        return "Employee: " + getPosition() + "\n" +
                "         First Name: " + firstName + "\n" +
                "         Last Name: " + lastName + "\n" +
                "         Birthday: " + birthday + "\n" +
                "         Age: " + age() + "\n" +
                "         Address: " + getAddress() + "\n" +
                "         Date of Employment= " + dateOfEmployment;
    }
}
