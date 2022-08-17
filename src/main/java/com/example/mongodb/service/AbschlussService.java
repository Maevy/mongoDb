package com.example.mongodb.service;

import com.example.mongodb.domain.abschluss.AbschlussProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AbschlussService {

  private final AbschlussProcessor abschlussProcessor;

  public void migrateAbschluss() {
    abschlussProcessor.migrateToAbschluss();
  }

}
