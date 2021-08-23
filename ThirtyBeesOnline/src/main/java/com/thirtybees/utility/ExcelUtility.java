package com.thirtybees.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	
	public void readExcelData() throws Exception {
		FileInputStream fis = new FileInputStream("Info.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("footer_Info");
		int rows = sheet.getLastRowNum();
		for(int i=1;i<=rows;i++){
			int col = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<= col;j++)
			{
				Cell cell = sheet.getRow(i).getCell(j);
				System.out.println(cell + " ");
			}
			System.out.println();
			
			
		}
		
		
	}
	}
	
	


