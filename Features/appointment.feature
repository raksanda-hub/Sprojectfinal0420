Feature: Doctor appointment


In order to get an appointment 
As a register user
I want to click appointment, Enter patient name,patient DOB,invalid e-mail address
invalid insurance number,appointment date and click signin to login and  click signout to logoff


@Doctorapp1
Scenario Outline: Negative login and logout with invalid email address and invalid user name
#Given user visit(LVHN) hospital network home page
When user click on appointment
And user type patient name
And user type patient DOB
And user type invalid e-mail address
And user type invalid insurance number
And type appointment date
And user click on submit
Then user will get an error message

Examples:
         |patient name|DOB|e-mail address|insurance number|date|
         |Rose|3.15.1986|rose23@ya.con|1234$32|8-5-2020|