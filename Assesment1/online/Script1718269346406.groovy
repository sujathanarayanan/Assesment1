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

WebUI.navigateToUrl('https://slcm.cgstate.gov.in/AyushUniversityOnline/')

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/a_User Manual'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/label_User Name  Mobile No'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/img_Enter Below Mentioned Text_ContentPlace_b2525e'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input_Enter Below Mentioned Text_ctl00Conte_10ce75'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input_Enter Below Mentioned Text_ctl00Conte_490109'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input_Forget Password_ctl00ContentPlaceHold_a4335e'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input__ctl00ContentPlaceHolder1BtnVerify'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input_Enter Your Mobile Number_ctl00Content_e8af95'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/input_Yes_ctl00ContentPlaceHolder1rbGraduat_c06ec1'))

WebUI.click(findTestObject('Object Repository/online/Page_Ayush University - Chhattisgarh/label_Yes'))

WebUI.closeBrowser()

