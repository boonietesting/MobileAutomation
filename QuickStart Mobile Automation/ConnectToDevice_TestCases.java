package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://riley.partner.testinsights.io/app/#!/model-engine/guid/9740102d-07ff-4b06-924f-ecd594ad3ce8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 109, profileId = 100071)
public class ConnectToDevice_TestCases extends TestBase
{
    

    
    @Test  (groups= {"Connect To Device","Connect To Device - Test Cases"})
    @TestModellerPath(guid = "3d72dff5-263f-43d9-ac25-39146d29d16c")
    public void AddCapabilityAddCapabilityAddCapabilityAddCapabilityConnectAppiumCapturePageScreenshot()
    {
        
        pages.MobileGeneralActions _MobileGeneralActions = new pages.MobileGeneralActions (getDriver());
    TestModellerLogger.SetLastNodeGuid("68e7f268-5d38-492e-a16a-b8c63b379baa");
    _MobileGeneralActions.addCapability("platformName","Android");
    

    TestModellerLogger.SetLastNodeGuid("b3c898ec-152c-440d-b7df-c3a64123d10f");
    _MobileGeneralActions.addCapability("app","https://github.com/saucelabs/my-demo-app-rn/releases/download/v1.3.0/Android-MyDemoAppRN.1.3.0.build-244.apk");
    

    TestModellerLogger.SetLastNodeGuid("1b0ea9ea-9207-433d-ac4b-42763996e981");
    _MobileGeneralActions.addCapability("appPackage","com.saucelabs.mydemoapp");
    

    TestModellerLogger.SetLastNodeGuid("d4603536-e117-4af7-8086-b7f01c1f78b2");
    _MobileGeneralActions.addCapability("appActivity","com.saucelabs.mydemoapp.rn.MainActivity");
    

    TestModellerLogger.SetLastNodeGuid("9e33c4c1-c93d-4d31-9a93-072329600aab");
    _MobileGeneralActions.connectAppium("https://jameswalker90:68887628-16c4-4132-9c61-5decf9f1e6ff@ondemand.us-west-1.saucelabs.com:443/wd/hub");
    

    TestModellerLogger.SetLastNodeGuid("a8a11e10-cfee-48d1-8fe8-370a50923a5a");
    _MobileGeneralActions.capturePageScreenshot();
    

    }

}