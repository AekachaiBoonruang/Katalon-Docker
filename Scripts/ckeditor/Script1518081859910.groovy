import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://riderr-admin.20scoopscnx.com/login')

WebUI.setText(findTestObject('Page_Riderr Admin/input_email'), 'admin@20scoops.com')

WebUI.setText(findTestObject('Page_Riderr Admin/input_password'), '20scoops')

WebUI.sendKeys(findTestObject('Page_Riderr Admin/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Riderr Admin/span_Contest'))

WebUI.click(findTestObject('Page_Riderr Admin/span_fa fa-trophy orange-icon'))

WebUI.switchToFrame(findTestObject('Page_Riderr Admin/ck'), 5)

WebUI.setText(findTestObject('Page_Riderr Admin/txt_ckeditor'), 'fdslkjfsdkl;jfkldsjfdslkjfsdlfdsf')

WebUI.delay(0)

WebUI.closeBrowser()

