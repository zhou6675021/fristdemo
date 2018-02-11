package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author hbwxz
 *
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 测试用例
     * @return
     */
    @Select("SELECT * FROM user where id = 1021")
    User menus();
}
