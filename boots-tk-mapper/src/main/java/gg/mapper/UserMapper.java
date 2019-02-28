package gg.mapper;

import gg.base.BaseMapper;
import gg.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

	/**
	 * xml查询
	 * @param status
	 * @return
	 */
	List<User> getUserByStatus(Integer status);

	/**
	 * 注解查询
	 */
	@Select("select id, login_name,nickname,password, age,status from t_user where status = #{status}")
	List<User> getUserByStatus2(Integer status);
}
