package com.NewSpring.RestAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NewSpring.RestAPI.Pojo.UserRecord;
@Repository
public interface UserDao extends JpaRepository<UserRecord, Integer> {

}
