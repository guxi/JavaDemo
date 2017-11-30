package edu.wust.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class readAndWrite {

	/**
	 * main中函数，取消句首的注释，逐个测试
	 */
	public static void main(String[] args) {

		//createDirAndfile(); 	//创建、删除目录、文件和子目录
		 getIndex(); 			//遍历目录下目录与文件
		// getFullIndex(); 		// 遍历目录及子目录下目录与文件
		// fileCopy()   ;   	//copy文件
		// SRW(); 				// 小文件读写
		// BRW(); 				// 大文件读写,使用BufferedReader缓冲
		// StreamRW(); 			// 使用java8强大的Stream，读取、筛选、更改内容、写入新文件，一句搞定
	}

	/**
	 * 创建、删除目录、文件和子目录
	 */
	static void createDirAndfile() {
		prtl("----createDirAndfile ---- ");
		try {
			Path currentDir = Paths.get(".");//“.” 代表当前目录
			prtl("当前绝对路径："+currentDir.toAbsolutePath());
			Path dirPath = Paths.get("c:\\a\\b");
			if (!Files.exists(dirPath))
			{
				Files.createDirectory(dirPath);
				prtl("目录创建成功！");
			}
			Path filePath = Paths.get("c:\\a\\b\\HelloW.txt");
			Files.deleteIfExists(filePath);
			Files.createFile(filePath);
			prtl("文件创建成功！");

			Path subDirPath = Paths.get("c:\\a\\b\\c");
			if (!Files.exists(subDirPath))
			{
				Files.createDirectories(subDirPath);
				prtl("子目录创建成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();

		}
	}

	/**
	 * 遍历目录下目录与文件
	 */
	static void getIndex() {
		try {
			Iterator<Path> ite = Files.list(Paths.get("C:\\a\\学期")).iterator();
			while (ite.hasNext()) {
				Path pp = ite.next();
				prtl("" + pp.getFileName());
			}
		} catch (Exception e) {
		}
	}

	/**
	 * 遍历目录及子目录下目录与文件
	 */

	static void getFullIndex() {

		try {
			Files.walkFileTree(Paths.get("C:\\a"), new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

					prtl("正在访问目录：" + dir);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					prtl("\t正在访问文件" + file);
					/*//筛选文件
					 *  if (file.endsWith("HelloR.txt")) {
					 * System.out.println("******找到目标文件txt******"); return
					 * FileVisitResult.TERMINATE; // 找到了就终止 }
					 */
					return FileVisitResult.CONTINUE; // 没找到继续找
				}

			});
			;

		} catch (Exception e) {
		}
	}
	
	/**
	 * copy文件
	 */

	static void fileCopy() {
		Path sFile = Paths.get("c:\\a\\HelloR.txt");  
	    Path copiedFile = Paths.get("c:\\a\\b\\c\\HelloC.txt"); 
	    try{
	    	 Files.copy(sFile, copiedFile, StandardCopyOption.REPLACE_EXISTING); 
	    	 prtl("copy文件成功！");
	    }catch(Exception e) {}
	}
	/**
	 * 小文件读写
	 */
	static void SRW() {
		Path pr = Paths.get("c:\\a\\HelloR.txt");
		Path pw = Paths.get("c:\\a\\b\\HelloW.txt");
		try {
			for (String s : Files.readAllLines(pr, StandardCharsets.UTF_8)) {
				prtl(s);
				Files.write(pw, (s + "\n").getBytes(), StandardOpenOption.APPEND);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 大文件读写,使用BufferedReader缓冲
	 */
	static void BRW() {
		Path pr = Paths.get("c:\\a\\HelloR.txt");
		Path pw = Paths.get("c:\\a\\b\\HelloW.txt");
		try (BufferedReader reader = Files.newBufferedReader(pr, StandardCharsets.UTF_8);
			 BufferedWriter writer = Files.newBufferedWriter(pw, StandardCharsets.UTF_8);) 
		{
			String temp = reader.readLine();
			while (temp != null) {
				temp = reader.readLine();
				prtl(temp);
				writer.write(temp);
				if (temp == null)
					break;
				writer.write("\n"); // 只适用Windows系统 ,继续读文件
			}

		} catch (Exception e) {
		}
	}

	/**
	 * 使用Stream
	 */
	static void StreamRW() {
		Path pr = Paths.get("c:\\a\\HelloR.txt");
		Path pw = Paths.get("c:\\a\\b\\HelloW.txt");
		try {
			Files.lines(pr).filter(line -> line.contains("[error]")) // 筛选含[srror]的行
					.map((a) -> {
						LocalDate ld = LocalDate.now();
						LocalTime lt = LocalTime.now();
						a = ld.toString() + " " + lt.toString() // 加上日期
								+ "\n" + a;
						return a;
					}).forEach(a -> {
						prtl(a);
						try {
							Files.write(pw, (a + "\n").getBytes(), StandardOpenOption.APPEND);
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
		} catch (IOException e) {

		}

	}

	static void prtl(String str) {
		System.out.println(str);
	}

	static void prt(String str) {
		System.out.print(str);
	}

}
