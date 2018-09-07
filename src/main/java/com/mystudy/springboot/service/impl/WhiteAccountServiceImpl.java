package com.mystudy.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mystudy.springboot.mapper.WhitelistAccountMapper;
import com.mystudy.springboot.model.WhitelistAccount;
import com.mystudy.springboot.service.IWhiterAccountService;

import javax.annotation.Resource;

/**
 * @Auther: GJB
 * @Date: 2018/9/6 16:33
 * @Description:
 */
@org.springframework.stereotype.Service  //该注解是spring
@Service(version = "1.0.0",timeout = 10000) //该注解是Dubbo，相对于<dubbo:service interface=.. ref=..>
public class WhiteAccountServiceImpl implements IWhiterAccountService {

    @Resource
    private WhitelistAccountMapper whitelistAccountMapper;

    @Override
    public String sayHi(String account) {
        return "hello,SpringBoot-dubbo:"+account;
    }

    @Override
    public WhitelistAccount selectWhitelistAccountById(Integer id) {
        return whitelistAccountMapper.selectByPrimaryKey(id);
    }
}
