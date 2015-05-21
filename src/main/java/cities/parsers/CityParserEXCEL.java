package cities.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jdom2.JDOMException;
import org.xml.sax.SAXException;
/*
import excel.HSSFCell;
import excel.HSSFRow;
import excel.HSSFSheet;
import excel.HSSFWorkbook;*/


public class CityParserEXCEL  extends AbstractParser  {


	@Override
	public void cityParse()  {
		ResourceBundle resource= ResourceBundle.getBundle("database");
		String fileName= resource.getString("path");
		try {
				InputStream file = new FileInputStream(fileName);
				HSSFWorkbook wb = new HSSFWorkbook(file);
		 
				HSSFSheet sheet=wb.getSheetAt(0);
				HSSFRow currentRow = null;
				HSSFCell currentCell = null;
				int currentRowNumber = 1; 
				int currentCellNumber = 0;
				ArrayList<String> row = new ArrayList<String>();
				while ((currentRow = sheet.getRow(currentRowNumber)) != null) {
					cities.add(currentRow.getCell((short) 0).getStringCellValue().toUpperCase());
				    currentRowNumber++;
					currentCellNumber = 0;
				}
				
					file.close();
				} catch (IOException e) {
					System.out.println("File with cities not found");
				}
		
		}


	
	
}
