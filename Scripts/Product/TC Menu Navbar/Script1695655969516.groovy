import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.setViewPortSize(GlobalVariable.viewportWidth, GlobalVariable.viewportHeight)

WebUI.verifyElementPresent(findTestObject('generalObject/logo'), 0)

WebUI.verifyElementVisible(findTestObject('Menu/menuHome'))

WebUI.verifyElementClickable(findTestObject('Menu/menuHome'))

WebUI.click(findTestObject('Menu/menuHome'))

WebUI.delay(5)

String currentUrlHome = WebUI.getUrl()

WebUI.verifyMatch(currentUrlHome, ('.*' + homeURL) + '.*', true)

WebUI.verifyElementVisible(findTestObject('Menu/menuContact'))

WebUI.verifyElementClickable(findTestObject('Menu/menuContact'))

WebUI.verifyElementVisible(findTestObject('Menu/menuAboutUs'))

WebUI.verifyElementClickable(findTestObject('Menu/menuAboutUs'))

WebUI.verifyElementVisible(findTestObject('Menu/menuCart'))

WebUI.verifyElementClickable(findTestObject('Menu/menuCart'))

WebUI.click(findTestObject('Menu/menuCart'))

WebUI.delay(5)

String currentUrlCart = WebUI.getUrl()

WebUI.verifyMatch(currentUrlCart, ('.*' + cartURL) + '.*', true)

WebUI.verifyElementVisible(findTestObject('Menu/menuLogin'))

WebUI.verifyElementClickable(findTestObject('Menu/menuLogin'))

WebUI.click(findTestObject('Menu/menuLogin'))

WebUI.verifyElementVisible(findTestObject('Menu/menuSignup'))

WebUI.verifyElementClickable(findTestObject('Menu/menuSignup'))

WebUI.closeBrowser()