package com.tw.apistackbase;

import com.tw.apistackbase.model.Employee;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiStackBaseApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public void should_return_all_list() {
		// given
		Employee employee = new Employee("5", "sam", 22, "female");

		// when
	}

}
