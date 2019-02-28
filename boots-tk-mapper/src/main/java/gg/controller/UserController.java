package gg.controller;

import gg.entity.User;
import gg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserService userService;

	@GetMapping("/user_list")
	public List userList() {
		return userService.findUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Integer id){
		return userService.findUserById(id);
	}

	@GetMapping("/getByName")
	public User getUserByLoginName(@RequestParam String loginName){
		return userService.findUserByLoginName(loginName);
	}

	@GetMapping("/user_list2")
	public List userList(Integer status){
		return userService.findUsersByStatus(status);
	}
}
