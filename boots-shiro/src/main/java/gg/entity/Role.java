package gg.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name = "t_role")
@Entity
@Getter
@Setter
public class Role implements Serializable {

	/**
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "status")
	private Integer status;
	@Column(name = "edit_time")
	private Date editTime;

	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	@ManyToMany
	@JoinTable(name = "r_role_permission",joinColumns = @JoinColumn(name = "role_id"),
			inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private List<Permission> permissions;

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", roleName='" + roleName + '\'' +
				", status=" + status +
				", editTime=" + editTime +
				", permissions=" + permissions +
				'}';
	}
}
