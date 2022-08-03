package com.NewSpring.RestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NewSpring.RestAPI.Pojo.UserRecord;
import com.NewSpring.RestAPI.Service.UserServiceInterface;

@RestController
public class UserController {

	@Autowired
	private UserServiceInterface UserService;

	@GetMapping("/User")
	private List<UserRecord> getAllUserRecords() {
		return UserService.getAllUserRecords();
	}

	@GetMapping("/User/{Userid}")
	private UserRecord getUserRecordsById(@PathVariable("Userid") int userid) {
		return UserService.getUserRecordsById(userid);
	}

	@DeleteMapping("/User/{Userid}")
	private int DeleteUserRecord(@PathVariable("Userid") int Userid) {
		return UserService.DeleteUserRecord(Userid);

	}

	@PostMapping("/User")
	private UserRecord addUserRecord(@RequestBody UserRecord record) {
		return UserService.addUserRecord(record);

	}

	@PutMapping("/User/{userid}")
	private UserRecord UpdateUserRecord( @RequestBody UserRecord record,@PathVariable("userid") int userid) {
		return UserService.UpdateUserRecord(record, userid);

	}

}
