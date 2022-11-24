package Testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_excel {
	
		
	@Test
	public void names() throws IOException {
		
	
String filepath="./Testdata/Testdata.xlsx";

FileInputStream fis=new FileInputStream(filepath);

//Create object for excel file
Workbook book=new XSSFWorkbook(fis);

//access the sheet
Sheet sheet=book.getSheet("Sheet1");

//get row n column count
int rowcount=sheet.getPhysicalNumberOfRows();
int colcount=sheet.getRow(0).getPhysicalNumberOfCells();

//System.out.println(rowcount);
//System.out.println(colcount);

//// access the row and cell
//String value=sheet.getRow(0).getCell(0).getStringCellValue();
//System.out.println(value);

// Print all row n columns
/*for(int row=1;row<=rowcount-1;row++) {
	for(int col=0;col<=colcount-1;col++) {
		System.out.print(" "+sheet.getRow(row).getCell(col).getStringCellValue());
	}
	System.out.println(" ");
}*/
 
//RAAAKI METHOD--- IT WILL PRINT NULL COZ WHILE STORING N PRINTING VALUE OF 1ST ROW IS NOT SAME/ELIMINATED
/* // declare object fill & print 
int r=sheet.getPhysicalNumberOfRows();
int c=sheet.getRow(0).getPhysicalNumberOfCells();

Object[][] data =new Object[r][c];

// to store in object
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
	}
	
}
// To print the values present in data object
for(int i=1;i<r;i++) {
	for(int j=0;j<c;j++) {
		System.out.println(data[i][j]);
	}
	System.out.println(" ");
	}*/	

Object[][] data =new Object[rowcount-1][colcount];

for(int row=1;row<=rowcount-1;row++) {
	for(int col=0;col<=colcount-1;col++) {
		data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
	}
	System.out.println();
}
//To print the values present in data object
for(int i=0;i<=data.length-1;i++) {
	for(int j=0;j<=data[i].length-1;j++) {
		System.out.println(data[i][j]);
	}
}
}
}
