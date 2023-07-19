package com.korea.k2.shop;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private Date joindate;
	private String joindateStr;
	private String grade;
	private String city;
	
	private String postcode;
	private String detailaddress;
	
	private String ch1;
	private String ch2;
	
	private String id ;
	private String password ;
	
}
