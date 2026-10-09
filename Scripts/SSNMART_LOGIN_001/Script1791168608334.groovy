import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://ssnmart.netlify.app/')

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/span_Login'))

WebUI.setText(findTestObject('Sample SSNMART login/Page_SSN Mart/input_Username'), 'admin')

WebUI.setEncryptedText(findTestObject('Sample SSNMART login/Page_SSN Mart/input_Password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/button_login-button'))

WebUI.setEncryptedText(findTestObject('Sample SSNMART login/Page_SSN Mart/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/button_login-button'))

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/a_Start Shopping'))

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/button_Add to Cart'))

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/span_Cart'))

WebUI.rightClick(findTestObject('Sample SSNMART login/Page_SSN Mart/img_SSN Mart'))

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/div_Samsung Galaxy S24Price_ 31199-1Remove'))

WebUI.click(findTestObject('Sample SSNMART login/Page_SSN Mart/div_Your CartSamsung Galaxy S24Price_ 31199-1R'))

WebUI.closeBrowser()

WebUI.scrollFromViewportOffset(0, 0, 0, 0)

