//NodeWay- James Huang, Richard Wong, Eddie Zhu
//APCS2 pd1
//L#02 -- All Hands on Deque!
//2018-04-19
//NOTE: This is a new version that works without typecasting everything

/*****************************************************
 * class Dequester
 * Implements Deque using doubly linked nodes
 *****************************************************/

public class QQKachoo<T> implements Deque<T> {

    //instance vars
    public DLLNode<T> _head, _tail;
    private int _size;
//default constructor
    public QQKachoo(){
	_head = _tail = null; //queue should have no elements at birth
	_size = 0;
    }

    public void addFirst(T e){ //adds to beginning of our Deque
	// new node becomes the head and its nextNode points to former head
	_head = new DLLNode<T>( e, null, _head );
	if (isEmpty()) {
	    _tail = _head; // head and tail should point to the same node
	}
	else {
	    // set former head's previous to new head
	    _head.getNext().setPrev( _head );
	}
	_size++;
    }

    public void addLast(T e){ //adds to end of our Deque
	// new node becomes the tail and its prevNode points to former tail
	_tail = new DLLNode<T>( e, _tail, null );
	if (isEmpty()) {
	    _head = _tail; // head and tail should point to the same node
	}
	else {
	    // set former tail's next to new tail
	    _tail.getPrev().setNext( _tail );
	}
	_size++;
    }

    public boolean isEmpty() {//new fxn to keep track of size(used for addFirst and addLast)
	return _size <= 0;
    }

    //returns size
    public int size() {
	return _size;
    }

    //returns value at first without removing
    public T peekFirst() {
	if (isEmpty())
	    return null;//will return this for now, exception handling a bit messy
	else {
	    return _head.getCargo();//returns the first element
	}
    }

    //returns value at last without removing
    public T peekLast() {
	if (isEmpty())
	    return null;
	else {
	    return _tail.getCargo();//returns the last element
	}
    }
    //removes the first element(one located at head)
	//runtime: O(1) as it just sets the pointer to the next element
    public T removeFirst() {
	if (isEmpty())
	    return null;
	else {
	    T ret = _head.getCargo();
	    _head = _head.getNext();//sets pointer to the next one
	    _size -= 1;//decrements size by one so we know the list is smaller
	    return ret;
	}
    }
    //removes the last element(one located at tail)
	//runtime: O(1) as it just sets the tail pointer to the previous element
    public T removeLast() {
	if (isEmpty())
	    return null;
	else {
	    T ret = _tail.getCargo();
	    _tail = _tail.getPrev();//sets end of list to previous one(does not refer to the current one anymore)
	    _size -= 1;
	    return ret;
	}

    }


    public static void main(String[] args){

	QQKachoo<String> test1 = new QQKachoo<String>();
	test1.addFirst("Ding");

	test1.addFirst("Dong");

	test1.addFirst("PING");

	test1.addFirst("pong");

	test1.addFirst("poong");



	test1.addLast("king");
       	test1.addLast("kong");
	test1.addLast("keng");
	test1.addLast("kang");
	System.out.println( test1.peekLast());//kang
	System.out.println( test1.removeLast());//kang
	System.out.println( test1.removeLast());//keng
	System.out.println( test1.removeLast());//kong
	System.out.println( test1.removeLast());//king
	System.out.println( test1.removeLast());//ding
	System.out.println( test1.removeLast());//dong
	System.out.println( test1.removeLast());//ping
	System.out.println( test1.removeLast());//pong
	System.out.println( test1.removeLast());//poong
	System.out.println( test1.removeLast());//should be null
	System.out.println("Testing remove and peekFirst");
	test1.addFirst("Ding");

	test1.addFirst("Dong");

	test1.addFirst("PING");

	test1.addFirst("pong");

	test1.addFirst("poong");



	test1.addLast("king");
	test1.addLast("kong");
	test1.addLast("keng");
	test1.addLast("kang");
	System.out.println(test1.peekFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	System.out.println(test1.removeFirst());
	//	**************/



    }

}
