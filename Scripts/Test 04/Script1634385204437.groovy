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

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.click(findTestObject('Object Repository/Page_Google/div_Zgadzam si'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'KOLOR CZERWONY')

WebUI.click(findTestObject('Object Repository/Page_Google/span_kolor czerwony'))

WebUI.click(findTestObject('Object Repository/Page_kolor czerwony - Szukaj w Google/a_Grafika'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'kolor czerwony')

WebUI.click(findTestObject('Object Repository/Page_Google/span_kolor czerwony'))

WebUI.click(findTestObject('Object Repository/Page_kolor czerwony - Szukaj w Google/a_Grafika_1'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'k o l o r c z e r w o n y')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_k o l o r c z e r w o n y - Szukaj w Google/a_Grafika'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'K - O -L - O - R  C - Z - E - R - W - O - N - Y')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Usu_btnK'))

WebUI.click(findTestObject('Object Repository/Page_K - O -L - O - R C - Z - E - R - W - O_43236b/span_Nawigacja na stronie_SJajHc NVbCr'))

WebUI.click(findTestObject('Object Repository/Page_K - O -L - O - R C - Z - E - R - W - O_43236b/a_Grafika'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'koioe czerqonu')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Usu_btnK'))

WebUI.click(findTestObject('Object Repository/Page_koioe czerqonu - Szukaj w Google/a_Grafika'))

