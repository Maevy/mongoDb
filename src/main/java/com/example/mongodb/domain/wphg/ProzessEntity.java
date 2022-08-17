package com.example.mongodb.domain.wphg;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "WPHG_PROZESS")
@Data
public class ProzessEntity {

  @Id
  private Long id;

  @Column(name = "created_date")
  private LocalDateTime createdDate;

  @Column(name = "deleted_date")
  private LocalDateTime deletedDate;

  @Column(name = "name")
  private String name;

}
