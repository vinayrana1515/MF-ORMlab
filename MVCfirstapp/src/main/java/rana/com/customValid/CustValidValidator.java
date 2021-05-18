package rana.com.customValid;
import rana.com.customValid.*;


import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustValidValidator implements ConstraintValidator<CustValid, String> {

	private String passPrefix;
//	@Override
//	public void initialize(CustValid thePass) {
//		// TODO Auto-generated method stub
//		passPrefix = thePass.value();
//		System.out.println(passPrefix);
//	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
//		value=passPrefix;
		Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
		return value != null  && (value.length() > 8) && Character.isUpperCase(value.charAt(0))&& regex.matcher(value).find();
	}
	
	
}
