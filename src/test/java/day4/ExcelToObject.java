package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelToObject {
	
	@Test
	
	public Object[][] testDataProvider(){
		
		Object [][]arr=null;
		
		try {
			
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/Sapient.xlsx")));
			int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
			int column=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			Assert.assertTrue(true);
			arr=new Object[rows][column];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<column;j++) {
					arr[i][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
					//System.out.println(arr[i][j]);
				}
			}
			//System.out.println(arr[0][0].toString());
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("please check data file path"+e.getMessage());
		}catch(IOException e) {
			System.out.println("Smoething went wrong IO\"+e.getMessage()");
		}
		return arr;

	}
	
	
}
