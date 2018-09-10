package org.univaq.simia.business.impl;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.univaq.simian.business.IAPICallRecommender;
import org.univaq.simian.model.SimianPattern;
import com.harukizaemon.simian.*;

public class APICallRecommenderImpl implements IAPICallRecommender {
	long tot=0;
	
	
	public SimianPattern findPattern(File pattern,File myFile,int threshold) throws IOException{
		List<String> results=new ArrayList<String>();		
		AulistenerImpl aulist = new AulistenerImpl();		
	    Options options = new Options();
	    options.setThreshold(threshold);
	    options.setOption(Option.REPORT_DUPLICATE_TEXT, true);
		options.setOption(Option.IGNORE_STRINGS, true);
		options.setOption(Option.IGNORE_STRING_CASE, true);
		options.setOption(Option.IGNORE_VARIABLE_NAMES, true);
		options.setOption(Option.IGNORE_CHARACTER_CASE, true);
		options.setOption(Option.IGNORE_IDENTIFIER_CASE, true);
		options.setOption(Option.IGNORE_MODIFIERS, true);
		options.setOption(Option.IGNORE_LITERALS, true);		
		options.setOption(Option.IGNORE_SUBTYPE_NAMES, true);
		options.setOption(Option.LANGUAGE, Language.JAVA);

	   
	    
	    Checker checker = new Checker(aulist, options);	    
	    StreamLoader streamLoader = new StreamLoader(checker);
	    FileLoader fileLoader = new FileLoader(streamLoader);
	    fileLoader.load(pattern);
	    fileLoader.load(myFile); 
		
	    checker.check(); 
	    SimianPattern p= new SimianPattern();
	   
	    p.setTime(aulist.getTotalTime());
	    p.setDuplicatedLines(aulist.getDuplicatedLines());
	    
	    if(aulist.getNumClonedBlock()>0 && aulist.getNumClonedFiles()==2) {
	    	
	    	results=getRecommendedlines(aulist.getClonedCode(), pattern);	
	    	
	    	p.setFileName(pattern.getName());
	    	p.setCodeLines(results);
	    }
	    tot+=aulist.getTotalTime();
	    return p ;
	}
	
	
	
	
	public List<String> getRecommendedlines(ArrayList<String> blocks,File pattern) throws IOException{		
		List<String> patternLines=Files.readAllLines(Paths.get(pattern.getPath()));
		
		
		File recFile=File.createTempFile("codTemp", ".java");		
		FileWriter writer=new FileWriter(recFile,true);
		for(String cc: blocks) {	
			
			writer.write(cc);
			
			
		}
		writer.flush();
		writer.close();
		recFile.deleteOnExit();
		
		List<String> linesCode=Files.readAllLines(Paths.get(recFile.getPath()));		
		//patternLines.removeAll(linesCode);	
		return patternLines;
	}
	
	
	public long getTime() {
		return tot;
	}
	
	
	
	
	
	
	
	


}
