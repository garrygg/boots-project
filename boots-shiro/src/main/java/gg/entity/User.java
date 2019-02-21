package gg.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "t_user")
@Entity
@Getter
@Setter
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="login_name")
	private String loginName;

	@Column(name="nickname")
	private String nickname;

	@Column(name="password")
	private String password;
	@Column(name="age")
	private String age;
	@Column(name="status")
	private Integer status;

	@ManyToMany
	@JoinTable(name = "r_user_role",joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", loginName='" + loginName + '\'' +
				", nickname='" + nickname + '\'' +
				", password='" + password + '\'' +
				", age='" + age + '\'' +
				", status=" + status +
				", roles=" + roles +
				'}';
	}
}
