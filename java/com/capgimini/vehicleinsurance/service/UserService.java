package com.capgimini.vehicleinsurance.service;

import java.util.List;

import com.capgimini.vehicleinsurance.entity.Insurance;
import com.capgimini.vehicleinsurance.entity.User;
import com.capgimini.vehicleinsurance.exception.UserNoTFoundException;

public interface UserService {
	/*List<User> findByName(String name);*/
	List<User> getAlluser();
public User addUser(User user);
public User validateUser(String username,  String password)throws UserNoTFoundException;

public User edituser(User user);
public boolean deleteuser(int  userid);
//Object findById(long userId);
}