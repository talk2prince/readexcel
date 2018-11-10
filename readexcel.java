package prince;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class readexcel {

	  public static void main(String[] args) throws IOException {
		  Sheet sheet = null;
		    //File excelFile = new File("F:\\python_workspace\\Python\\Linear Regression\\boston.xls");
		  InputStream inputFS = new FileInputStream("F:\\\\python_workspace\\\\Python\\\\Linear Regression\\\\boston.xls");

		    // we create an XSSF Workbook object for our XLSX Excel File
		    //XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream(excelFile));*/
		    // we get first sheet
		    try {
		    Workbook workbook = new HSSFWorkbook(inputFS);
		    //XSSFSheet sheet = workbook.getSheetAt(0);
		    sheet = workbook.getSheetAt(0);
		    }catch(Exception ex)
		    {
		    	ex.printStackTrace();
		    }
		    // we iterate on rows
		    Iterator<Row> rowIt = sheet.iterator();

		    while(rowIt.hasNext()) {
		      Row row = rowIt.next();

		      // iterate on cells for the current row
		      Iterator<Cell> cellIterator = row.cellIterator();

		      while (cellIterator.hasNext()) {
		        Cell cell = cellIterator.next();
		        System.out.print(cell.toString() + ";");
		      }

		      System.out.println();
		    }

		   // workbook.close();
		    //fis.close();
		  }

}
