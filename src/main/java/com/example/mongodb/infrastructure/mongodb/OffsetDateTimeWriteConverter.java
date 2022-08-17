package com.example.mongodb.infrastructure.mongodb;

import com.mongodb.BasicDBObject;
import java.time.OffsetDateTime;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

/**
 * Converts a Java 8 {@link OffsetDateTime} to a mongo document.
 *
 * @author hilker
 */
public class OffsetDateTimeWriteConverter implements Converter<OffsetDateTime, Object> {

  /**
   * Converts a Java 8 {@link OffsetDateTime} to a mongo document.
   *
   * @param offsetDateTime The Java 8 {@link OffsetDateTime} object to be persisted.
   * @return The mongo compatible object to write into the db.
   */
  @Override
  public BasicDBObject convert(final OffsetDateTime offsetDateTime) {

    final Date date = Date.from(offsetDateTime.toLocalDateTime().toInstant(offsetDateTime.getOffset()));
    final String offset = offsetDateTime.getOffset().toString();

    final BasicDBObject basicDBObject = new BasicDBObject();
    basicDBObject.put("date", date);
    basicDBObject.put("offset", offset);

    return basicDBObject;
  }
}
