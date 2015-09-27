package com.doctor.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doctor.springmvc.common.ModelResult;
import com.doctor.springmvc.common.domain.UserInfo;

@Controller
public class SImpleController {

	@RequestMapping("/getAString.do")
	@ResponseBody
	public ModelResult<String> getAString() {

		ModelResult<String> modelResult = new ModelResult<>();
		modelResult.setModel("hello doctor");
		return modelResult;
	}

	@RequestMapping("/update.do")
	@ResponseBody
	public ModelResult<UserInfo> updateUserInfo(@RequestBody UserInfo userInfo) {
		ModelResult<UserInfo> modelResult = new ModelResult<>();
		userInfo.setName("hello doctor");
		userInfo.setPasswd("1235678");
		userInfo.setSex("man");
		modelResult.setModel(userInfo);
		return modelResult;
	}

	@RequestMapping("/error.do")
	@ResponseBody
	public ModelResult<UserInfo> errorExample(@RequestBody UserInfo userInfo) {
		ModelResult<UserInfo> modelResult = new ModelResult<>();
		userInfo.setName("hello doctor");
		userInfo.setPasswd("1235678");
		userInfo.setSex("man");
		modelResult.setModel(userInfo);
		return modelResult;
	}

}
