package com.lening.service;

import com.lening.entity.MeunBean;

import java.util.List;

/**
 * 创作时间：2021/4/8 13:51
 * 作者：李增强
 */
public interface MeunService {
    List<MeunBean> getMeunListByPid(Long pid);

    void saveMeun(MeunBean meunBean);

    void deleteMeunById(Long id);
}
