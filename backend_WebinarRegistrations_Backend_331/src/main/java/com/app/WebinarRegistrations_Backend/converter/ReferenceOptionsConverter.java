package com.app.WebinarRegistrations_Backend.converter;

import com.app.WebinarRegistrations_Backend.enums.ReferenceOptions;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ReferenceOptionsConverter implements AttributeConverter<ReferenceOptions, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ReferenceOptions referenceOptions) {
        return referenceOptions != null ? referenceOptions.ordinal() : null;
    }

    @Override
    public ReferenceOptions convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return ReferenceOptions.getReferenceOptions(dbData);
    }
}
