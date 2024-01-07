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

WebUI.navigateToUrl('https://myskill.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RepoProfile/Page_Si Paling Belajar  MySkill/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/RepoProfile/Page_Masuk  MySkill/input_email'), 'dummy@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RepoProfile/Page_Masuk  MySkill/input_password'), 'lxZlJ8FjYjqdQXToEFAeEg==')

WebUI.click(findTestObject('Object Repository/RepoProfile/Page_Masuk  MySkill/button_Masuk'))

WebUI.click(findTestObject('Object Repository/RepoProfile/Page_Si Paling Belajar  MySkill/div_N'))

WebUI.click(findTestObject('Object Repository/RepoProfile/Page_Si Paling Belajar  MySkill/a_Profil'))

WebUI.clearText(findTestObject('Object Repository/RepoProfile/Page_Profile Saya  MySkill/input_name'))

WebUI.setText(findTestObject('Object Repository/RepoProfile/Page_Profile Saya  MySkill/input_name'), 'New Name')

WebUI.click(findTestObject('Object Repository/RepoProfile/Page_Profile Saya  MySkill/button_Simpan Perubahan'))

WebUI.verifyElementText(findTestObject('Object Repository/RepoProfile/Page_Profile Saya  MySkill/div_Berhasil menyimpan profile'), 
    'Berhasil menyimpan profile!')

WebUI.closeBrowser()

