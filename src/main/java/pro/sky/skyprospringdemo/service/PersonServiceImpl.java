package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.domain.TruckDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345",
            new Person(
                    "Жан",
                    "Рено",
                    "12345",
                    2),
            "54321",
            new Person(
                    "Люк",
                    "Бессон",
                    "54321",
                    3),
            "41232",
            new Person(
                    "Жерар",
                    "Депардье",
                    "41232",
                    0),
            "79824",
            new Driver(
                    "Джейсон",
                    "Стэтхэм",
                    "79824",
                    "3491",
                    2),
            "1000",
            new TruckDriver(
                    "Роберт",
                    "Патрик",
                    "1000",
                    "2345",
                    4)
    ));
    List<String> professions = List.of(
            "безработный",
            "водитель",
            "плотник",
            "столяр",
            "актёр"
    );

    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }

    @Override
    public String getPersonByPassport(String passport) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + getProfessionNames(person.getProfessionNumbers());
        return personDescription;
    }

    private String getProfessionNames(Set<Integer> professionNumbers) {
        String result = "";
        for (Integer professionNumber : professionNumbers) {
            result = result + " " + professions.get(professionNumber);
        }
        return result;
    }

    @Override
    public void addProfession(String passport, Integer profession) {
        final Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден");
        }
        person.getProfessionNumbers().add(profession);
    }
}
