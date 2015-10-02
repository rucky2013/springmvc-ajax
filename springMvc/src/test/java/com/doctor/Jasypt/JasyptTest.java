package com.doctor.Jasypt;

import javax.annotation.Resource;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/JasyptConfig/Jasypt-datasource.xml")
public class JasyptTest {

	@Resource
	private ApplicationContext context;

	@Resource
	private DatasourceEnv dbEnv;

	@Test
	public void test() {
		System.out.println(dbEnv.password);
		System.out.println(dbEnv.username);
		// 输出：
		// doctorwho
		// doctor
	}

	public static void main(String[] args) {
		// PBEWithMD5AndDES
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword("root");
		String encrypted = encryptor.encrypt("doctorwho");
		System.out.println(encrypted);

		System.out.println(encryptor.decrypt(encrypted));
		;
	}
}
