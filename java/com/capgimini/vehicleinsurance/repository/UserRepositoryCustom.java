package com.capgimini.vehicleinsurance.repository;

import com.capgimini.vehicleinsurance.entity.User;

public interface UserRepositoryCustom {
	 User findUser(String username, String password);

}
