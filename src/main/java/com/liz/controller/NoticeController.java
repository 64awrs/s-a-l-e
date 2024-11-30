package com.liz.controller;

import com.liz.service.NoticeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    // 注入NoticeService
    @Resource
    private NoticeService noticeService;

}
