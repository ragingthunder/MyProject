package com.tongxing.portal.action;

import com.tongxing.portal.dao.UserDao;
import com.tongxing.portal.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/protal")
public class UserAction {
	
	@Resource
	private UserDao userDao;
	
	@RequestMapping("user")
	@ResponseBody
	public String user(){
		List<User>  users = userDao.findAll();
		return users.get(0).getName();
	}
}
