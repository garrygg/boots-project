package gg.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	 List findUsersByPage();
}
