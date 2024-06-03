package com.app.WebinarRegistrations_Backend.function;

import com.app.WebinarRegistrations_Backend.model.User;
import com.app.WebinarRegistrations_Backend.enums.ReferenceOptions;
import com.app.WebinarRegistrations_Backend.converter.ReferenceOptionsConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.WebinarRegistrations_Backend.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
