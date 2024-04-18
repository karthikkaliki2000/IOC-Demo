package com.example.IocDemo;

public class longTable implements Table {
	double height;
	double width;
	public longTable() {
		this.height=200;
		this.width=600;
	}
	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		String s="This is Long table , the height is "+height+" and the width is "+width;
		return s;
	}

}
