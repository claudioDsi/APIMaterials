package org.univaq.simia.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.univaq.simia.business.impl.APICallRecommenderImpl;
import org.univaq.simia.business.impl.SimianFileUtilities;
import org.univaq.simian.evaluation.RascalStructure;
import org.univaq.simian.model.SimianPattern;
import java.util.List;




public class TestClone {
	 static String path_validation="C:\\Users\\claudio\\Desktop\\validation_framework\\";

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub 
		//init
		APICallRecommenderImpl chk=new APICallRecommenderImpl();
		SimianFileUtilities sc=new SimianFileUtilities();	
		
		//debug variables
		boolean debug=true;
		boolean fromAst=false;
		int threshold=2;
		
		
		
		
		String par1="wicketPatterns";
		File rank=new File(path_validation+"wicket_validation\\"+par1);	
		String par2="GTCargoListPage_1.java";		
		File developerFile=new File("C:\\Users\\claudio\\Desktop\\validation_framework\\wicket_validation\\gt\\"+par2);
		
		
		ArrayList<File> files=sc.scan(rank,"java");				
		List<SimianPattern> allpatterns=new ArrayList<SimianPattern>();			
		long start=System.currentTimeMillis();		
		for(File f: files) {			
			allpatterns.add(chk.findPattern(f,developerFile,threshold));			
		}
	
		long end=System.currentTimeMillis();
		long elapse=end-start;	
		float tot=(float) elapse;
		float minutes=tot/(60*1000);
		FileWriter stampFile=new FileWriter(new File("C:\\Users\\claudio\\Desktop\\timestamp.txt"),true);
		stampFile.write("time for "+par2+" "+minutes+"\n");
		stampFile.flush();
		stampFile.close();
		
		sc.putRecommendations(allpatterns,"C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\full"+par2);	
		String s="C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\GT"+par2;
		//sc.parseAst(developerFile,"org.restlet","RestletSample",s,1);			
		
		File result=new File(s);
		sc.splitFile(0,20, developerFile);		
		List<SimianPattern> secondRec=new ArrayList<SimianPattern>();
		File splitted=new File("C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\split.java");
		
		
		if (fromAst) {
			for(File f2: files) {
				secondRec.add(chk.findPattern(f2,result, threshold));
			}
		}
		else {
			for(File f2: files) {
				secondRec.add(chk.findPattern(f2,splitted, threshold));
			}
		}
		
		
		sc.putRecommendations(secondRec, "C:\\Users\\claudio\\eclipse-workspace-oxygen\\Simia\\simia\\src\\test\\resources\\"+par2);
		
		
		//sc.evaluate("C:\\Users\\claudio\\Desktop\\validation_framework\\gt_methods.txt", "C:\\Users\\claudio\\Desktop\\validation_framework\\patterns_methods.txt");
		
		String path_n=path_validation+"\\restlet_validation\\org.restlet";
		System.out.println("done");
		RascalStructure rsc=new RascalStructure();
		if(!debug) {
			rsc.createPatternFile(secondRec, path_n,"Sample","C:\\Users\\claudio\\Desktop\\validation_framework\\restlet_validation\\recommendations\\"+par2);
			
		}
		
		
		
		
	}
	


}
