package com.gura.spring05.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.users.dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao{
	
	//핵심 의존 객체(DI)
	@Autowired
	private SqlSession session;
	
	@Override
	public void updateProfile(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isExist(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePwd(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsersDto getData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid(UsersDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

}
