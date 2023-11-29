package edu.uoc.pac4;

import java.time.LocalDate;
import java.time.Period;

public class Superstar {
    public static final int BIRTH_NAME_MIN_LENGTH = 1;
    public static final int BIRTH_NAME_MAX_LENGTH = 60;
    public static final int BIRTHPLACE_MIN_LENGTH = 1;
    public static final int BIRTHPLACE_MAX_LENGTH = 80;
    public static final int RING_NAME_MIN_LENGTH = 1;
    public static final int RING_NAME_MAX_LENGTH = 60;
    public static final int HEIGHT_MIN_VALUE = 100;
    public static final int WEIGHT_MIN_VALUE = 30;

    private String birthName;
    private LocalDate birthDate;
    private String birthPlace;
    private Gender gender;
    private double height = 168;
    private double weight = 54;
    private String ringName;

    public Superstar() {
        birthName = "Anonymous";
        birthDate = LocalDate.now().minus(Period.ofDays(1));
        gender = Gender.FEMALE;
        height = 168;
        weight = 54;
        ringName = "Superstar";
    }

    public Superstar(String birthName, LocalDate birthDate, String birthPlace, double height, double weight, String ringName) {
        try {
            setBirthName(birthName);
            setBirthDate(birthDate);
            setGender(gender);
            setHeight(height);
            setWeight(weight);
            setRingName(ringName);
        } catch (Exception e) {
            System.out.println("test " + e.getMessage());
        }
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) throws SuperstarException {
        if (birthName.length() < BIRTH_NAME_MIN_LENGTH || birthName.length() > BIRTH_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_LENGTH);
        }

        for (char c : birthName.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NUMBERS);
            }
        }

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
