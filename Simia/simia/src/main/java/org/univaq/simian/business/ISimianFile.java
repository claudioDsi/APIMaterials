package org.univaq.simian.business;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.univaq.simian.model.SimianPattern;

public interface ISimianFile {
	ArrayList<File> scan(File dirpath, String type) throws IOException;	
	void putRecommendations(List<SimianPattern> patterns, String destination) throws IOException ;
	File createTempFile(String devSnippet) throws IOException ;

}
