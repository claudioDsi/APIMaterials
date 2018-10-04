package org.univaq.simian.evaluation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.univaq.simian.model.SimianPattern;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RascalStructure {
	public boolean buildStructure(String dirpath) {
		
		boolean root= new File(dirpath).mkdirs();
		new File(dirpath+"\\lib").mkdir();
		new File(dirpath+"\\src").mkdir();
		new File(dirpath+"\\.classpath");
		System.out.println("done");
		return root;
	}
	
	public void appendLibraries(String path,String library) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		 DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	     DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	     Document document = documentBuilder.parse(path);
	     Element root = document.getDocumentElement();

	     Collection<String> libs = new ArrayList<String>();
	     libs.add("classentry");

	     for (String s : libs) {
	         // server elements
	         Element entry = document.createElement("classpathentry");

	         entry.setAttribute("kind", "lib");
	         entry.setAttribute("path", "lib/"+library);
	         root.appendChild(entry);
	     }

	     DOMSource source = new DOMSource(document);

	     TransformerFactory transformerFactory = TransformerFactory.newInstance();
	     Transformer transformer = transformerFactory.newTransformer();
	     StreamResult result = new StreamResult(path);
	     System.out.println("done");
	     transformer.transform(source, result);
	 
	}
	public void createPatternFile(List<SimianPattern> patterns,String path_namespaces,String nameSample,String folder_out) throws IOException {
		File f=new File(folder_out);
		File namespaces=new File(path_namespaces);
		FileWriter wr=new FileWriter(f,true);		
		List<String> pkgs=Files.readAllLines(Paths.get(namespaces.getPath()));
		for(String p: pkgs) {
			wr.write("import "+p+";\n");			
		}
		
		wr.write("public class "+nameSample+" {\n");
		for(SimianPattern sm: patterns) {
			
			if(sm.getCodeLines()!=null) {	
				wr.write("public void pattern"+sm.getFileName().replaceAll(".java", "")+"() ");
				for(String l: sm.getCodeLines()) {
					wr.write(l+"\n");
				}
			}
		}
			
		
		wr.write("}");
		wr.flush();
		wr.close();
		
	}
	public void applyMetrics(String path1, String path2,String lib) throws IOException {
		int count=0;
		int num=0;
		File results=new File("C:\\Users\\claudio\\Desktop\\validation_framework\\PAM_metrics.txt");
		FileWriter wr=new FileWriter(results,true);
		
		File gt=new File(path1);
		File clams=new File(path2);
		List<String> gtLines=Files.readAllLines(Paths.get(gt.getPath()));
		List<String> clamsLines=Files.readAllLines(Paths.get(clams.getPath()));
		for(String p: gtLines) {
			System.out.println(p+"\n");
			if(p.contains(lib)) {
				num++;
			}
			for(String r: clamsLines) {
					System.out.println(r);
					String[] arr=r.split("#");
					if(p.contains(arr[1])) {						
						count+=1;
					}
				
					
				
			}
		}
		
		System.out.println("line in common "+count);
		float corr=(float) count;
		float all=(float) clamsLines.size();
		float precision=corr/all;
		
		if (corr==0) {
			precision=0;
		}
		float all_rec=gtLines.size();
		float recall=num/all_rec;
		
		if (num==0) {
			recall=0;
		}
		float f_measure=0;
		wr.write("PAM precision for "+gt.getName().replaceAll(".java", "")+": "+precision+"\n");
		wr.write("PAM recall for "+gt.getName().replaceAll(".java", "")+": "+recall+"\n");
		if(recall==0 || precision==0) {
			 f_measure=0;
		}
		else {
			f_measure=(2*recall*precision)/(precision+recall);
		}
		
		wr.write("PAM f measure for "+gt.getName().replaceAll(".java", "")+": "+f_measure+"\n");
		wr.write("\n");
		wr.flush();
		wr.close();
	
	}
	public void movingFiles(String filepath,String dest) throws IOException {
		Files.copy(Paths.get(filepath), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);
		System.out.println("file moved");
	}

}
