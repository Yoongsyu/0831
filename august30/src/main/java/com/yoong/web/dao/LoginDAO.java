package com.yoong.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yoong.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);

}
