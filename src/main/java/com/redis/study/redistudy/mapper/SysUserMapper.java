package com.redis.study.redistudy.mapper;

import com.redis.study.redistudy.pojo.SysUser;
import com.redis.study.redistudy.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper extends MyMapper<SysUser> {
}