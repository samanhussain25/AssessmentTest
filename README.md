How to run the code:
  - I added a testng runner file so all the tests can be run from the runner file or individually by running each class.
  
Bugs found: 
 - Header content-Type was missing and without the header we were getting status code '415 unsupported media type' for POST and PUT request.

Thought Process:
 - I used rest assured library to automate these api tests which is a JAVA library.
 - Added a different class for each API action.
 - Used JSON simple library to send header and payload requests for POST and PUT request,
 - Used TestNG assertions to assert the status code.
 - 
