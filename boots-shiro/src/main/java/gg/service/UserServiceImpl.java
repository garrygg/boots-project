package gg.service;

import gg.dao.UserRepository;
import gg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

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
}
