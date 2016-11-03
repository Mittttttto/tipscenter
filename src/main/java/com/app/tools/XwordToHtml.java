package com.app.tools;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.xwpf.converter.core.BasicURIResolver;
import org.apache.poi.xwpf.converter.core.FileImageExtractor;
import org.apache.poi.xwpf.converter.xhtml.XHTMLConverter;
import org.apache.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class XwordToHtml {
	public static void main(String[] args) {
		XwordToHtml xwordToHtml=new XwordToHtml();
		System.out.println("hahah");
		try {
			xwordToHtml.docxToHtml("D:/Cloud_RAN_16_System_Architecture_01.docx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public String docxToHtml(String path) throws Exception {
	        String sourceFileName = path;
	        String targetFileName = "D:\\ac\\test.html";
	        //String imagePathStr = "D:\\ac\\image\\";
	        OutputStreamWriter outputStreamWriter = null;
	        try {
	            XWPFDocument document = new XWPFDocument(new FileInputStream(sourceFileName));
	            
	            XHTMLOptions options = XHTMLOptions.create();
	            // 存放图片的文件夹
	            //options.setExtractor(new FileImageExtractor(new File(imagePathStr)));
	            // html中图片的路径
	            //options.URIResolver(new BasicURIResolver("image"));
	            //outputStreamWriter = new OutputStreamWriter(new FileOutputStream(targetFileName), "utf-8");
	            XHTMLConverter xhtmlConverter = (XHTMLConverter) XHTMLConverter.getInstance();
	            
				OutputStream haha = new FileOutputStream(System.getProperty("user.dir")+"/upload/temp"+".html");
	            XHTMLConverter.getInstance().convert(document, haha, options);
	            String str="";
	            InputStreamReader read = new InputStreamReader(new FileInputStream(new File(System.getProperty("user.dir")+"/upload/temp"+".html")));
	            BufferedReader bufferedReader = new BufferedReader(read);
	            str = bufferedReader.readLine();  
	            //xhtmlConverter.convert(document, outputStreamWriter, options);
	            return str;
	        } finally {
	            if (outputStreamWriter != null) {
	                outputStreamWriter.close();
	            }
	        }

}
}
