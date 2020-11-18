# Project-1
Project 1
Use generics to create a Java class called Trio that represents a group of three items.
Project Description
A Trio is a class representing a data structure that holds a group of three items. A Trio object has
the following characteristics:
Trios hold three items of the same type.
For example, a Trio could hold three Integers or it could hold three Strings or it could hold
three Students, etc. A Trio could not, however, hold two Integers and a String.
A Trio can contain duplicates.
A Trio's items are unordered.
The order doesn't matter. (This is like a set in mathematics. A Trio is different from a set,
however, because a Trio can contain duplicates.)
For example, the Trio (3, 4, 5) is considered the same as the Trio (4, 5, 3) and the Trio
("hi", "bye", "hello") is considered the same as the Trio ("hello", "hi", "bye").

Class must compile, use generics, and have the following:
-instance data variables to store the three items contained in the Trio
-two constructors:
     one constructor takes in the three items as parameters
     a second constructor takes in a single item and the Trio will then consist of three of these
     items
-for full credit, reduce duplicated code in the constructors and follow best practices for
     overloading constructors
-getters and setters for each item in the trio
-a toString method that returns a text representation of the trio
-a method called reset that takes in one item as a parameter and modifies the Trio
     to hold three of that item
-a method called count that takes in an item and returns a count of how many
     times that item is in the Trio
-a method called hasDuplicates that returns true if the at least two items within the
     Trio are the same as each other
Note this does not determine duplicates based on whether any of the items are aliases,
but whether any of the items are equal- logically equivalent to each other.
-an equals method that overrides the equals method of the Object class
The method returns true if the current Trio holds the same (logically equivalent) three
items in any order as the Trio sent as a parameter and false otherwise.

For full credit:
the method should not alter either the current Trio object or the Trio object passed in
as a parameter
the method should work correctly when the Trios hold duplicates
the method should ignore the order of the three elements
Be sure to test your method with different cases, particularly cases where the Trios have
duplicate items! (Use the provided tester file!)
-Style:
follow Java coding conventions
follow general best practices and principles of object-oriented programming
properly format and indent code
follow naming conventions for variables, classes, and methods
reduce duplicated code
Provided Files

Given a driver program to test your Trio class. You might choose to add additional code and
test cases. I strongly recommend running this tester to ensure your code compiles and runs
correctly.
