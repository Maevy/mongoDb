package com.example.mongodb.domain.wphg;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "WPHG_CHECKLISTE")
@Entity
@Data
public class ChecklisteEntity {

  @Id
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE
  )
  private Long id;

  @Column(name = "name")
  private String name;



}
