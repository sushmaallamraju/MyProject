package listenerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
public class ActivityCapture implements WebDriverEventListener, ITestListener {
 
@Override
public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
 
}
 
@Override
public void afterClickOn(WebElement arg0, WebDriver arg1) {
 
System.out.println("After click "+arg0.toString());
 
}
 
@Override
public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
 
System.out.println("After FindBy "+arg0.toString());
}
 
@Override
public void afterNavigateBack(WebDriver arg0) {
 
System.out.println("After navigating back "+arg0.toString());
 
}
 
@Override
public void afterNavigateForward(WebDriver arg0) {
 
System.out.println("After navigating forword "+arg0.toString());
 
}
 
@Override
public void afterNavigateTo(String arg0, WebDriver arg1) {
 
System.out.println("After navigating "+arg0.toString());
 
System.out.println("After navigating "+arg1.toString());
 
}
 
@Override
public void afterScript(String arg0, WebDriver arg1) {
 
}
 
@Override
public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
 
}
 
@Override
public void beforeClickOn(WebElement arg0, WebDriver arg1) {
 
System.out.println("before click "+arg0.toString());
 
}
 
@Override
public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
 
System.out.println("before FindBY "+arg0.toString());
 
}
 
@Override
public void beforeNavigateBack(WebDriver arg0) {
 
System.out.println("Before navigating back "+arg0.toString());
}
 
@Override
public void beforeNavigateForward(WebDriver arg0) {
System.out.println("Before navigating Forword "+arg0.toString());
 
}
 
@Override
public void beforeNavigateTo(String arg0, WebDriver arg1) {
 
System.out.println("Before navigating "+arg0.toString());
System.out.println("Before navigating "+arg1.toString());
 
}
 
@Override
public void beforeScript(String arg0, WebDriver arg1) {
 
}
 
@Override
public void onException(Throwable arg0, WebDriver arg1) {
 
System.out.println("Testcase done"+arg0.toString());
System.out.println("Testcase done"+arg1.toString());
}

//////////////////////////////////////////////////////////////////
@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

// When Test case get failed, this method is called.		
@Override		
public void onTestFailure(ITestResult Result) 					
{		
System.out.println("The name of the testcase failed is :"+Result.getName());					
}		

// When Test case get Skipped, this method is called.		
@Override		
public void onTestSkipped(ITestResult Result)					
{		
System.out.println("The name of the testcase Skipped is :"+Result.getName());					
}		

// When Test case get Started, this method is called.		
@Override		
public void onTestStart(ITestResult Result)					
{		
System.out.println(Result.getName()+" test case started");					
}		

// When Test case get passed, this method is called.		
@Override		
public void onTestSuccess(ITestResult Result)					
{		
System.out.println("The name of the testcase passed is :"+Result.getName());					
}


//////////////////////////////////////////////////////////////////
 
}
