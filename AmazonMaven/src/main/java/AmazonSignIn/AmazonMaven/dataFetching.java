package AmazonSignIn.AmazonMaven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataFetching {

			public ArrayList<String> getData() throws IOException
		{
		ArrayList<String> a=new ArrayList<String>();
		String userdir = System.getProperty("user.dir");
FileInputStream inputStream = new FileInputStream(userdir + "\\src\\main\\resources\\demodata.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
XSSFSheet sheet= workbook.getSheet("testdata");

int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

//Create a loop over all the rows of excel file to read it

for (int k = 1; k < rowCount+1; k++) {

    Row row = ((XSSFSheet) sheet).getRow(k);

    //Create a loop to print cell values in a row

    for (int j = 0; j < row.getLastCellNum(); j++) {

        //Print Excel data in console

         	
    	if(row.getCell(j).getCellTypeEnum()==CellType.STRING)
    	{

    	a.add(row.getCell(j).getStringCellValue());
    	}
    	else{

    	a.add(NumberToTextConverter.toText(row.getCell(j).getNumericCellValue()));

    	}

    	System.out.println(a.get(j));
    	    }

   }
return a;
}
	}
