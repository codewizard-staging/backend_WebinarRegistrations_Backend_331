package com.app.WebinarRegistrations_Backend.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ReferenceOptions{
	    Email,
	    SocialMedia,
	    Website,
	    Referral,
	    Others; 
    public int value(ReferenceOptions referenceOptions) {
        return referenceOptions.ordinal();
    }
    public static ReferenceOptions getReferenceOptions(int ordinal) {
        for(ReferenceOptions referenceOptions : ReferenceOptions.values())
                if(referenceOptions.ordinal() == ordinal)
                        return referenceOptions;
        return null;
    }
}


