package com;

import com.pojo.Employee;
import com.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatisSpringTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void run() {
        List<Employee> all = employeeService.findAll();

        for (Employee employee : all) {
            System.out.println(employee);
        }
    }

}
