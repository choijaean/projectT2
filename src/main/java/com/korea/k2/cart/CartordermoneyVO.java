package com.korea.k2.cart;

import java.util.Date;

import lombok.Data;

@Data
public class CartordermoneyVO {
	private int idx;
	private int custNo;
	private int baesongbi;
	private int totalmoney;
	private Date getDate;
	private String getDateStr;
	
	private String cartId;
	private String productId;
	private String productName;
	private String amount;
	
	
}
