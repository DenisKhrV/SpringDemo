package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

public interface PersonService {
    public String getPerson(Integer number) throws BadPersonNumberException;

    void addPerson(Person person);
}
