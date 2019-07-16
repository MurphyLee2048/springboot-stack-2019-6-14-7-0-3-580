package com.tw.apistackbase;

import com.tw.apistackbase.controller.EmployController;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.respository.Respository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployController.class)
@SpringBootTest
public class ApiStackBaseApplicationTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private Respository respository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void should_return_employ_find_by_list() throws Exception{
		Employee employee = new Employee("5", "sam", 22, "female");
		when(respository.findById(anyString())).thenReturn(employee);

		ResultActions result = mvc.perform(get("/employees/{id}", employee.getId()));

		result.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("sam"))
				.andExpect(jsonPath("$.age").value(22))
				.andExpect(jsonPath("$.gender").value("female"));

	}

}
