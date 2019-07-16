package com.tw.apistackbase;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiStackBaseApplicationTests {
	@MockBean
	private EmployService employService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void should_return_employ_find_by_list() {
		Employee employee = new Employee("5", "sam", 22, "female");

	}

}
