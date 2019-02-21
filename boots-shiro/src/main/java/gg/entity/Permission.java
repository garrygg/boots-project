package gg.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "t_permission")
@Entity
@Getter
@Setter
public class Permission implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "permission")
	private String permission;

	@ManyToMany(mappedBy = "permissions")
	private List<Role> roles;

	@Override
	public String toString() {
		return "Permission{" +
				"id=" + id +
				", permission='" + permission + '\'' +
				'}';
	}
}
