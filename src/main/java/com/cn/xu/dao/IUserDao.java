package com.cn.xu.dao;

import com.cn.xu.pojo.User;

public interface IUserDao {
	
	int insertSelective(User user);
	
	User selectByPrimaryKey(int id);

}
