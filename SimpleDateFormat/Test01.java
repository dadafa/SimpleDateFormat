package com.xie.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test01 {
	
	public static void main(String[] args) {
	
	Date date = new Date(1486866084000L);
	SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒", Locale.CHINA);
	String result = simpleDateFormat.format(date);
	System.out.println(result);
	
	}
}
