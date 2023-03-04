# Overview

Meal Planning App in Java

This app allows users to make a weekly meal plan. It takes user input and will add it to a text file for the user to read later. 
- The user will begin by inputing the start date and end date in MM-DD-YY format.
- Then the user will input that they want to eat for dinner each day.
- After the user can select the save button at the bottom of the screen. 
- The user can then find the file in the files app in te internal storage section within the documents folder.

This app allows for indavidules that struggle maintaning a healthy meal plan be better prepared and organized each week. 

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

The app was created within Android Studio using Java

This app includes an xml file that constructs all the user interface. 
This includes text and button widgets.

I had to import these libraries for this app:
- java.io.File: Allows for creating a file
- java.io.FileWriter: Allows for writing to file
- java.io.IOException: Throws an error if using file does not work

Within the Java file it calls each widget and takes the text the user inputs and turns them into strings
Those stings are then added to a text file when the button widget is pressed.

# Useful Websites

* [How to create a mobile app on AndroidStudio](https://www.youtube.com/watch?v=uPkjgVv5Ioc)
* [How to create and add to text file](https://stackoverflow.com/questions/8152125/how-to-create-text-file-and-insert-data-to-that-file-on-android)
* [Java W3Scools](https://www.w3schools.com/java/default.asp)

# Future Work

* Allow user to see available text files and open them to add or change
* Allow user to share files between users using a cloud based data base
* Create a Calander UI for easier browsing
* Create a second screen storing recipies for meals

