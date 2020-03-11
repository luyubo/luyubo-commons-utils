package com.luyubo.commons.utils.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.luyubo.commons.utils.DateUtil;
/**
 * DateUtil测试类
 * @author 77028
 *
 */
public class DateUtilTest {
	/**
	 * 测试今年几岁
	 */
	@Test
	public void getAgeTest() {
		System.out.println("测试输入的一个日期到今天多少岁:"+(DateUtil.getAge("2000-02-01")));
	}
	
	/**
	 * 测试两个时间相隔多久
	 */
	@Test
	public void getDateNumTest() {
		System.out.println("测试输入的两个日期相隔多久2018-05-01----2019-05-01:"+DateUtil.getDayNum(Date.valueOf("2018-05-01"),Date.valueOf("2019-05-01")));
	}
	
	/**
	 * 判断是否是今天
	 */
	@Test
	public void isTodayTest() {
		System.out.println("测试输入日期是否是今天2019-12-10:"+DateUtil.isToday("2019-12-10"));
	}
	
	/**
	 * 判断今天是否是本周
	 */
	@Test
	public void dateIsInThisWeekTest() {
		System.out.println("测试输入日期是否在本周2019-12-09:"+DateUtil.dateIsInThisWeek("2019-12-09"));
	}
	
	/**
	 * 测试每月的第一天
	 */
	@Test
	public void getFirstMonthDayTest() {
		java.util.Date firstMonthDay = DateUtil.getFirstMonthDay("2020-03-11");
		System.out.println("测试输入日期的当月第一天2019-12-09:"+new SimpleDateFormat("yyyy-MM-dd").format(firstMonthDay));
	}
	
	/**
	 * 测试每月的最后一天
	 */
	@Test
	public void getFirstMonthDayTest1() {
		Date date = Date.valueOf("2019-02-09");
		java.util.Date firstMonthDay = DateUtil.lastMonthDay(date);
		System.out.println("测试输入日期的当月最后一天2019-12-09:"+new SimpleDateFormat("yyyy-MM-dd").format(firstMonthDay));
	}
	
	/**
	 * 测试描述方法的作用
	 */
	@Test
	public  void compareTimeTest() {
		int compareTime = DateUtil.compareTime(Date.valueOf("2019-12-01"), Date.valueOf("2019-12-01"));
		System.out.println("描述方法的作用:0表示输入的日期相同,1表示输入日期不同:\n"+compareTime);
	}
	
	/**
	 * 测试方法
	 */
	@Test
	public void dateisInWeekDayTest() {
		Integer dateisInWeekDay = DateUtil.dateisInWeekDay("2019-12-25");
		System.out.println("星期"+dateisInWeekDay);
	}
	
	/**
	 * 
	* @Title: sqlAddTest  
	* @Description: TODO(拼接修改sql)  
	* @param     参数  
	* @return void    返回类型  
	* @throws
	 */
	@Test
	public void sqlAddTest() {
		java.util.Date firstMonthDay = DateUtil.getFirstMonthDay("2020-03-11");
		
		Date date = Date.valueOf("2019-04-09");
		java.util.Date lastMonthDay = DateUtil.lastMonthDay(date);
		String sqlString="select * from t_order where create_time>='"+new SimpleDateFormat("yyyy-MM-dd").format(firstMonthDay)+"' and create_time<='"+new SimpleDateFormat("yyyy-MM-dd").format(lastMonthDay)+"' ";
		System.out.println("最后sql为"+sqlString);
	}
}
