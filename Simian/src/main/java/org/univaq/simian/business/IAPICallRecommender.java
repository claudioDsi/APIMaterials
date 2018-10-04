package org.univaq.simian.business;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.univaq.simian.model.SimianPattern;

public interface IAPICallRecommender {	
	 SimianPattern findPattern(File pattern,File myFile,int threshold) throws IOException;	
	 List<String> getRecommendedlines(ArrayList<String> blocks,File pattern) throws IOException;
	 long getTime() ;
}
