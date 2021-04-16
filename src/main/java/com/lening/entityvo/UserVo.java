package com.lening.entityvo;

import com.lening.entity.DeptBean;
import com.lening.entity.UserBean;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创作时间：2021/4/9 14:08
 * 作者：李增强
 */
@Data
public class  UserVo extends UserBean implements Serializable {
    private Long[] deptids;
    private List<DeptBean> dlist;
}
