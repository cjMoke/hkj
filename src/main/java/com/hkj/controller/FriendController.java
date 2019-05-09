package com.hkj.controller;

import com.hkj.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 所有和朋友相关的功能（如新增朋友，添加朋友等）
 */
@Controller
@RequestMapping
public class FriendController {
    @Autowired
    FriendService friendService;


}
