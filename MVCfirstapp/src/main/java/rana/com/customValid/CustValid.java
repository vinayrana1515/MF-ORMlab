package rana.com.customValid;


import java.lang.annotation.Target;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CustValidValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustValid {

//	public String value() ;
//		
//		// define default error message
		public String message() default "invalid Pass";
	
	
	// define default groups
		public Class<?>[] groups() default {};
		
		// define default payloads
		public Class<? extends Payload>[] payload() default {};
}
