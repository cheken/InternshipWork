# InternshipWork
Good day, Please enter loadshedding doc and kindly find Loadshedding.java and download to your desktop.

# To run the file:
* First create a folder and save the file on your desktop for easy access.
* When in the folder of the saved Loadshedding java, click on the URL bar at the top where the name of the folder appears and type in'cmd'
* This accesses the command line prompt while ensuring the pathing is correct
* Type in: "javac Loadshedding.java" to access the java compiler.(I've also uploaded the class file)
* Once the class file is in the folder type in: "java Loadshedding" to initiate the program.
* From here simply enter your region (1 - 16) to find corresponding loadshedding times.
* Once done, type: "Exit" to end program.

# Description:
This program works according to a loadshedding calendar provided by Eskom via: https://www.capetown.gov.za/Loadshedding1/loadshedding/maps/Load_Shedding_All_Areas_Schedule_and_Map.pdf
The program takes user input in the form of a region between 1 and 16. The program will then access the day of the month and time from the users desktop.
The code creates the laodshedding calendar and assigns regions to an array of different days.
It will then search the array according to the user input and day to then display the current schedule for that day.
The code will then compare the desktops time with an array contacting different times, if the time falls within the loadshedding zone, it will then work out the difference between the times and present to the user the time remaining for their loadshedding period.
The program will then loop to receive another region input until the user types in the prompt "Exit", ending the simulation.

# Components of code:
The code combines user input with multiple array manipulations to deliver the loadshedding schedule. It also involved multiple mathematical calculations to calculate the loops and iterations for the arrays, as well time values for the difference in desktop time and time remaining for the loadshedding. A while loop starts the program to ensure the code runs until stopped. Plenty of conditional statements like ifs and elses were used and boolean ones as well for the specific conditions.

# Discussion:
I'll be the first to admit that the code isnt the cleanest. Each day of the month was hard coded in when a simpler method using nested arrays could of made the code a lot shorter. My response to this is that I did start of with that initially becauseI noticed a pattern in the laodshedding regions (every 2nd day) was the same but I soon realised that the array method was far more complicated than intially planned and an easier way out was coding in the days manually. I maybe didnt add enough comments for your liking and the variable naming convention is quite erratic and makes the code hard to follow or correct. My apologies for this. I do want to bring to light that my Final year exams are next week and thats the reason for the  somewhat rushed code and early submission. My priorities do lie there but as a benifit for my case, I will be wiring for a week and the remainder of the semester I may only have 1 test and exam so my main focus will be the internship(If i do get it) and my thesis.

# Conclusions:
Overall I am happy that the code does what you have asked for(I pray) and no bugs were found, I do however believe that it could have been improved visually to make it more readable and pleasing to the eye. None the less, I thank you for the opportunity, it was a fun little project to work on.
