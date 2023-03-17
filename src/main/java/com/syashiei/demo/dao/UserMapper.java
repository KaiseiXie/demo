package com.syashiei.demo.mapper;

import com.syashiei.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT*FROM user WHERE id = #{id}")
    User selectById(int id);
}
