package Extentreport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Webreport {

    String resultFilePath;
    ExtentReports extentReports;
    ExtentTest test;

    public void  createreport(String filepath){

        this.resultFilePath=filepath;
        extentReports=new ExtentReports(this.resultFilePath);

    }

    public void starttest(String testname){

        test=extentReports.startTest(testname);
    }

    public void endtest(){

        extentReports.endTest(test);
    }

    public  void  passtest(String msg1){

        test.log(LogStatus.PASS,msg1);

    }

    public void failtest(String msg2){

        test.log(LogStatus.FAIL,msg2);
    }

    public void testinfo(String msg3){

        test.log(LogStatus.INFO,msg3);
    }

    public void testskip(String mgs5){

        test.log(LogStatus.SKIP,mgs5);
    }

    public void  flushresult(){

        extentReports.flush();
    }


}
