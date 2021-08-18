package com.example.college;

public class College {

	private Principal principal;
	private Teacher teacher;
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("Testing..!");
	}

}
