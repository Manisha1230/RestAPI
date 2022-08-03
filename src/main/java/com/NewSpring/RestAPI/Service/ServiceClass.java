package com.NewSpring.RestAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewSpring.RestAPI.Dao.UserDao;
import com.NewSpring.RestAPI.Pojo.UserRecord;

@Service
public class ServiceClass implements UserServiceInterface {

	@Autowired
	private UserDao userDao;

//get all user record
	@Override
	public List<UserRecord> getAllUserRecords() {

		return userDao.findAll();
	}

//get user record by Id
	@Override
	public UserRecord getUserRecordsById(int Userid) {

		return userDao.findById(Userid).orElseThrow(null);
	}

//Delete userRecord by Id
	@Override
	public int DeleteUserRecord(int Userid) {

		UserRecord entity = userDao.getOne(Userid);
		userDao.delete(entity);
		return Userid;
	}

//Add new record
	@Override
	public UserRecord addUserRecord(UserRecord userRecord) {

		return userDao.save(userRecord);
	}
public UserRecord UpdateUserRecord(UserRecord userRecord, int userid) {
		UserRecord x = new UserRecord();
		x.setId(userRecord.getId());
		x.setName(userRecord.getName());
		x.setEmail(userRecord.getEmail());
		return 	userDao.save(x);
	}

}
