import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7")
selenium.click("link=Job")
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div/div/i")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[3]/div/div[2]/div/p")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[4]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[5]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/label/span")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/i")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div/div/i")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div/div/i")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[3]/div/div[2]/div/p")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[6]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[5]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[4]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[7]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[4]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[4]/div/div/div/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/div")
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7")
selenium.click("link=Job")
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div/div/i")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[3]/div/div[2]/div/p")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[4]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[5]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[6]/div/div[2]/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[7]/div/div[2]/div/div")
