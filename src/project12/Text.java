package project12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {

	public static void main(String[] args) {
		
		//文件输出流，即程序中的数据写入文件
		
		File file=new File("d:\\abc\\wahhh.txt");
		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			
			fos.write(new String("fuck you java").getBytes());
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//文件的复制，读入一个文件到程序再写入到另外一个文件，即同时使用文件输出输入流
		File file2=new File("D:\\abc\\yauso.jpg");
		File file3=new File("D:\\abc\\2.jpg");
		
		FileInputStream fis =null;
		FileOutputStream fos2 =null;
		
		try {
			fis=new FileInputStream(file2);
			fos=new FileOutputStream(file3);
			
			byte[] b=new byte[20];
			int len;
			
			while((len=fis.read(b))!=-1)
			{
				fos.write(b,0,len);
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos2!=null)
			{
				try {
					fos2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		

	}

}
