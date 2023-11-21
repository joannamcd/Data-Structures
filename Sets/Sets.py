'''
SETS IN PYTHON
Sets internally implemented as Hash-Table
Unordered collection data type
it is ITERABLE, MUTABLE, with no duplicate elements
represented by {}
'''
#initializing a set
mySet = {10,5,12,4}

#adding values to mySet
mySet.add(15)
print("Set is: ", mySet)

mySet.add(10)
print("Set is: ", mySet)

#check if 5 is in the set mySet
print(5 in mySet)

#removing 5 
mySet.remove(5)
print(mySet)

#max element
print(max(mySet))

#min element
print(min(mySet))

#size of set
print(len(mySet))