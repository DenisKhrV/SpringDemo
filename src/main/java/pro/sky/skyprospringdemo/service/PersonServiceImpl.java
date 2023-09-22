package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

@Service
public class PersonServiceImpl implements PersonService {
    Person[] persons = {
            new Person(
                    "Жан",
                    "Рено",
                    "12345",
                    2), new Person(
            "Люк",
            "Бессон",
            "54321",
            3), new Person(
            "Жерар",
            "Депардье",
            "41232",
            0), new Driver(
            "Джейсон",
            "Стэтхэм",
            "79824",
            "3491",
            2), new TruckDriver(
            "Роберт",
            "Патрик",
            "1000",
            "2345",
            4)
    };
    String[] professions = {
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= persons.length) {
            return null;
//            throw new BadPersonNumberException("ошибка в том, что номер человека заведомо больше размера массива");
        }
        person = persons[number];

        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions[person.getProfessionNumber()];
        return personDescription;
    }
}
