/**
 * 
 */
package com.xyd.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author scott
 * @date 2017年12月15日上午9:33:47
 * @version
 * @description
 *    思路:
 *      1. 解决  每个月的 最大天数是多少 ? 
 *      
 *      2. 解决 每个月份 1 号是 星期几  
 *   
 *      3. 解决  周六换行
 */
public class PrintCalendar {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入时间:(格式:yyyy-MM)");
		String time = sc.next();
		
		Date date = new SimpleDateFormat("yyyy-MM").parse(time);
		//创建 
		Calendar calendar = Calendar.getInstance();
		
		//设置 为  你自己输入的 时间
		calendar.setTime(date);
		
		//设置  calendar 日期 为  1 号     判断 1号是 星期几
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		//get  获取  DAY_OF_WEEK 星期几
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		//获取 月份中 最大的 天数
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= maxDay; i++) {

			System.out.print(i + "\t");
			
			//获取  calendar 日期 是 周几 (周六换行)
			int day_Of_Week = calendar.get(Calendar.DAY_OF_WEEK);
			
			//周六换行 
			if (day_Of_Week == Calendar.SATURDAY) {
				System.out.println();
			}
			
			//之前日期 设置 为  1号    循环 后每次都要 + 1 改变天数
			calendar.add(Calendar.DAY_OF_WEEK, 1);
		}

	}
}
