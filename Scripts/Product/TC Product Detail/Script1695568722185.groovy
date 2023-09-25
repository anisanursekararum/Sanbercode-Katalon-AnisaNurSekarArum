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

WebUI.callTestCase(findTestCase('Auth/TC Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Product/btnNexus6'))

WebUI.click(findTestObject('Product/btnNexus6'))

String currentURL = WebUI.getUrl()

WebUI.verifyMatch(currentURL, ('.*' + urlContain) + '.*', true)

WebUI.verifyElementText(findTestObject('Product/tittleProductDetail'), GlobalVariable.nexusTitle)

String price = WebUI.getText(findTestObject('Product/priceProductDetail'))

WebUI.verifyMatch(price, ('.*' + GlobalVariable.nexusPrice) + '.*', true)

WebUI.verifyElementText(findTestObject('Product/titleProductDesc'), GlobalVariable.productDesc)

WebUI.verifyElementText(findTestObject('Product/productDesc'), GlobalVariable.nexusProdDesc)

WebUI.verifyElementVisible(findTestObject('Product/imgProducDetail'))

WebUI.verifyElementClickable(findTestObject('Product/btnAddToCart'))

