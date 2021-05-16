//package com.qa.util;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import java.io.File;
//
//public class ExcelReader {
//	
//	public List<Map<String, String>> getData(String excelFilePath, String sheetName){
//		Sheet sheet = getSheetByName(excelFilePath , sheetName);
//		return readSheet(sheet);
//	}
//	public List<Map<String, String>> getData(String excelFilePath, String sheetNumber){
//		Sheet sheet = getSheetByIndex(excelFilePath , sheetNumber);
//		return readSheet(sheet);
//	}
//	private Sheet getSheetByName(String excelFilePath, String sheetName){
//		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetName);
//		return sheet;
//	}
//	private Sheet getSheetByIndex(String excelFilePath, String sheetNumber){
//		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetNumber);
//		return sheet;
//	}
//	private Workbook getWorkBook(String excelFilePath){
//		return WorkbookFactory.create(new File(excelFilePath));
//	}
//	
//	private List<Map<String, String>> readSheet (Sheet sheet){
//		Row row;
//		int totalrows = sheet.getPhysicalNumberOfRows();
//		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
//		int headerRowNumber = getHeaderRowNumber(sheet);
//		if (headerRowNumber != -1) {
//			int totalcolumns = sheet.getRow(headerRowNumber).getLastCellNum();
//			int setcurrentow = 1;
//			
//		}
//	}
//}
