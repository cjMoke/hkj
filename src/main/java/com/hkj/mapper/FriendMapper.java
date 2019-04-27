package com.hkj.mapper;

import com.hkj.pojo.Friend;
import com.hkj.pojo.FriendExample;
import java.util.List;

public interface FriendMapper {
    int deleteByPrimaryKey(Integer fri_id);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendExample example);

    Friend selectByPrimaryKey(Integer fri_id);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}