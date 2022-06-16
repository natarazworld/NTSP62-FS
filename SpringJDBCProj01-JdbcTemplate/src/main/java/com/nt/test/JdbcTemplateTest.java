package com.nt.test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.IEmployeeDAO;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get DAO class obj ref
		IEmployeeDAO  dao=ctx.getBean("empDAO",IEmployeeDAO.class);
		//invoke the b.method
		int count=dao.getEmployessCount();
		System.out.println("Employess count is ::"+count);
		System.out.println("---------------------");
		Map<String,Object> map=dao.getEmployeeByNo(7499);
		System.out.println("7499 emp details are :"+map);
		System.out.println("--------------------------------");
		List<Map<String,Object>>  list=dao.getEmployeesByDesgs("CLERK","MANAGER");
		/*		list.forEach(record->{
					 System.out.println(record);
				});
		*/
		
		list.forEach(record->{
			Set<String> keys=record.keySet();
			 Collection<Object> values= record.values();
			System.out.println(keys);
			System.out.println(values);
			System.out.println("___________");;
		});
		
		System.out.println("-----------------------------");
		
		int cnt=dao.registerEmployee(3456, "baba", "CLERK", 69999.0);
		if(cnt==0)
			System.out.println("record not inserted");
		else
			System.out.println("Record inserted");
		
			System.out.println("-----------------------------");
			int updateCount=dao.addBonusToEmployeesBySalaryRange(3000, 4000.0,20000.0);
			System.out.println("Bonus is added to "+updateCount+" no.of employees");
		
		System.out.println("-----------------------------");
		int  deleteCount=dao.fireEmployeesByDesg("dev");
		System.out.println(deleteCount+" no.of employees are fired");
	}//main
}//class
