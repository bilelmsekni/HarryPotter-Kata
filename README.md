Harry Potter Kata BDD
===============================

This Kata will help candidates learn about BDD development. 
The .Net version is using SpecFlow & NUnit while the Java implementation is based on Cucumber JVM and JUnit.

Table of Contents
=================

  1. Preparing your machine
  2. Harry Potter Kata
  3. Understanding solution
  4. Licensing
  5. Contacts
  6. Credits

Preparing your machine
===============

1.1. Java
-----------------

* Download the package and unzip it. Next, import the project inside the Java folder as a Maven project inside Eclipse.

* Make sure that you are using JDK and not JRE.

* Run a build using RunAs => Maven Test

* Run tests using RunAs => JUnit Tests on the BddTestRunner.java File.


2.1. Installing Visual Studio
-----------------

* Download visual studio installation from the link below and install it on your machine:

   https://www.visualstudio.com/en-us/products/visual-studio-community-vs.aspx

2.2. Adding Visual Studio extensions
--------------------------------

* SpecFlow extension adds to visual studio the necessary BDD project templates:

   Open Visual Studio and go to Tools > Extensions and Updates.
   Search for SpecFlow on the online visual studio gallery and add it.

* Because we will be using Nunit, it will be useful to add Nunit test adapter 3 extension to visual studio in order to run tests from within the test explorer:

   Open Visual Studio and go to Tools > Extensions and Updates.
   Search for NUnit test adapter on the online gallery and add it.

2.3. Creating the test project
---------------------------

* Finally, create a new library project and add reference to the following packages via Nuget Manager console:

   Open Visual Studio and go to Tools > NuGet package manager > NuGet package manager console and type these commands.

   Install-Package NUnit
   
   Install-Package SpecFlow
   
Harry Potter Kata
===============

You would like to buy the famous Harry Potter books but you have little money in your pocket 
so you would like to write a program to help you estimate the total cost of your purchase.

The rules are:

- A book costs 8 euros
- There are 5 volumes
- To get a discount, you must buy books of different volumes:
	* Buying 1 book doesn't give you a discount
	* Buying 2 books applies a 5% discount
	* Buying 3 books applies a 10% discount
	* Buying 4 books applies a 15% discount
	* Buying 5 books applies a 20% discount
	
Examples:

	Given a basket
	When I buy 2 books of volume 1
	Then the total is 16 euros	

	Given a basket
	When I buy 1 book of volume 1
	And I buy 1 book of volume 2
	Then the total is 15.2 euros
	
Understanding the solution
===============

- EstimatePurchaseV1: Create your first feature, generate the steps and check if the test runs ok.
- EstimatePurchaseV2: Write multiple scenarios and notice how the same steps can share their implementation. Change step scope if necessary.
- EstimatePurchaseV3: Use step sharing to reuse the existing code and reduce the amount of code parameters to write for a scenario.
- EstimatePurchaseV4: Demonstrate how tables and its helpers can be used.
- EstimatePurchaseV5: Use the scenario outline to make a more clear concept and reduce code amount.
- Note: The .Net implementation is using scopes to separate between steps where Java is using dependency injection to share the basket values.

Licensing
===============

HarryPotter KataBDD is licensed under a Creative Commons Attribution 3.0 Unported License.

![ScreenShot](http://i.imgur.com/4XWrp.png)

To view a copy of this license, visit [ http://creativecommons.org/licenses/by/3.0/deed.en_US ].

Contacts
===============

Bilel Msekni (msekni.bilel@gmail.com)

Credits
===============

Thanks Pierre Gillon for the subject of this Kata: http://www.pierregillon.com/2013/10/bdd-lexemple-du-kata-potter.html
