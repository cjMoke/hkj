package com.hkj.service.impl;

import com.hkj.mapper.FriendMapper;
import com.hkj.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendServiceImpl implements FriendService{
    @Autowired
    FriendMapper friendMapper;

}
