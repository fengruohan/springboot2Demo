package com.example.mapper;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.example.pojo.User;




/**
 * 访问数据库的接口
 * @author 86182
 *
 */
public interface UserMapper {
	
	@Insert("INSERT INTO user(age,name,pwd,create_time) values (#{age},#{name},#{pwd},#{creatTime})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")//keyProperty java 属性，keyColumn 数据库中的属性
	int insert(User user);
}
