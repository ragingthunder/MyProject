package com.tongxing.portal.dao;

import com.tongxing.modules.mybatis.MyBatisRepository;
import com.tongxing.portal.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@MyBatisRepository
public interface UserDao {
	
	@Select("select * from user")
	List<User> findAll();
}
