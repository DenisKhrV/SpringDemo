package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;
import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    List<Person> persons = List.of(
            new Person(
                    "Жан",
                    "Рено",
                    "12345",
                    2),
            new Person(
                    "Люк",
                    "Бессон",
                    "54321",
                    3),
            new Person(
                    "Жерар",
                    "Депардье",
                    "41232",
                    0),
            new Driver(
                    "Джейсон",
                    "Стэтхэм",
                    "79824",
                    "3491",
                    2),
            new TruckDriver(
                    "Роберт",
                    "Патрик",
                    "1000",
                    "2345",
                    4)
    );
    List<String> professions = List.of(
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    );

    @Override
    public String getPerson(Integer number) throws BadPersonNumberException {
        final Person person;
        if (number >= persons.size()) {
            throw new BadPersonNumberException("ошибка в том, что номер человека заведомо больше размера массива");
        }
        person = persons.get(number);

        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions.get(person.getProfessionNumber());
        return personDescription;
    }
}
