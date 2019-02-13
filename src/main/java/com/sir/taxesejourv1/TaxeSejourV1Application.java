package com.sir.taxesejourv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.sir.taxesejourv1.rest")
public class TaxeSejourV1Application {

	public static void main(String[] args) {
		SpringApplication.run(TaxeSejourV1Application.class, args);
	}

}

