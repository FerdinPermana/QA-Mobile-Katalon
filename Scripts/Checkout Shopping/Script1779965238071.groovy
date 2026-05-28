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

Mobile.tap(findTestObject('Checkout Shopping Cart/Pilih-Barang1'), 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-AddCart'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Checkout Shopping Cart/Pilih-Barang2'), 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-AddCart'), 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-ShoopingCart'), 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-Chekout'), 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-Fullname-Address'), Fullname, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-Address1'), AddressLine1, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-Address2'), AddressLine2, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-City'), City, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-StateRegion'), StateRegion, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-ZIPCode'), ZIPCode, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-Country'), Country, 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-payment'), 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-FullName-Checkout'), FullName, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-CardNumber'), CardNumber, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-ExpDate'), ExpDate, 0)

Mobile.setText(findTestObject('Checkout Shopping Cart/Input-SecurityCode'), SecurityCode, 0)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-ReviewOrder'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mymac/Documents/Ferdin/Codingan/Katalon/Mobile/Test-QA-Mobile-Katalon/Test-QA-Mobile-Katalon/Reports/Checkout.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Checkout Shopping Cart/Click-PlaceOrder'), 0)

Mobile.takeScreenshot('/Users/mymac/Documents/Ferdin/Codingan/Katalon/Mobile/Test-QA-Mobile-Katalon/Test-QA-Mobile-Katalon/Reports/CheckoutComplate.png', 
    FailureHandling.STOP_ON_FAILURE)

