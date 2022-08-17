package com.example.mongodb.domain.person;

import com.example.mongodb.rest.ui.model.Person;
import com.example.mongodb.rest.ui.model.Recipient;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonProcessor {

  private final PersonRepository personRepository;

  public Person createPerson(Recipient recipient) {

    PersonEntity personToSave = new PersonEntity();
    personToSave.setFirstName(recipient.getFirstName());
    personToSave.setLastName(recipient.getLastName());

    if (recipient.getCompany() != null) {
      CustomerEntity customerEntity = new CustomerEntity();
      customerEntity.setCompanyName(recipient.getCompany());
    }

    LariFari lariFari = new LariFari();
    lariFari.setLariFariString("OMG");

    personRepository.save(personToSave);

    return new Person();
  }


}
