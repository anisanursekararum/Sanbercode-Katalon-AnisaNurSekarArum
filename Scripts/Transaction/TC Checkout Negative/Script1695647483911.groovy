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

import org.openqa.selenium.By as By
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Transaction/TC Cart'), [('successAddToCart') : 'Product added.', ('urlContain') : 'cart'],
	FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Cart/btnPlaceOrder'))

WebUI.click(findTestObject('Cart/btnPlaceOrder'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelName'), GlobalVariable.lblName)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelCountry'), GlobalVariable.lblCountry)

WebUI.setText(findTestObject('Transaction/modalInputCountry'), GlobalVariable.checkoutCountry)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelCity'), GlobalVariable.lblCity)

WebUI.setText(findTestObject('Transaction/modalInputCity'), GlobalVariable.checkoutCity)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelCC'), GlobalVariable.lblCC)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelMonth'), GlobalVariable.lblMonth)

WebUI.setText(findTestObject('Transaction/modalInputMonth'), GlobalVariable.checkoutMonth)

WebUI.verifyElementText(findTestObject('Transaction/modalLabelYear'), GlobalVariable.lblYear)

WebUI.setText(findTestObject('Transaction/modalInputYear'), GlobalVariable.checkoutYear)

WebUI.verifyElementClickable(findTestObject('generalObject/btnClose'))

WebUI.verifyElementClickable(findTestObject('generalObject/btnCloseCorner'))

WebUI.verifyElementClickable(findTestObject('Transaction/btnPurchase'))

WebUI.click(findTestObject('Transaction/btnPurchase'))

WebUI.waitForAlert(10)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, GlobalVariable.messagesCheckoutMandatoryEmpty, false)

WebUI.closeBrowser()