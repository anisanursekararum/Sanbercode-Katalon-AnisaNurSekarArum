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

WebUI.verifyElementClickable(findTestObject('Menu/menuSignup'))

WebUI.click(findTestObject('Menu/menuSignup'))

WebUI.verifyElementPresent(findTestObject('Auth/titleSignup'), 0)

WebUI.verifyElementVisible(findTestObject('Auth/inputSignupUsername'))

WebUI.verifyElementVisible(findTestObject('Auth/inputSignupPassword'))

def sourceData = findTestData('Data Files/Auth/Signup')

for (def rowNumber = 1; rowNumber <= sourceData.getRowNumbers(); rowNumber++) {
    username = sourceData.getValue(1, rowNumber)

    password = sourceData.getValue(2, rowNumber)

    WebUI.setText(findTestObject('Auth/inputSignupUsername'), username)

    WebUI.setText(findTestObject('Auth/inputSignupPassword'), password)

    WebUI.verifyElementClickable(findTestObject('generalObject/btnCloseCorner'))

    WebUI.verifyElementClickable(findTestObject('generalObject/btnClose'))

    WebUI.verifyElementClickable(findTestObject('Auth/btnSignup'))

    WebUI.click(findTestObject('Auth/btnSignup'))

    WebUI.waitForAlert(5)

    if (username.isEmpty() || password.isEmpty()) {
        alertText = WebUI.getAlertText()

        WebUI.verifyMatch(alertText, GlobalVariable.messagesEmpty, false)
    } else {
        alertText = WebUI.getAlertText()

        WebUI.verifyMatch(alertText, GlobalVariable.messagesUserExist, false)
    }
    
    WebUI.delay(5)
}

WebUI.closeBrowser()

