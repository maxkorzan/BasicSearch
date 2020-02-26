package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index(Model model){
        //create a person
        Person person1 = new Person();
        person1.setName("Rey");
        person1.setAge("28");
        person1.setHeight("5'11\"");
        personRepository.save(person1);

        Person person2 = new Person();
        person2.setName("Carlos");
        person2.setAge("32");
        person2.setHeight("5'10\"");
        personRepository.save(person2);

        //pull from repository --> model as "people" arraylist --> html template "index"
        model.addAttribute("people", personRepository.findAll());
        return "index";
    }
}
