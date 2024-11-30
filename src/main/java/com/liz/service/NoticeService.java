package com.liz.service;

import com.liz.entity.Notice;
import com.liz.mapper.NoticeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    public void add(String title, String content) {
        //处理异常
        Notice dbNotice = noticeMapper.selectByUsername();
        if (ObjectUtils.isNull(dbNotice)) {
            throw new RuntimeException("公告不存在");
        }

        // 调用Mapper层的方法，将公告信息添加到数据库中
        noticeMapper.add(title, content);


    }

}
