package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.vertex42.VertexTemplatePage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class VertexTemplateTest extends TestBase {


    @Test
    public void downloadFile() throws InterruptedException, IOException {
        driver.get("https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html");
        VertexTemplatePage vertexTemplatePage = new VertexTemplatePage(driver);
        vertexTemplatePage.clickdownloadExcelFile();
        VertexTemplatePage vertexTemplatePageWithAdd = new VertexTemplatePage(driver);
        vertexTemplatePageWithAdd.closeAd();
        vertexTemplatePageWithAdd.confirmDownload();
        String filename = vertexTemplatePageWithAdd.getFileName();
        Thread.sleep(2000);
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/" + filename);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int last = sheet.getLastRowNum();
        int numberOfRows = last - 8;
        Assert.assertEquals(numberOfRows, 36);
    }
}


