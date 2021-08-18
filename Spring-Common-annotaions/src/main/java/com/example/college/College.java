package com.example.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${college.name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("College is "+collegeName);
	}

}
