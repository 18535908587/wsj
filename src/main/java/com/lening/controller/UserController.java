package com.lening.controller;

import com.lening.entity.MeunBean;
import com.lening.entity.UserBean;
import com.lening.service.UserService;
import com.lening.utils.Page;
import com.lening.utils.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 创作时间：2021/4/6 10:36
 * 作者：李增强
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/saveUserPost")
    public ResultInfo saveUserPost(@RequestBody UserBean userBean){
        try {
            userService.saveUserPost(userBean);
            return new ResultInfo(true, "编辑成功");
        }catch (Exception e){
            return new ResultInfo(false, "编辑失败");
        }
    }

    /**
     * 去给用户分配职位
     */
    @RequestMapping("/getUserInfo")
    public UserBean getUserInfo(Long id){
        return userService.getUserInfo(id);
    }

    @RequestMapping("/saveUserDept")
    public ResultInfo saveUserDept(Long id,@RequestBody Long[] deptids){
        try {
            userService.saveUserDept(id,deptids);
            return new ResultInfo(true, "编辑成功");
        }catch (Exception e){
            return new ResultInfo(false, "编辑失败");
        }
    }

    /**
     * 去给用户选择部门
     */
    @RequestMapping("/getUserVoById")
    public UserBean getUserVoById(Long id){
        return userService.getUserVoById(id);
    }


    @RequestMapping("/getLogin")
    public ResultInfo getLogin(@RequestBody UserBean ub, HttpServletRequest request){
        UserBean userBean = userService.getLogin(ub);
        if(userBean==null){
            return new ResultInfo(false, "登录失败,用户名或者密码错误");
        }else{
            request.getSession().setAttribute("ub", userBean);
            return new ResultInfo(true, "登录成功");
        }
    }

    @RequestMapping("/getMeunList")
    public List<MeunBean> getMeunList(){
        return userService.getMeunList();
    }

















    @RequestMapping("/getUserList")
    public List<UserBean> getUserList(){

        return userService.getUserList();
    }




    @RequestMapping("/getUserListConn")
    public Page<UserBean> getUserListConn(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "3") Integer pageSize){
        UserBean ub = new UserBean();
        ub.setUname("a");
        ub.setAge(12);
        return userService.getUserListConn(ub,pageNum,pageSize);
    }
}
