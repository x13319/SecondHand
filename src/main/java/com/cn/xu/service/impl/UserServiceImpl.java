package com.cn.xu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.xu.dao.IUserDao;
import com.cn.xu.pojo.User;
import com.cn.xu.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDao;

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(id);
	}

}
