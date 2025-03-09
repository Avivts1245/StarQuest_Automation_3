Page objects 

WebPage - a general object that holds the definition of the selectors for the email and password fields, along with `get` functions.

LoginPage - an object for the login page, inheriting from the WebPage. This object holds the definition of the selectors for all relevant parameters on this page, along with get functions.
 
SignUpPage - an object for the sign-up page, inheriting from the `WebPage`. This object holds the definition of all the relevant parameters on the sign-up page, along with `get` functions.

Forgot_Password_Page - an object for the password recovery page, inheriting from the `WebPage`. This object holds the definition of all the relevant parameters on the password recovery page, along with `get` functions.

Email - an object that centralizes all the validation functions for email input.

Password- an object that centralizes all the validation functions for Password input.

Name- an object that centralizes all the validation functions for Name input (first and last name).

LogInClicksTests - an object that centralizes all the click tests for the login page (for all buttons).

Open_Page_Runs - an object designed to centralize all the execution functions for the login/sign-up process. The purpose of this object is to consolidate the functions and shorten the `main` method.

Dashboard - an object for the dashboard page. This object contains the definition of the selectors for the page, along with the selectors for the toolbar, along with `get` functions.

Dashboard_Tests - an object that contains all the tests for the dashboard page, along with tests for the toolbar.

Daily_Report - an object that contains the definition of the selectors for the daily report, along with `get` functions.

DailyReportsTests - an object that contains the tests for the daily report.



