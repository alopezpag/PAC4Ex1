package edu.uoc.pac4;

import java.time.LocalDate;

public class SuperStar {
    public static final int BIRTH_NAME_MIN_LENGTH = 1;
    public static final int BIRTH_NAME_MAX_LENGTH = 60;
    public static final int BIRTHPLACE_NAME_MIN_LENGTH = 1;
    public static final int BIRTHPLACE_NAME_MAX_LENGTH = 80;
    public static final int RING_NAME_MIN_LENGTH = 1;
    public static final int RING_NAME_MAX_LENGTH = 60;
    public static final int HEIGHT_MIN_VALUE = 100;
    public static final int HEIGHT_MAX_VALUE = 30;

    private String birthName = "Anonymous";
    //private LocalDate birthDate = "New York";
    private LocalDate birthDate = LocalDate.parse("New York");
    private String birthPlace;
    private double height = 168;
    private double width = 54;
    private String ringName = "Superstar";
}
