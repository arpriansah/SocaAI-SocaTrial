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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://soca.ai/home')

WebUI.click(findTestObject('Object Repository/fr04/Page_soca.ai/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/input_Email_form-control'), 'socatrial@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/input_Password_form-control mb-2'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/button_Sign In'))

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/button_OK'))

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/a_Projects'))

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-dashboarduser/button_Dashboard'))

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-ai-proctoring-dashboard/span_Master Event'))

WebUI.setText(findTestObject('Object Repository/fr04/Page_soca-ai-proctoring-dashboard/input_Event Name_event_name'), '')

WebUI.setText(findTestObject('Object Repository/fr04/Page_soca-ai-proctoring-dashboard/input_Event Type_event_type'), 'Jadwal testing')

WebUI.setText(findTestObject('Object Repository/fr04/Page_soca-ai-proctoring-dashboard/textarea_Description_description'), 
    'testing')

WebUI.click(findTestObject('Object Repository/fr04/Page_soca-ai-proctoring-dashboard/button_Submit'))

WebUI.closeBrowser()

