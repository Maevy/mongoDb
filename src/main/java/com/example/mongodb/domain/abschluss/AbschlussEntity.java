package com.example.mongodb.domain.abschluss;


import com.example.mongodb.domain.wphg.ChecklisteEntity;
import com.example.mongodb.domain.wphg.ProzessEntity;
import java.time.OffsetDateTime;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = AbschlussEntity.COLLECTION_NAME)
public class AbschlussEntity {

  public static final String COLLECTION_NAME = "ABSCHLUSS";

  private String id;

  private OffsetDateTime abschlussCreatedAt;

  private ChecklisteEntity checklisteEntity;

  private ProzessEntity prozessEntity;

}
