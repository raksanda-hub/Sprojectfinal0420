Feature: Check Bank account current balance


 In order to know the balance of user bank Account
 As a register user
 I want to Enter User name,password and click sign in to login
  and click sign off to logout
  
  
  
 Scenario Outline: positive login and logout with valid user name and password
 Given user visiting TD Bank home page 
 When user click of Accounts
 And user type user name
 And user type password
 And user click login
 Then user will able to see Account balance
 
 Examples:
 |name|password|
 |raksanda|Ra008$1|
