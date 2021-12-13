# AL_AllBrians

Roster: Brian Kang, Brian Wang, Ryan Lau

# ALTester

In the main method of ALTester.java, we create an ArrayList called `unorder` and populate it with 23 random integers from [0,9].
We have also included a helper function called isSorted() that test if ArrayLists or our implementation of OrderedArrayLists are sorted.
We call the isSorted() method with the parameter of `unorder` which should most likely return false.
Then we initialize an OrderedArrayList and populate it with the elements in `unorder` using the add method.
We call the isSorted() method with the parameter of `order` which will always return true showing that OrderedArrayList maintains ascending order.

# OrderedArrayList

* **calcIndex**: returns the index of which an element should be introduced to maintain order
    * Takes an integer value newVal
    * For every element in the provided SuperArray, test whether or not the current element of SuperArray is less than the inputted value newVal. If true, return the index of the current element of SuperArray. At the end of the loop, return \_size (newVal is larger than or equal to the previous last element).

* **add**: inserts an element into \_data invariant that the new order of \_data is ascending
    * Takes an integer value newVal
    * Calls calcIndex
    * Calls SuperArray’s add(int, int) with the return value of calcIndex and newVal
    * Returns true

* **remove**: removes the last meaningful element of \_data or the element at provided index
    * Calls SuperArray’s remove with the same parameters provided (if any)
    * Returns the oldVal

* **size**: returns \_size
    * Calls SuperArray’s size method

* **toString**: returns a String representation of the OrderedArrayList in the following format: [0, 1, 2]

* **get**: returns the element of OrderedArrayList at the given index
