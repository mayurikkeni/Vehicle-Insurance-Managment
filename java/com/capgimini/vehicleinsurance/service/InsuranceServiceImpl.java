package com.capgimini.vehicleinsurance.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgimini.vehicleinsurance.entity.Insurance;
import com.capgimini.vehicleinsurance.entity.User;
import com.capgimini.vehicleinsurance.entity.Vehicle;
import com.capgimini.vehicleinsurance.exception.InsuranceNotFoundException;
import com.capgimini.vehicleinsurance.repository.InsuranceRepository;
import com.capgimini.vehicleinsurance.repository.UserRepository;
import com.capgimini.vehicleinsurance.repository.VehicleRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	private InsuranceRepository insuranceRepository;
	
	//Invoking  other rep prperties//
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private VehicleRepository vehicleRepository;

	public InsuranceServiceImpl(InsuranceRepository insuranceRepository,UserRepository userRepository, VehicleRepository vehicleRepository) {
		super();
		this.insuranceRepository = insuranceRepository;
		this.vehicleRepository = vehicleRepository;
		this.userRepository = userRepository;

}

	@Override
	public List<Insurance> getAllInsurance() {
		// TODO Auto-generated method stub
		return insuranceRepository.findAll();
	}

	@Override
	public Insurance addInsurance(Insurance insurance) {
		//try {
			//if(insurance.getDescription().isEmpty()||insurance.getDescription().length()==0) {
				//throw new InsuranceNotFoundException("601","Please enter the description, It blank");
			//}
			insuranceRepository.save(insurance);
			// TODO Auto-generated method stub
			return insuranceRepository.save(insurance);
		//} catch (IllegalArgumentException e) {
			//throw new InsuranceNotFoundException("600","given field is null"+e.getMessage());
		//}
		
	
		
	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {
		
		return insuranceRepository.save(insurance);
	}

	

	@Override
	public Insurance getInsuranceById(int ins_id) {
		// TODO Auto-generated method stub
		return insuranceRepository.findById(ins_id).get();
	}

	@Override
	public boolean deleteInsuranceById(int ins_id) {
		insuranceRepository.deleteById(ins_id);
		return false;
	}
// purchase//
	//@Override
	//public void purchaseInsurance(Insurance insurance) {
		//insuranceRepository.save(insurance);
		

		//public Insurance purchaseInsurance(int veh_id,long userId) {
		
	
			
			//Optional<Insurance> insurance=insuranceRepository.findById(veh_id);
			//Insurance insurance=insurance1.get();
			//Insurance insurance=new Insurance();
				//insurance.setPolicyType(insurance.getPolicyType());
				//insurance.setProvider(insurance.getProvider());
				//insurance.setPremium(insurance.getPremium());
				//insurance.setTenure(insurance.getTenure());
			
				//User user=userRepository.findById(userId).get();//storing the object
				//List<User> userList=new ArrayList<>();
				//userList.add(user);
				//insurance.setUserDetails(userList);
				//purchaseInsurance(insurance);
		
		//}
				//return insurance;

	/*@Override
	public Insurance findInsuranceByUserId(long userId) {
		List<Insurance> insuranceList = insuranceRepository.findAll();
		boolean flag=false;
		Iterator<Insurance> insuranceIterator = insuranceList.iterator();
		List<User> user=null;
		Insurance insurance=null;
		while (insuranceIterator.hasNext()) {
			insurance = insuranceIterator.next();
			user  = insurance.getUser();
			if (((User) user).getUserId() == userId) {
				flag = true;
				break;
			}

		}
		if(flag) {
			return insurance;
		}
		else {
			return null;/// have to throw excp //
		}
*/
	
	//}

		

		
		

	}

	

	


