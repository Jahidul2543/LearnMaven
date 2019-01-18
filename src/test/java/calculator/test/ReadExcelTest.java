package calculator.test;

import org.testng.annotations.Test;
import reader.MyDataReader;

public class ReadExcelTest {

    @Test
    public void readExcel() throws Exception {
        MyDataReader dataReader = new MyDataReader();
        //This will tell where is my xlsx data file
       // dataReader.setExcelFile("/Users/jahidul/IdeaProjects/LearnMaven/src/main/java/data/testData.xlsx");

       String excelFilePath = System.getProperty("user.dir") + "/src/main/java/data/testData.xlsx";

       dataReader.setExcelFile(excelFilePath);
        //Read data from xlsx file my mentioning the Sheet name

        String[][] dataTable =  dataReader.getExcelSheetData("Sheet1");

        System.out.println("Read Cell00: " + dataTable[0][0]);//4
        System.out.println("Read Cell01: " + dataTable[0][1]);//4

        System.out.println("First Record: " +dataTable[0][0] +" " + dataTable[0][1]);
        System.out.println("Second Record: " +dataTable[1][0] +" " + dataTable[1][1]);
        System.out.println("Third Record: " +dataTable[2][0] +" " + dataTable[2][1]);


    }
}
