package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

public interface PersonService {

    void addPerson(Person person);

    String getPersonByPassport(String passport);

    void addProfession(String passport, Integer profession);
}
