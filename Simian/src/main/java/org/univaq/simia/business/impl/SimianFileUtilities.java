package org.univaq.simia.business.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.*;
import org.univaq.simian.business.ISimianFileUtilities;
import org.univaq.simian.model.Parser;
import org.univaq.simian.model.SimianPattern;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class SimianFileUtilities implements ISimianFileUtilities{
	
	
	public ArrayList<File> scan(File dirpath,String type) throws IOException {
		File[] list=dirpath.listFiles();
		String path="";
		ArrayList<String> result=new ArrayList<String>();
		ArrayList<File> files=new ArrayList<File>();
		
		for(File f: list) {
			if(f.isDirectory()) {
				scan(f,type);			
			}
			if(f.isFile()) {
				path=f.getPath();
				String ext = FilenameUtils.getExtension(f.getName());				
				if(ext.equals(type)) {					
					result.add(f.getPath());
				} 				
			}
		}
		
		for(String s: result) {
			File f=new File(s);
			files.add(f);
		}
		
		
	return files;
	
	
	}
	
	
		
	
	public void putRecommendations(List<SimianPattern> patterns, String destination) throws IOException {		
		long tot=0;
		if(!patterns.isEmpty()) {
			File recFile=new File(destination);
			FileWriter wr=new FileWriter(recFile,true);
			
			for(SimianPattern pt:  patterns) {	
				if(pt.getCodeLines()!=null) {			
					for(String line: pt.getCodeLines()) {								
							wr.write(line + "\n");				
					}
				wr.write("\n file name "+ pt.getFileName()+"\n");
				wr.write("\n duplicated lines "+ pt.getDuplicatedLines()+"\n");
				tot+=pt.getTime();
				}
			}
			wr.write("\n total time "+ tot);
			wr.flush();			
			wr.close();
		}	
		
		
		
	}

	public File createTempFile(String devSnippet) throws IOException {
		File recFile=File.createTempFile("temp", ".java");		
		FileWriter writer=new FileWriter(recFile,true);
		writer.write(devSnippet);
		writer.flush();
		writer.close();
		recFile.deleteOnExit();
		return recFile;
	}
	
	
	
	
	
	
	public List<String> splitFile(int begin,int end, File file) throws IOException{
		List<String> result=new ArrayList<String>();
		List<String> lines=Files.readAllLines(Paths.get(file.getPath()));
		FileWriter wr=new FileWriter(new File("C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\splitted.java"));
		
		if(begin>lines.size()) {
			begin=lines.size()-10;
		}
		if(end>lines.size()) {
			end=lines.size();
		}		
		
		
		for(int i=begin;i<end;i++) {
							
			result.add(lines.get(i));			
			wr.write(lines.get(i)+"\n");
		}
		
		
		wr.flush();
		wr.close();
		
				
		return null;
	}
	
	
		
	public List<String> parseAst(File user,String library, String sample,String filename,int n) throws IOException{
		File temp=new File(filename);
		List<String> lines =Files.readAllLines(Paths.get(user.getPath()));
		FileWriter writer=new FileWriter(temp,true);
		
		InputStream str=new FileInputStream(user);
		
		List<String> packages=new ArrayList<String>();		
		List<String> methods=new ArrayList<String>();
		 ArrayList<List<String>> variables=new ArrayList<List<String>>();
		try
		{
			CompilationUnit cu = JavaParser.parse(str);
			Parser ps=new Parser();			
			packages=ps.GetPackages(cu,library);	
			methods=ps.GetMethods(cu);
			variables=ps.GetVariables(cu);
			
		}
    	catch(Exception exc)
    	{
    		exc.getMessage();
    	}			
		
		for(String pkg: packages) {
			writer.write("import "+pkg+ ";\n");
			System.out.println(pkg);
		}
		writer.write("public class "+sample+"{"+"\n");
		writer.write(methods.get(n).replaceAll("Optional", "public void ground() ").replace("]", "").replace("[", "") + "\n");
		
		writer.write("}");
					
		writer.flush();
		writer.close();
				
		return lines;		
		
	}
	
	
	
	
	

}
