package com.tenant_manegment_module.tenant_manegment;

import com.shared.core.TestDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TenantManegmentModuleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TenantManegmentModuleApplication.class, args);
	}

	/**
     */
	@Override
	public void run(String... args) throws Exception {
		TestDTO testDTO = new TestDTO();
		testDTO.setName("TALIB");
		System.out.println(testDTO.toString());
	}
}
