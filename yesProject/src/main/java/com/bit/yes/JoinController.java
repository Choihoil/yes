package com.bit.yes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	
	@RequestMapping("/join.bit")
	public String join() {
		return "join";
	}
	//����� ȸ������ ȭ��
	@RequestMapping("/branchJoin.bit")
	public String branchJoin() {
		return "branchJoin";
	}
	//�� ȸ������ ȭ��
	@RequestMapping("/customerJoin.bit")
	public String customerJoin() {
		return "customerJoin";
	}
}
