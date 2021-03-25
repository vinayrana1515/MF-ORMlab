package aopDemo;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {

	public void addAccount() 
	{
		System.out.println("In add account");
	}

}