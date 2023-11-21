#include <iostream>
#include <set>
using namespace std;
/*
SETS IN C++
Internally implemented as Self-Balancing Binary Search Tree
each element has to be unique bc the value of element identifies it
values are stored in a specific sorted order (ascending or descending)

TYPES:
set<int>st
unordered_set<int>st
multiset<int>st

SYNTAX:
std::set <data_type> set_name;

In C++ Set which uses Self-Balancing Binary Tree (BST):
- elements are stored in the nodes of a binary tree
- left subtree of any node contains only elements smaller than the node's value
- right subtree contains only elements larger than the node's value
- ensures elements are always sorted in ascending order

Adding an element:
- start at root, compare the element to the node's value
- if less than, traverse to the left subtree and repeat
- if greater than, traverse to the right subtree and repeat
- if same value, you don't add the element - NO DUPLICATES

Remove an element:
- search for the node containing the element, by same process to add an element
- if found, 3 cases to consider:
1. The node has no children: remove the node from the tree
2. The node has one child: replace the node with its child
3. The node has two children: find the minimum element in the right subtree of the node (leftmost node in the right subtree)
    and replace the node's value with that element.
    then remove the duplicate element from the right subtree.

        10
      /    \
    5        12
  / 
4

*/



int main(){
    
    //initializing set
    set<int> mine;
    
    //insert into set
    mine.insert(10);
    mine.insert(5);
    mine.insert(12);
    mine.insert(4);

    //print elements 
    for (auto i : mine){
        cout << i << ' ';
    }
    cout << endl;

    //check if element in set
    if(mine.count(10) == 1){
        cout << "Element is present in the set" << endl;
    }

    //remove from set
    mine.erase(5);
    
    //print elements
    for(auto it : mine){
        cout << it << " ";
    }
    cout << endl;

    //min element in set
    cout << "Minimum element: " << *mine.begin()
        << endl;
    
    //max element in set
    cout << "Maximum element: " << *(--mine.end())
        << endl;
    
    //size of set
    cout << "Size of the set is: " << mine.size()
        << endl;

    return 0;
}
