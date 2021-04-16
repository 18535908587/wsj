package com.lening.service;

import com.lening.entity.MeunBean;
import com.lening.entity.PostBean;
import com.lening.utils.Page;

import java.util.List;

/**
 * 创作时间：2021/4/8 9:36
 * 作者：李增强
 */
public interface PostService{
    Page<PostBean> getPostListConn(PostBean postBean, Integer pageNum, Integer pageSize);

    List<MeunBean> getMeunListById(Long id);

    void savePostMeun(Long postid, Long[] ids);
}
