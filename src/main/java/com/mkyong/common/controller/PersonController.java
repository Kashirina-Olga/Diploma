package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import ru.rsreu.tc.tracker.entity.Person;

@Controller
public class PersonController {

	@RequestMapping(value = {"name","lastname"}, method = RequestMethod.GET)
	public @ResponseBody
	Person getPersonInJSON(@PathVariable String name, @PathVariable String lastname) {
		Person person = new Person();
		person.setName(name);
		person.setLastname(lastname);
	
		return person;
	}
}
