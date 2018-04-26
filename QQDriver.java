// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// L #02: All Hands on Deque!
// 2018-04-19r

/*****************************************************
 * class QQDriver
 * Driver for QQKachoo
 ******************************************************/

public class QQDriver {
    
    public static void main( String[] args ) {

	System.out.println( "-INITIATING TESTING-" );
	
	System.out.println( "Creating New Double-Ended Queue..." );
	Dequester<String> squashy = new Dequester();
	
	System.out.println( "Testing addFirst()..." );
	squashy.addFirst( "be" );
	squashy.addFirst( "it" );
	System.out.println( "squashy:" );
	System.out.println( squashy.toString() );	
	
	System.out.println( "Testing addLast()..." );
	squashy.addLast( "like" );
	squashy.addLast( "that" );
	System.out.println( "squashy:" );
	System.out.println( squashy.toString() );

	System.out.println( "Testing peekFirst()..." );
	System.out.println( squashy.peekFirst() ); // it

	System.out.println( "Testing peekLast()..." );
	System.out.println( squashy.peekLast() ); // that
	
	System.out.println( "Testing removeFirst()..." );
	System.out.println( squashy.removeFirst() ); // it
	System.out.println( squashy.removeFirst() ); // be
	System.out.println( squashy.removeFirst() ); // like
	
	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // false
	
	System.out.println( "Testing removeLast()..." );
	System.out.println( squashy.removeLast() ); // that

	System.out.println( "Testing isEmpty()..." );
	System.out.println( squashy.isEmpty() ); // true

	System.out.println( "-TERMINATING TESTING-" );
	
	/* ----- SQUASH ---------
	   -------- SQUAD -------- */
	
    } // end of main method

    
} // end of QQDriver class
