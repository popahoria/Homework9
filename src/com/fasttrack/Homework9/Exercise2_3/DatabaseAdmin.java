package com.fasttrack.Homework9.Exercise2_3;

public class DatabaseAdmin extends Employee {

    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void setDbTechnology(String dbTechnology){
        this.dbTechnology = dbTechnology;
    }
    public String getDbTechnology(){
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin ," + super.getAddress();
    }

    public String getPosition() {
        return " 'SECRET JOB' " + getDbTechnology();
    }
}
