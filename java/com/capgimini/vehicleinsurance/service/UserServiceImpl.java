package com.capgimini.vehicleinsurance.service;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.capgimini.vehicleinsurance.entity.User;

import com.capgimini.vehicleinsurance.exception.UserNoTFoundException;
/*import com.capgimini.vehicleinsurance.repository.InsuranceRepository;*/
import com.capgimini.vehicleinsurance.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userrpository) {
		super();
		this.userRepository = userrpository;
	}

	@Override
	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		userRepository.save(user);
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User edituser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteuser(int userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User validateUser(String userName, String userPassword) throws UserNoTFoundException {
		
		//try {
		User user = userRepository.findByUserNameAndUserPassword(userName, userPassword);
         
    	System.out.print(user+" "+ userName+" "+userPassword );
    	if(user==null) {
    		throw  new UserNoTFoundException("UserIsNotPresent");
    	}
    	
		return user;
		}
    	
	//catch (InvalidUsernameorPasswordException exp) {
		//throw new InvalidUsernameorPasswordException ("Invalid UserName and Password" );
	//}
	}
			      

		
	
	
	

	

