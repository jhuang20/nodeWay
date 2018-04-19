//Nodeway- James Huang, Richard Wong, Eddie Zhu
//APCS2 pd1
//L#02 -- All Hands on Deque!
//2018-04-19
public class Dequester implements Deque{

    //instance vars
    private DLLNode<Card> _list, _tail;
    private int _size;

    public Dequester(){
	_list = new DLLNode(null, null, null);
    }
      
    public void addFirst(Card e){ //adds to beginning
	
    }
    
    public void addLast(Card e){ //adds to end
    }

    
    public static void main(String[] args){

	Dequester<String> test1 = new Dequester<String>();
	test1.addFirst("Ding");
	test1.addFirst("Dong");
	test1.addFirst("PING");
	test1.addFirst("pong");
	test1.addFirst("poong");

	System.out.println(test1._list.toString());

	test1.addLast("king");
       	test1.addLast("kong");
	test1.addLast("keng");
	test1.addLast("kang");

      	System.out.println(test1._list.toString());



    }
    
}
