package gg.controller;

import com.github.pagehelper.PageInfo;
import gg.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String welcome(Map map) {
		return "/loginpage";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "/loginpage";
	}

	@PostMapping("/dologin")
	public String doLogin(String login_name, String password, boolean rememberMe) {
		//添加用户认证信息
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
				login_name, password);
		//进行验证，这里可以捕获异常，然后返回对应信息
		try {
			subject.login(usernamePasswordToken);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		return "redirect:/user_list";
	}

	@GetMapping("/user_list")
	@RequiresRoles("admin")
	public String listUser(Map map) {
		List list = userService.findUsers();
		map.put("users", list);
		return "/user_list";
	}

	/*
	mybatis查询
	 */
	@GetMapping("/json/users")
	@RequiresRoles("admin")
	public @ResponseBody
	PageInfo listUser() {
		return new PageInfo(userService.findByPage(1, 5));
	}

	@GetMapping("/logout")
	@ResponseBody
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "logout !";
	}

}
