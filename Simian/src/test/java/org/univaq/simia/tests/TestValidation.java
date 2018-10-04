package org.univaq.simia.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.commons.io.FilenameUtils;
import org.univaq.simian.evaluation.RascalStructure;
import org.xml.sax.SAXException;

public class TestValidation {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub
		RascalStructure rsc=new RascalStructure();
		File dirpath=new File("C:\\Users\\claudio\\Desktop\\validation_framework\\camel_validation\\clients");
		String invocationsPath="C:\\Users\\claudio\\Desktop\\validation_framework\\camel_validation\\";
		String lib="restlet";
		String jar="org.restlet-1.0.9.jar";
		String kind="pattern_projects";
		//createProjectStructure(dirpath,rsc,lib,jar,kind);
		
		
		calculateMetrics(dirpath, invocationsPath+"gt_invocations\\", invocationsPath+"pattern_invocations\\", rsc, lib);
		
		
		//rsc.appendLibraries("C:\\Users\\claudio\\Desktop\\validation_framework\\restlet_validation\\.classpath", "org.restlet-1.0.9.jar");		
		
		
		//rsc.applyMetrics("C:\\Users\\claudio\\Desktop\\validation_framework\\twitter4j_validation\\gt_invocations\\CallbackServlet.txt", "C:\\Users\\claudio\\Desktop\\validation_framework\\twitter4j_validation\\pattern_invocations\\CallbackServlet.txt","twitter4j");
	}
	
	public static void createProjectStructure(File dirpath, RascalStructure rsc,String lib,
			String jar,String kind) throws IOException {
		File[] list=dirpath.listFiles();
		String path="";
		
		
		for(File f: list) {
			if(f.isDirectory()) {
				createProjectStructure(f,rsc,lib,jar,kind);			
			}
			if(f.isFile()) {
				path=f.getPath();
				String project_name = f.getName().replaceAll(".java", "");					
				rsc.buildStructure("C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\"+kind+"\\"+project_name);
				rsc.movingFiles("C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\"+jar, "C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\"+kind+"\\"+project_name+"\\lib\\"+jar);
				rsc.movingFiles("C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\.classpath", "C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\"+kind+"\\"+project_name+"\\.classpath");
				rsc.movingFiles("C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\recommendations\\"+project_name+".java", "C:\\Users\\claudio\\Desktop\\validation_framework\\"+lib+"_validation\\"+kind+"\\"+project_name+"\\src\\"+project_name+".java");
			}
		}
		
		
	}
	
	public static void calculateMetrics(File root,String gt_path,String rec_path,RascalStructure rsc,String lib) throws IOException {
		File[] list=root.listFiles();
		String path="";
		
		
		for(File f: list) {
			if(f.isDirectory()) {
				calculateMetrics(root, gt_path, rec_path,rsc,lib);
			}
			if(f.isFile()) {
				path=f.getPath();
				String file_name = f.getName().replaceAll(".java", ".txt");
				rsc.applyMetrics(gt_path+file_name,rec_path+file_name, lib);
				
			}
		}
	}
}
