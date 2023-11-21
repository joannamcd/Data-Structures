
/* 
JAVASCRIPT
Sets internally implemented as Hash-Table

Collection of items that are unique, no repeats
ordered, can be iterated in the insertion order
can store any type of value whether primitive or objects

SYNTAX:
new Set([it]);

EXAMPLE:
array = [1,2,2,3,3,4,4,5] <- repeated values
Set = set(array)
SET(1,2,3,4,5) <- only stores unique values 

*/

const mine = new Set();

//inserting elements 
mine.add(10);
mine.add(5);
mine.add(12);
mine.add(4);

//print elements of the set
for(const i of mine){
    console.log(i);
}

//check if element is in set
if(mine.has(10)){
    console.log("Element is present in the set")
}

//delete element
mine.delete(5);

//print elements of the set after deleting 5
for(const i of mine){
    console.log(i);
}

//minimum element
console.log("Minimum element: " + Math.min(...mine));

//maximum element
console.log("Maximum element: " + Math.max(...mine));

//size of set
console.log("Size of the set is: " + mine.size);