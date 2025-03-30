package br.com.dio.persistence.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.time.OffsetDateTime;
import java.sql.Timestamp;

@Converter(autoApply = true)
public class OffsetDateTimeConverter implements AttributeConverter<OffsetDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(OffsetDateTime offsetDateTime) {
        return (offsetDateTime == null) ? null : Timestamp.valueOf(offsetDateTime.toLocalDateTime());
    }

    @Override
    public OffsetDateTime convertToEntityAttribute(Timestamp timestamp) {
        return (timestamp == null) ? null : timestamp.toInstant().atOffset(OffsetDateTime.now().getOffset());
    }
}
