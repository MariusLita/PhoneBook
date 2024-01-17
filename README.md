This is my java application which emulated a phone book.

Prerequiste
java version newer than 17.0.9 -> https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

Java Configuration :
Go to advance settings of environment variables and do the following:

	Add a JAVA_HOME environment variable with the path of your jdk version.
	Edit the path variable with the following : %JAVA_HOME%\bin
	Save it and re-launch the cmd

To run this this application you will need to have the path in the src folder and follow the next steps:

	Compile the application :  javac -d bin src/*.java
	Run the application: java -cp bin Proiect

After that the program will load a splashscreen with an image which can serve as an advertise. 
In order to enter in the main part of the application you need to go on "Ajutor" -> "Inregistrare". The application was created with a specific code to register. If you area using a different one the application will close.

The access code is : "java"

After you add the code you can use all the features within the application.
