package com.cos.blog.service;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.domain.user.dto.UpdateReqDto;

public class UserService {
// 리퀘스트용(요청용)
	//기능: 회원가입, 회원수정, 로그인, 로그아웃, ID중복체크
	
	public int 회원가입(JoinReqDto dto) {
		return -1; //실패
	}
	
	public User 로그인(LoginReqDto dto) {
		return null; //실패
	}
	
	public int 회원수정(UpdateReqDto dto) {
		return -1; //실패
	}

// 로그아웃 DB관련 일이 없음: 컨트롤러에서 처리하면됨
//	컨트롤러:처리해서결과값반환 서비스:결과반환값받아오기
	
	public int 아이디중복체크(String username) {
		return -1;
	}
}
