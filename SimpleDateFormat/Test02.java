package com.xie.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test02 {
	
	public static void main(String[] args) throws Exception {
		
		String time = "2017年02月12日 10时21分24秒";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒", Locale.CHINA);
		Date result = simpleDateFormat.parse(time);
		
		System.out.println(result.getTime());
	}

}
