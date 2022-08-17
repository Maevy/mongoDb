package com.example.mongodb.ui;

import com.example.mongodb.rest.ui.AbschlussApiDelegate;
import com.example.mongodb.service.AbschlussService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AbschlussDelegateImpl implements AbschlussApiDelegate {

  private final AbschlussService abschlussService;

  @Override
  public ResponseEntity<Void> migrate() {
    abschlussService.migrateAbschluss();
    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
