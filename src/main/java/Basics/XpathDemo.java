package Basics;

public class XpathDemo {

	/*
	 * XPATH:
	 * XML Path
	 * used for navigation within HTML structure
	 * DOM: Document Object Model
	 * 
	 * Types of Xpath:
	 * 1. Absolute: direct way to find the element >> /
	 * /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input
	 * 
	 * 
	 * html
	 * body
	 * 	div
	 * 		here
	 * 	div
	 * 		div
	 * 		div
	 * 		div
	 * 			input
	 * 
	 *  /html/body/div[2]/div[2]/input
	 * 
	 * 2. Relative: it starts from anywhere in the document
	 * starts with //
	 * Syntax:
	 *  xpath = //tagName[@attribute = 'value']
	 *  
	 *  //input[@id = 'pass']
	 *  
	 *  XPATH Functions:
	 *  
	 *  1. Contains(): is a method 
	 *  //input[@name = 'loguser1']
	 *  loguser1
	 *  loguser2
	 *  loguser3
	 *  user4log
	 *  userlog5
	 *  
	 *  //input[contains(@name,'log')]
	 *  
	 *  2. And/OR
	 *  
	 *  id = login - QA
	 *  id = Submit - Prod
	 *  
	 *  //input[@id = 'login' AND @id = 'submit']
	 *  
	 *  3. starts-with
	 *  //input[@name = 'loguser1']
	 *  loguser1
	 *  loguser2
	 *  loguser3
	 *  user4log
	 *  //input[starts-with(@name,'log')]
	 *  
	 *  4. XPath Text()
	 *  //span[text() = '( Username : Admin | Password : admin123 )']
	 *  
	 *  Xpath Axes
	 *  1. Following
	 *  //input[@name = 'login']//following::input
	 *  
	 *  username >> input >> name = 'username'
	 *  password >> input >> no properties
	 * 
	 * 	Preceding:
	 * //input[@name = 'txtPassword']//preceding::input[6]
	 * 
	 * Parent/Ancestors
	 * Child/Descendants
	 * 
	 * HW: Login >> Admin >> User Management >> Users
	 * 
	 * table
	 * 
	 * select id checkbox correspondiing to aravind
	 * 
	 * id	name
	 * 1	Ajay
	 * 2	Biswas
	 * 3	Deepak
	 * 4	Priya
	 * 
	 * Deepak >> 2 and delete
	 * 
	 */
}
