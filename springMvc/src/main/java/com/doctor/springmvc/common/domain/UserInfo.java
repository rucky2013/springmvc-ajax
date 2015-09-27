package com.doctor.springmvc.common.domain;

import java.io.Serializable;

/**
 * @author doctor
 *
 * @time 2015年9月27日 下午4:00:25
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String passwd;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
