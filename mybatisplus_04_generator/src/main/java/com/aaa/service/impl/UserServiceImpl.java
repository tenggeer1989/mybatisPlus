package com.aaa.service.impl;

import com.aaa.domain.User;
import com.aaa.dao.UserDao;
import com.aaa.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
}
