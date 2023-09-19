package pro.sky.skyprospringdemo.domain;

public class Person {
    private String name;
    private String surname;
    private String passport;

    public Person(String name, String surname, String passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassport() {
        return passport;
    }

    public void changePassportNumber(String passport) {
        if (passport != null && !passport.isBlank()) {
            this.passport = passport;
        }
    }
}
