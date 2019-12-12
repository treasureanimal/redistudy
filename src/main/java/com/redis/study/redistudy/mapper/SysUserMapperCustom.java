package com.redis.study.redistudy.mapper;

import java.util.List;

import com.redis.study.redistudy.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}