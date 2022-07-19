package com.fasttrack.Homework9.Exercise2_3;

import java.time.LocalDate;

public interface Person {

    String getPosition();

    public String getFirstName();

    public String getLastName();

    public LocalDate getBirthday();

    public String getAddress();

    LocalDate getDateOfEmployment();

    String completeName();
}

