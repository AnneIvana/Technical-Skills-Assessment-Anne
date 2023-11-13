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
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
selenium.click("xpath=//div[@id='app']/div/div/aside/nav/div[2]/ul/li[6]/a/span")
selenium.open("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7")
selenium.click("name=firstName")
selenium.type("name=firstName", "Anne")
selenium.click("name=middleName")
selenium.click("name=middleName")
selenium.type("name=middleName", "Ivana")
selenium.click("name=lastName")
selenium.click("name=lastName")
selenium.click("name=lastName")
selenium.click("name=lastName")
selenium.type("name=lastName", "Adiningsih")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/input", "Anne")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input", "DKI153")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input", "098765")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input", "08903439875498754")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/ul/li[2]/div/p")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/ul/li[2]/ul/li[54]")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/div[31]/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[3]/div/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[3]/div/div/div[2]/input", "9475934693746794")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[3]/div[2]/div/div[2]/input")
selenium.type("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[3]/div[2]/div/div[2]/input", "98375028365865894")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div/input")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/p")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/ul/li[2]/ul/li[28]")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[2]/div")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[4]/div/div/div/div[2]/input")
selenium.click("xpath=//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div/div/div/div[2]/div/div")
selenium.click("xpath=//button[@type='submit']")
