package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: Userdao
 * Package: com.itheima.dao
 * Description:
 *
 * @Author: tge
 * @Create: 2023/11/12 - 20:49
 * Version:
 */

@Mapper
public interface UserDao extends BaseMapper<User> {

}
