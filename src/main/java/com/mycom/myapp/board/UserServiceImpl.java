package com.mycom.myapp.board;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl {
    @Autowired
    UserDAO userDAO;
    public UserVO getUser(UserVO vo) {
        return userDAO.getUser(vo);
    }
}
