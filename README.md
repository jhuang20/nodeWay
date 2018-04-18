# nodeWay
James Huang, Richard Wong, Eddie Zhu
## To-do List
Organized in rough order of what we will implement!
### Instance Vars
**DLLNode _list//_will be the main deque that we  will be modifying_
**int size
### Methods
**size()** will tell us how many nodes there are in this deque, will be used in later functions.    
**addLast()** equivalent to enqueueing, this will add to the end of the deque(the Last element of the deque)     
**addFirst()** equivalent to enqueueing, this will add to the beginning of the deque(the first element of the deque)     
The functions above comprise the primary adding functions, and are the ones we will code first!    
**peekLast()** peeks at the last DLLNode in the deque, will be what we will remove if we call removeLast() (does not modify deque)    
**peekFirst()** peeks at the first DLLNode in the deque, will be what we will remove if we call removeFirst() (does not modify deque)    
The functions above are the functions that will allow us to view the elements we will remove in the future...    
**removeLast()** removes last element in deque, returns it    
**removeFirst()** removes first element in deque, returns it    
## Development Plan
We will implement addLast and addFirst(both of which need special cases if they are the first element in deque), using setNext or setPrev!. We will then implement peekLast and peekFirst using the getNext() or getPrev() method. It is possible that we will need an additional DLLNode that stores what element we need to remove from the beginning of the end of the list(we could call them _beginning and _end!_ )   
RemoveLast and removeFirst will be a relatively simple matter, we will just use the same architecture of peekFirst/Last, abd actually remove the element!

## Why we chose what we chose
In our deque, we decided to use a doubly linked list. 
**ArrayList** would allow for adding to the end and removing from the end in O(1) time. However, the nature of the functions in ArrayList mean that removing/adding from the beginning would be in O(n) time, assuming we use the baked in methods of ArrayList. There is, however, a rather memory-hungry of using ArrayList while preserving constant runtimes. If we use a tracker to keep track of the first occupied element, then we can remove without consequence. However, this has the potential pitfall of being memory hungry in large implementations.   
**Array** would also encounter similar issues if treated like ArrayList, and because it is not expandable upon creation, the size of the deque would be limited.
By using DLLNode, we have the flexibility of adding to the end, or the beginning of the deque by simply adding a node and adjusting pointers. All methods can thus be done in constant time, because all we have to do is change the pointer(which is constant time)
