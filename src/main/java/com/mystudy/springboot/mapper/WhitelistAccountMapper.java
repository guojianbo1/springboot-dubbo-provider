package com.mystudy.springboot.mapper;

import com.mystudy.springboot.model.WhitelistAccount;

public interface WhitelistAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WhitelistAccount record);

    int insertSelective(WhitelistAccount record);

    WhitelistAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WhitelistAccount record);

    int updateByPrimaryKey(WhitelistAccount record);
}