package com.stream.all.match;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {
	public static void main(String[]args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Sohan",40000));
		list.add(new Employee(102,"Ram",45000));
		list.add(new Employee(103,"Samadhan",55000));
		list.add(new Employee(104,"akash",50000));
		list.add(new Employee(105,"vishal",70000));
		
	    //All Match
		
		System.out.println(list.stream().allMatch(p->p.getEmpName().startsWith("s")));
		
	}

}
