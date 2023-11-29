package edu.uoc.pac4;

import java.time.LocalDate;

public class Superstar {
    public static final int BIRTH_NAME_MIN_LENGTH = 1;
    public static final int BIRTH_NAME_MAX_LENGTH = 60;
    public static final int BIRTHPLACE_MIN_LENGTH = 1;
    public static final int BIRTHPLACE_MAX_LENGTH = 80;
    public static final int RING_NAME_MIN_LENGTH = 1;
    public static final int RING_NAME_MAX_LENGTH = 60;
    public static final int HEIGHT_MIN_VALUE = 100;
    public static final int WEIGHT_MIN_VALUE = 30;

    private String birthName = "Anonymous";
    //private LocalDate birthDate = "New York";
    private LocalDate birthDate = LocalDate.parse("New York");
    private String birthPlace;
    private double height = 168;
    private double weight = 54;
    private String ringName = "Superstar";
    private Gender gender = Gender.FEMALE;

    public Superstar() {}

    public Superstar(String birthName, LocalDate birthDate, String birthPlace, double height, double weight, String ringName) {

    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRingName() {
        return ringName;
    }

    public void setRingName(String ringName) {
        this.ringName = ringName;
    }

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }*/
}
