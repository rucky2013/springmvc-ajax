package com.doctor.Jasypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatasourceEnv {

	@Value("${datasource.driver}")
	public String driver;

	@Value("${datasource.url}")
	public String url;

	@Value("${datasource.username}")
	public String username;

	@Value("${datasource.password}")
	public String password;
}
