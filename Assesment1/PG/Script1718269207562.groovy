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

WebUI.navigateToUrl('https://cghealthuniv.com/PGCourses.aspx')

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'AYURVEDIC COLLEGE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'DENTAL COLLEGES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'MEDICAL COLLEGES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'NURSING COLLEGE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'PHARMA COLLEGES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'PHYSIOTHERAPY COLLEGES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'PRAKRITIK AND YOGA VIGYAN MAHAVIDYALYA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PG/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/select_All CategoryAYURVEDIC COLLEGEDENTAL _840b87'), 
    'UNANI  COLLEGE', true)

WebUI.closeBrowser()

