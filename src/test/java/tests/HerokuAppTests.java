package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.herokuapp.CheckboxesPage;
import pages.herokuapp.UploadPage;

public class HerokuAppTests extends TestBase {

    private final String Herokuapp_checkboxes_url = "http://the-internet.herokuapp.com/checkboxes";
    private final String Herokuapp_upload_url = "http://the-internet.herokuapp.com/upload";
    String filePath = System.getProperty("user.dir") + "/src/test/testData/testImage.png";

    @Test
    public void verifyBothCheckboxesAreChecked() {
        driver.get(Herokuapp_checkboxes_url);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickFirstCheckbox();
        boolean bothChecked = checkboxesPage.AreBothCheckboxesClicked();
        Assert.assertTrue(bothChecked);
    }

    @Test
    public void verifyFileUpload() {
        driver.get(Herokuapp_upload_url);
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.uploadFiles(filePath);
        Assert.assertEquals(uploadPage.getSuccessMessage(), "File Uploaded!");
        Assert.assertEquals(uploadPage.getUploadedFilename(), "testImage.png");
    }
}
