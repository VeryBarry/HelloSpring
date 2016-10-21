package com.theironyard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VeryBarry on 10/21/16.
 */
@RestController
public class HelloSpringRestController {
    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person person(String name, String city, Integer age) {
        if(name == null) {
            name = "Alice";
        }
        if(city == null) {
            city = "Charleston";
        }
        if(age == null) {
            age = 18;
        }
        return new Person(name, city, age);
    }
}
