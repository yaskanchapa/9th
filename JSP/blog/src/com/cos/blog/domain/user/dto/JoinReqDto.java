package com.cos.blog.domain.user.dto;

import lombok.Data;

//리퀘스트용(요청용)

@Data
public class JoinReqDto {
	private String username;
	private String password;
	private String email;
	private String address;
}
