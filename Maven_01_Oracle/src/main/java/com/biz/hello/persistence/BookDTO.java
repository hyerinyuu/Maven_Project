package com.biz.hello.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BookDTO {

	private String b_code;	//varchar2(5 byte)
	private String b_name;	//	nvarchar2(50 char)
	private String b_comp;	//	nvarchar2(50 char)
	private String b_writer;	//	nvarchar2(50 char)
	private int b_price;	//	number
	
	
}
