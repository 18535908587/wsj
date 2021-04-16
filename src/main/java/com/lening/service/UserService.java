package com.lening.service;

import com.lening.entity.MeunBean;
import com.lening.entity.UserBean;
import com.lening.utils.Page;

import java.util.List;

/**
 * 创作时间：2021/4/6 10:37
 * 作者：李增强
 */
public interface UserService {
    List<UserBean> getUserList();

    Page<UserBean> getUserListConn(UserBean ub, Integer pageNum, Integer pageSize);

    List<MeunBean> getMeunList();

    UserBean getUserVoById(Long id);

    void saveUserDept(Long id, Long[] deptids);

    UserBean getUserInfo(Long id);

    void saveUserPost(UserBean userBean);

    UserBean getLogin(UserBean ub);
}
