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

WebUI.verifyElementClickable(findTestObject('Menu/menuLogin'))

WebUI.click(findTestObject('Menu/menuLogin'))

WebUI.verifyElementPresent(findTestObject('Auth/titleLogin'), 0)

WebUI.verifyElementVisible(findTestObject('Auth/inputLoginUsername'))

WebUI.verifyElementVisible(findTestObject('Auth/inputLoginPassword'))

WebUI.setText(findTestObject('Auth/inputLoginUsername'), GlobalVariable.usernameLogin)

WebUI.setText(findTestObject('Auth/inputLoginPassword'), GlobalVariable.passwordLogin)

WebUI.verifyElementClickable(findTestObject('generalObject/btnCloseCorner'))

WebUI.verifyElementClickable(findTestObject('generalObject/btnClose'))

WebUI.verifyElementClickable(findTestObject('Auth/btnLogin'))

WebUI.click(findTestObject('Auth/btnLogin'))

WebUI.delay(10)

expectedSuccess = ('Welcome ' + GlobalVariable.usernameLogin)

WebUI.verifyElementText(findTestObject('Object Repository/Auth/titleNameUser'), expectedSuccess)

WebUI.delay(10)


