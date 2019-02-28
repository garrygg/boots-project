package gg.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "t_user")
public class User implements Serializable {
	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="login_name")
	private String loginName;

	@Column(name="nickname")
	private String nickname;

	@Column(name="password")
	private String password;

	@Column(name="age")
	private Integer age;

	@Column(name="status")
	private Integer status;


}
