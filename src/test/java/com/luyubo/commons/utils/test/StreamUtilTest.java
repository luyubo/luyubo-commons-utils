package com.luyubo.commons.utils.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.luyubo.commons.utils.StreamUtil;

public class StreamUtilTest {
	/**
	 * 读取文本文件(以字节流的形式)
	 */
	@Test
	public void readTextFileTest() {
		String readTextFile = StreamUtil.readTextFile("C:\\Users\\77028\\Desktop\\file\\aa.txt");
		System.out.println("读取文本文件(以字节流的形式):"+readTextFile);
	}
	
	
	/**
	 * 写入内容
	 */
	@Test
	public void writeTextFileTest() {
		StreamUtil.writeTextFile("--very good", "C:\\Users\\77028\\Desktop\\file\\aa.txt", true);
		System.out.println("写入内容");
	}
	
	/**
	 * 关闭流
	 * @throws FileNotFoundException 
	 */
	@Test
	public void closeSystem(){
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(new File("C:\\Users\\77028\\Desktop\\file\\english1.txt")));
			String str="";
			while ((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			StreamUtil.closeStream(br);
			System.out.println("已关");
		}
		
	}
	
}
