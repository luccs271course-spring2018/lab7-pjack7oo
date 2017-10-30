What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
So they can be called by the method that controls them so they alone are recursive and also so strings and data can be
saved out side the auxiliary method but still be only available to that method

Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
So that data can be saved as it keeps repeating the code within its self so as it keeps on going it is storing the
values it went through and it has the next value to use

What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
printReverse: time O(n) space O(n) populateList: time O(n) space O(n) populateFifoList: time O(n) space O(n)

Which of these methods can be implemented using while loops?
all three can be done using a while loop