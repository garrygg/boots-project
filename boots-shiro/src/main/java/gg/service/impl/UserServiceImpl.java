package gg.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import gg.dao.UserRepository;
import gg.entity.User;
import gg.mapper.UserMapper;
import gg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByLoginName(String loginName) {
		return userRepository.findUserByLoginName(loginName);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> findUsers() {
		return userRepository.findAll();
	}


	/**
	 * mybatis查询
	 * @param pageNum
	 * @param size
	 * @return
	 */
	@Override
	public List findByPage(int pageNum, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, size);
		return userMapper.findUsersByPage();
	}
}
