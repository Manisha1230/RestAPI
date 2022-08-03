package com.NewSpring.RestAPI.Service;

import java.util.List;

import com.NewSpring.RestAPI.Pojo.UserRecord;

public interface UserServiceInterface {
  public List<UserRecord> getAllUserRecords();
  
  public UserRecord getUserRecordsById(int Userid);
  
  public int DeleteUserRecord(int Userid);
  
  public UserRecord addUserRecord(UserRecord userRecord);
  
  public UserRecord UpdateUserRecord( UserRecord userRecord,int Userid);
}
