package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

import java.util.List;

public interface PersonService {

    List<Person> getPersonsByProfession(Integer professionNumber);

    List<Person> getPersonsByProfessions(List<Integer> professionNumbers);

    void addPerson(Person person);

    String getPersonByPassport(String passport);

    void addProfession(String passport, Integer profession);
}
