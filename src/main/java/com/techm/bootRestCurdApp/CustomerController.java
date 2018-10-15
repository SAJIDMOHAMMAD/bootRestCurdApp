package com.techm.bootRestCurdApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/bootRestCURDApp")
public class CustomerController {
	@Autowired
	private CustomerRepository repository;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<CustomerDetails> getAllPersons() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public CustomerDetails getPersonById(@PathVariable("id") int id) {
		return repository.findBy_id(id);
	}
	
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public CustomerDetails createPerson(@RequestBody  CustomerDetails personDetails) {
		List<CustomerDetails> personsList = repository.findAll();
		if(!personsList.isEmpty()) {
			personDetails.set_id(personsList.get(personsList.size()-1).get_id()+1);
		} else {
			personDetails.set_id(1);
		}
	    repository.save(personDetails);
	    return personDetails;
	}
	
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public boolean modifyPersonById(@PathVariable("id") int id, @RequestBody CustomerDetails personDetails) {
		personDetails.set_id(id);
		repository.save(personDetails);
		return true;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public boolean deletePersonById(@PathVariable int id) {
	    repository.delete(repository.findBy_id(id));
	    return true;
	}
	
}