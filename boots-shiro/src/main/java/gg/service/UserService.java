package gg.service;

import gg.entity.User;

import java.util.List;

public interface UserService {

	User findUserByLoginName(String loginName);

	User findUserById(Integer id);

	List<User> findUsers();

	List<User> findByPage(int pageNum, int size);
}
