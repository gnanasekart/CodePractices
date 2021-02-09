package Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	FileInputStream fis = null;
	XSSFWorkbook book = null;
	XSSFSheet sheet = null;
	XSSFRow row = null;
	XSSFCell cell = null;
	FileOutputStream fos = null;

	public ReadExcelData(String filename) throws IOException
	{
		fis = new FileInputStream("./Data/"+filename+".xlsx");
		book = new XSSFWorkbook(fis);
		fis.close();	
	}

	public Object[][] readExcel(String sheetname) throws IOException
	{
		Object[][] data = null;
		try {
			sheet = book.getSheet(sheetname);
			int rowcount =  sheet.getLastRowNum();
			int columncount = sheet.getRow(0).getLastCellNum();
			data = new String[rowcount][columncount];
			for(int i = 1; i <rowcount+1; i++)
			{
				try {
					row = sheet.getRow(i);
					for(int j = 0; j<columncount; j++)
					{
						try 
						{
							String value="";
							try
							{
								value = row.getCell(j).getStringCellValue();
							}
							catch(NullPointerException e)
							{
								e.printStackTrace();
							}
							data[i-1][j]= value;
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			book.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public void setexceldata(String sheetname, String value)
	{
	}
}