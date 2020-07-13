#**Arrays and String**

##**HashTables**

A HashTable maps keys to values for high efficient lookup.

####**Implementation**

Can be implemented using a array of LinkedList and a Hash function
	
- Compute the key's hash code. Two keys can have the same has value
- Map the hash code to value in array.
- There is a linked list of keys and values. Store key and value at this index. Incase of collision, the linked list is added with the new value.

**Time complexity : worst case O(N) , best case O(1)**

####Alternate Implementation
Use a binary search tree instead of linked list which gives us O(log n) look up time.
The keys are also stored in an ordered manner.

##**ArrayList and Resizable Arrays**

Most language has array as resizable. Java has fixed size and can't be changed once initialized.
In an Arraylist, the array resizes still maintaining the O(1) retrieval. Typically, when the array is 50% full, the size is doubled.

**Amortized Insertion runtime**
Suppose you have an array of size N. Working backwards we compute how many elements we added at each size increase. When we increased size to K, the size of array was K/2. We copied K/2 elements to new array.

Computing - N/2 + N/4 + N/8 + …+2+1 is always less than N. Time complexity : Worst case O(N), best case O(1)
	


##**StringBuilder
A concatenation of string copy the string character by character each time. The time complexity is O(xn^2)
A StringBuilder is resizable  array of all the string. The string is only created when required
