package com.example.mongodb.ui;

import com.example.mongodb.domain.person.PersonProcessor;
import com.example.mongodb.rest.ui.PersonApiDelegate;
import com.example.mongodb.rest.ui.model.Person;
import com.example.mongodb.rest.ui.model.Recipient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonDelegateImpl implements PersonApiDelegate {

  private final PersonProcessor personProcessor;

  @Override
  public ResponseEntity<Person> putPerson(Recipient recipient) {
   return ResponseEntity.status(HttpStatus.OK).body(personProcessor.createPerson(recipient));
  }
}
