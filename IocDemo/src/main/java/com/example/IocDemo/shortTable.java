package com.example.IocDemo;

public class shortTable implements Table {
	double height;
	double width;
	public shortTable() {
		this.height=100;
		this.width=300;
	}
	@Override
	public String showDetails(){
		// TODO Auto-generated method stub
		String s="This is Short table , the height is "+height+" and the width is "+width;
		return s;
	}

}
