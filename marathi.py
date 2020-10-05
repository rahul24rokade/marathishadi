import self as self
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path="C:\Program Files\Google\Chrome\Application\chromedriver.exe")
url = "https://www.marathishaadi.com/"
driver.get(url)
driver.find_element_by_xpath("//button[@class='btn-primary form-control']").click()
driver.find_element_by_xpath("//input[@data-testid='email']").send_keys("rahulrokade@gmail.com")
driver.find_element_by_xpath("//input[@data-testid='password1']").send_keys("rahul24596")

driver.find_element_by_xpath("//div[@class='Dropdown-control postedby_selector']").click()
driver.find_element_by_xpath("//div[@class='Dropdown-menu postedby_options']//div[contains(text(),'Self')]").click()
driver.find_element_by_xpath("//input[@id='gender_male']").click()
driver.find_element_by_xpath("//button[@data-testid='next_button']").click()


element = driver.find_element_by_xpath("//div[(text()='Marathi')]")
#assertEqual to verify Marathi is selected by default
self.assertEqual(element.text == 'Marathi')

driver.close()


