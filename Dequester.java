//NodeWay- James Huang, Richard Wong, Eddie Zhu
//APCS2 pd1
//L#02 -- All Hands on Deque!
//2018-04-19

/*****************************************************
 * class Dequester
 * Implements Deque using doubly linked nodes
 *****************************************************/

public class Dequester<T> implements Deque<T> {

    //instance vars
    public DLLNode _head, _tail;
    private int _size;

    public Dequester(){
	_head = _tail = null; //queue should have no elements at birth
	_size = 0;
	/**
	_head = new DLLNode(null, null, _tail);
	_tail= new DLLNode(null, _head, null);//links the two lists
	**/
    }

    public void addFirst(T e){ //adds to beginning
	// new node becomes the head and its nextNode points to former head
	_head = new DLLNode( (String) e, null, _head );
	if (isEmpty()) {
	    _tail = _head; // head and tail should point to the same node
	}
	else {
	    // set former head's previous to new head
	    _head.getNext().setPrev( _head );
	}
	_size++;

	/**
	 //This would result in some conflicts because _tail would be null
	 //if there was only 1 node

	if (isEmpty()) {
	    _head = new DLLNode(e, null,_tail);//makes this the first element, sets _tail as end

	}
	_head = new DLLNode(e, null, _head);//puts current item in front, makes rest of _list the CDR
	**/
    }

    public void addLast(T e){ //adds to end
	// new node becomes the tail and its prevNode points to former tail
	_tail = new DLLNode((String) e, _tail, null );
	if (isEmpty()) {
	    _head = _tail; // head and tail should point to the same node
	}
	else {
	    // set former tail's next to new tail
	    _tail.getPrev().setNext( _tail );
	}
	_size++;

	/**
	   //This would result in some conflicts because _head would be null
	   //if there was only 1 node
	if (isEmpty()) {
	    _tail=new DLLNode(e, _list, null);//sets this one as the last one
	}
	_tail=new DLLNode(e, _tail, null);//links this to the previous last element, puts it after
	**/
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
	    return null;
	else {
	    return (T)_head.getCargo();
	}
    }

    //returns value at last without removing
    public T peekLast() {
	if (isEmpty())
	    return null;
	else {
	    return (T)_tail.getCargo();
	}
}
  public T removeFirst() {
    if (isEmpty())
      return null;
    else {
      T ret=(T)_head.getCargo();
      _head=_head.getNext();
      _size-=1;
      return ret;
    }
  }
  public T removeLast() {
    if (isEmpty())
      return null;
    else {
      T ret=(T)_tail.getCargo();
      _tail=_tail.getPrev();
      _size-=1;
      return ret;
    }

  }


    public static void main(String[] args){

	Dequester test1 = new Dequester();
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
