package org.univaq.simian.model;

import java.util.List;

public class SimianPattern {
	
	
	private String fileName;
	private List<String> codeLines;
	private int duplicatedLines;
	public int getDuplicatedLines() {
		return duplicatedLines;
	}


	public void setDuplicatedLines(int duplicatedLines) {
		this.duplicatedLines = duplicatedLines;
	}


	private long time;
	
	
	


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public List<String> getCodeLines() {
		return codeLines;
	}


	public void setCodeLines(List<String> codeLines) {
		this.codeLines = codeLines;
	}


	

	public long getTime() {
		return time;
	}


	public void setTime(long time) {
		this.time = time;
	}
	

}
