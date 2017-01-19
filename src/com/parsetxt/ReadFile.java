package com.parsetxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class ReadFile {
	public static void main(String[] args) {
		ReadFile rf=new ReadFile();
		try {
			rf.doRead();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doRead() throws IOException, ClassNotFoundException {
		
		//读取文件
		File file=new File("C:/Users/hou/Desktop/dxf.txt");
		
		InputStreamReader reader = new InputStreamReader(  
                new FileInputStream(file)); 
		
		BufferedReader br = new BufferedReader(reader); 
		
		  String line = "";  
          line = br.readLine(); 
          while (line != null) {  
              line = br.readLine(); // 一次读入一行数据  
          }  
		 
		//截取指定的内容
		
		//输出流
		
		//转存到对象中 PointEntity
		
		
	}
	
}
