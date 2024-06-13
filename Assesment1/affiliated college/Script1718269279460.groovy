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

WebUI.navigateToUrl('https://cghealthuniv.com/AffiliatedColleges.aspx')

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_G.E. ROAD, RAIPUR (C.G),PIN-492010'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_GOVT. N.P.A. AYURVED COLLEGE,'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_A - 1'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_GOVT. AYURVEDIC COLLEGE,'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_, KOHKA,  KHURUD ROAD, BHILAI (C.G.)   P_085d26'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_G.E. ROAD, ANJORA, DURG (C.G.)PIN-491001'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_MAITRI COLLEGE OF DENTISTRY AND RESEARCH_fd87e0'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_RUNGTA COLLEGE OF DENTAL SCIENCE AND RESEARCH'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_CHRISTIAN HOSPITAL, DHAMTARI,           _3898ad'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_, NEAR BHRENGABHATA CHOWK,VILLAGE- RAKHI_84f6e6'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_VILL. - BELBHATHA, POST - P. JAMGAON,   _80e843'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_NAGPUR ROAD, CHIRIMIRI,           VILL.-_33ada7'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_OLD DISTT. HOSPITAL CAMPUS,KABIRDHAM(C.G_d3d835'))

WebUI.click(findTestObject('Object Repository/Affiliated college/Page_Welcome to Pt. Deendayal Upadhyay Memo_294cf7/td_VILL.-PENDRI, TH.-MASTURI,DIST-BILASPUR _e16cad'))

WebUI.closeBrowser()

