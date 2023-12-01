package edu.uoc.pac4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

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
    private String birthplace;
    private Gender gender;
    private double height = 168;
    private double weight = 54;
    private String ringName;

    public Superstar() throws SuperstarException {
        birthName = "Anonymous";
        birthDate = LocalDate.now().minus(Period.ofDays(1));
        birthplace = "New York";
        gender = Gender.FEMALE;
        height = 168;
        weight = 54;
        ringName = "Superstar";
    }

    public Superstar(String birthName, LocalDate birthDate, String birthplace, Gender gender, double height, double weight, String ringName) throws SuperstarException {
        setBirthName(birthName);
        setBirthDate(birthDate);
        setBirthplace(birthplace);
        setGender(gender);
        setHeight(height);
        setWeight(weight);
        setRingName(ringName);
    }

    public String getBirthName() {
        return birthName;
    }

    public void setBirthName(String birthName) throws SuperstarException {
        if (birthName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NULL);
        }
        String buffer = birthName.trim();
        // if (birthName.length().isEmpty) també seria correcte
        if (buffer.length() < BIRTH_NAME_MIN_LENGTH || buffer.length() > BIRTH_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_LENGTH);
        }

        for (char c : birthName.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_NAME_NUMBERS);
            }
        }

        this.birthName = buffer;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) throws SuperstarException {
        if (birthDate == null || !birthDate.isBefore(LocalDate.now())) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTH_DATE);
        } else {
            this.birthDate = birthDate;
        }
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthPlace) throws SuperstarException {
        if (birthPlace == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTHPLACE_NULL);
        }

        int strLen = birthPlace.trim().length();

        if (strLen < BIRTHPLACE_MIN_LENGTH || strLen > BIRTHPLACE_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_BIRTHPLACE_LENGTH);
        }

        this.birthplace = birthPlace.trim();
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

    public void setHeight(double height) throws SuperstarException {
        if (height <= HEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_HEIGHT);
        }

        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws SuperstarException {
        if (weight <= WEIGHT_MIN_VALUE) {
            throw new SuperstarException(SuperstarException.MSG_ERR_WEIGHT);
        }

        this.weight = weight;
    }

    public String getRingName() {
        return ringName;
    }

    public void setRingName(String ringName) throws SuperstarException {
        if (ringName == null) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_NULL);
        }

        int numChars = ringName.trim().length();
        if (numChars < RING_NAME_MIN_LENGTH || numChars > RING_NAME_MAX_LENGTH) {
            throw new SuperstarException(SuperstarException.MSG_ERR_RING_NAME_LENGTH);
        }

        this.ringName = ringName.trim();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Superstar other = (Superstar) obj;
        return Objects.equals(this.birthName, other.birthName) &&
                Double.compare(this.height, other.height) == 0 &&
                Double.compare(this.weight, other.weight) == 0 &&
                Objects.equals(this.birthDate, other.birthDate);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String formattedDate = birthDate != null ? birthDate.format(formatter) : "N/A";
        return ringName.toUpperCase() + "\n\t" +
                "Birth name: " + (birthName != null ? birthName : "N/A") + "\n\t" +
                "Born: " + formattedDate + "\n\t      " +
                (birthplace != null ? birthplace : "N/A");
    }
}