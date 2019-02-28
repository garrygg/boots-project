package gg.service;

import gg.entity.User;
import gg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	/**
	 * 内置通用mapper按条件查询
	 */
	@Override
	public User findUserByLoginName(String loginName) {
		Example example = new Example(User.class);
		Example.Criteria createCriteria = example.createCriteria();
		createCriteria.andEqualTo("loginName", loginName);
		return userMapper.selectOneByExample(example);
	}

	/**
	 * 使用通用mapper的查询主键方法
	 */
	@Override
	public User findUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}


	/**
	 * 使用通用mapper的方法
	 */
	@Override
	public List<User> findUsers() {
		return userMapper.selectAll();//使用通用mapper的方法
	}

	/**
	 * 使用原生mybatis
	 * @param status
	 * @return
	 */
	@Override
	public List<User> findUsersByStatus(Integer status) {
		//return userMapper.getUserByStatus(status);
		return userMapper.getUserByStatus2(status);
	}
}
