package com.example.mongodb.infrastructure.mongodb;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import org.bson.Document;
import org.springframework.core.convert.converter.Converter;

/**
 * Converts mongo db documents to a {@link OffsetDateTime} object.
 *
 * @author hilker
 */
public class OffsetDateTimeReadConverter implements Converter<Document, OffsetDateTime> {

  /**
   * Converts mongo db documents to a {@link OffsetDateTime} object.
   *
   * @param document The mongo document read from the db.
   * @return The date/time object as Java 8 {@link OffsetDateTime}.
   */
  @Override
  public OffsetDateTime convert(final Document document) {

    final Date date = (Date) document.get("date");
    final String offset = (String) document.get("offset");

    return date.toInstant().atOffset(ZoneOffset.of(offset));
  }

}
