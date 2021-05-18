package rana.com.dao;

import java.util.List;

import rana.com.models.UserData;

public interface UserDao {
	 public void saveOrUpdate(UserData user);
     
	    public void delete(String email);
	     
	    public UserData get(String email);
	     
	    public List<UserData> list();
}
