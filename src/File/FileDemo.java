package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * java.io.file
 * File的每一个实例表示硬盘上的一个文件或者目录
 * 使用File可以：
 * 1.访问其表示的文件或目录的属性信息（名字，大小，访问权限等）
 * 2.操作文件或目录(创建，删除)
 * 3.访问目录子项，但是不能访问文件数据
 * @author admin
 *
 */
public class FileDemo{
	public static void main(String[] args)  {
		
/*
 * 访问当前目录下的text.txt文件。
 * 创建files时，指定的路径通常使用相对的路径。相对路径相对哪里，要看程序的运行环境指定的位置
 * 在elipse中运行Java程序时，指定的相对路径中"当前路径”是当前程序所在的项目目录，这里就是
 * jsd1807_se这个目录
 * 
 */
	File file=new File("./a.txt");
	String name=file.getName();
	System.out.println(name);
	//获取文件大小（字节量）
	long length=file.length();
	System.out.println(length);
	
	boolean cw=file.canWrite();
	boolean cr=file.canRead();
	boolean ih=file.isHidden();
	System.out.println(cw+"  "+cr +"  " + ih);
	
	
}
}
