public class DequeTester{
    public static void main(String []args){
    	Dequester<String> test1 = new Dequester<String>();

    	System.out.println(test1.isEmpty());

    	test1.addFirst("cat");
    	test1.addLast("cat");
    	test1.addFirst("dog");
    	test1.addLast("dog");
    	test1.addFirst("elephant");
    	test1.addLast("elephant");
    	test1.addFirst("child");
    	test1.addLast("child");
    	test1.addFirst("flag");
    	test1.addLast("flag");
    	test1.addFirst("pear");
    	test1.addLast("pear");
        test1.addFirst("F");
        test1.addLast("E");

    	System.out.println(test1);
    	System.out.println(test1.isEmpty());
	/*
    	System.out.println("\ntest iterator");
    	for(String x:test1)
    		System.out.println(x);

        System.out.println("\ntest diterator");
        Iterator<String> it = test1.diterator();
        while(it.hasNext())
            System.out.println(it.next());*/

    	System.out.println("\nremoveing");
    	while(!test1.isEmpty()){
    		System.out.println(test1.peekFirst() + "\t" + test1.removeFirst());
    		System.out.println(test1.peekLast() + "\t" + test1.removeLast());
    	}

    	System.out.println("\n"+test1);
    	System.out.println(test1.isEmpty());

	/*
	QQKachoo<String> itestf = new QQKachoo<String>();
	QQKachoo<String> iteste = new QQKachoo<String>();
	for (int i = 0; i<10; i++){
	    itestf.enqueueFront(i+"");
	    iteste.enqueueFront(i+"");
	    
	}

	Iterator<String> f = itestf.iterator();
	Iterator<String>e=iteste.diterator();

	
	System.out.println(itestf);

	while (f.hasNext()){
	    System.out.print(f.next()+ " ");
	    f.remove();
	}
	System.out.println(itestf);
	System.out.println(iteste);

	while (e.hasNext()){
	    
	    System.out.print(e.next()+ " ");
	    e.remove();
	}
	System.out.println(iteste);*/
    }
}
