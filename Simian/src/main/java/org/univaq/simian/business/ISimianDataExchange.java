package org.univaq.simian.business;

import java.util.ArrayList;


public interface ISimianDataExchange {
	
	ArrayList<String> getListFiles();
	ArrayList<String> getClonedCode();
	int getNumClonedFiles();
	int getNumClonedBlock();
	long getTotalTime();
	int getDuplicatedLines();

}
