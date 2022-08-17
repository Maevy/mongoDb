package com.example.mongodb.domain.person;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = PersonEntity.COLLECTION_NAME)
public class PersonEntity {

  public static final String COLLECTION_NAME = "PERSON";

  @Id
  private String id;

  private String firstName;

  private String lastName;

  private CustomerEntity customerEntity;

}
