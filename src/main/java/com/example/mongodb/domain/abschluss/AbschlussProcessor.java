package com.example.mongodb.domain.abschluss;

import com.example.mongodb.domain.wphg.ChecklisteEntity;
import com.example.mongodb.domain.wphg.ChecklistenRepository;
import com.example.mongodb.domain.wphg.ProzessEntity;
import com.example.mongodb.domain.wphg.ProzessRepository;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AbschlussProcessor {

  private final ProzessRepository prozessRepository;

  private final ChecklistenRepository checklistenRepository;

  private final AbschlussRepository abschlussRepository;


  public void migrateToAbschluss() {

    List<ProzessEntity> allProcesses = prozessRepository.findAll();
    List<ChecklisteEntity> allCheclists = checklistenRepository.findAll();
    AbschlussEntity abschluss = new AbschlussEntity();

    if (!allCheclists.isEmpty() && !allProcesses.isEmpty()) {
      abschluss.setAbschlussCreatedAt(OffsetDateTime.now());
      abschluss.setChecklisteEntity(allCheclists.get(0));
      abschluss.setProzessEntity(allProcesses.get(0));
      abschlussRepository.save(abschluss);
    }
  }

}
