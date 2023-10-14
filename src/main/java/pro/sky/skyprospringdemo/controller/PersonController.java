package pro.sky.skyprospringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/person/by-passport")
    public String getPersonInfo(@RequestParam("passport") String passport) {
        return personService.getPersonByPassport(passport);
    }

    @GetMapping(path = "/person/add")
    public String addPerson(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            @RequestParam("passport") String passport,
                            @RequestParam("profession") Integer profession) {
        Person person = new Person(name, surname, passport, profession);
        personService.addPerson(person);
        return "Person added";
    }

    @GetMapping(path = "/person/profession/add")
    public String addProfession(@RequestParam("passport") String passport,
                                @RequestParam("profession") Integer profession) {
        personService.addProfession(passport, profession);
        return "Профессия успешно добавлена";
    }

    @GetMapping(path = "/persons/by-profession")
    public String getByProfession(@RequestParam("profession") int profession) {
        final List<Person> personsByProfession = personService.getPersonsByProfession(profession);
//        String forPassport = null;
//        for (final Person person : personsByProfession) {
//            final String passport = person.getPassport();
//            if (passport.startsWith("4")) {
//                forPassport ="~" + person.getPassport() + "~";
//            }
//        }
//        if (forPassport == null) {
//            throw new RuntimeException("Person not found");
//        }


//        personsByProfession.forEach(person -> {
//            passports.add(person.getPassport());
//        });


//        List<String> streamPassports = personsByProfession.stream().map((Person person) -> {
//            return person.getPassport();
//        }).collect(Collectors.toList());
        final Optional<String> passport = personsByProfession.stream()
                .map(person -> person.getPassport())
                .filter(p -> p.startsWith("4"))
                .map((p -> "~" + p + "~"))
                .findAny()
                ;

        return passport.orElseThrow(() -> new RuntimeException("Person not found"));
    }
}
