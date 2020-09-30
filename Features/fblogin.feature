Feature: Log In to facebook account


In order to signin from Facebook account
As a register user 
I want to enter valid E-mail address, password and click signin to Log In



@Fblogin
Scenario Outline: positive Log In with valid E-mail address and password

Given user visiting Facebook homepage
When user enter vaid "<E-mail address>" and "<password>"
And user Click on Log In
Then user will able to Log In to Facebook account

Examples:
|E-mail address|  |password|
|raksanda1984@gmail.com| |Temporal2$1|
