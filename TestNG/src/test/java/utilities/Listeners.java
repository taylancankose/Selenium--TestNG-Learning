package utilities;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onteststart=> her testten önce 1 sefer çağırılır");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("ontextsucces=> testing sonucu pass veya fail olarak belirlenir" + result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("ontext");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }
}
