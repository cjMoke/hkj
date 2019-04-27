package com.hkj.mapper;

import com.hkj.pojo.CoF;
import com.hkj.pojo.CoFExample;
import java.util.List;

public interface CoFMapper {
    int deleteByPrimaryKey(Integer cof_id);

    int insert(CoF record);

    int insertSelective(CoF record);

    List<CoF> selectByExample(CoFExample example);

    CoF selectByPrimaryKey(Integer cof_id);

    int updateByPrimaryKeySelective(CoF record);

    int updateByPrimaryKey(CoF record);
}