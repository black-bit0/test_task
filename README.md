>#  TEST TASK 
## RUNNING THE PROGRAM 
When we start program, we need write http://localhost:8080/inject/inject-all, this endpoint inject our articles and users after that we can use endpoint "/users/*" where we hawe 3 methods 
* "/by-age?age=?" - this endpoint use when we serch users in which age biger than same int value(http://localhost:8080/users/by-age?age=20) 
* "/by-color?color=?" - this endpoint use when we serch users in which article color is same color(http://localhost:8080/users/by-color?color=red) 
*  "/by-number?number=?" - this endpoint use when we serch users in which articles numbers more than variable number(http://localhost:8080/users/by-number?number=3)

these endpoints return text in JSON format
