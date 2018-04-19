public class DLLNode{
    //instance vars
    String data = "";
    DLLNode next;
    DLLNode previous;

    public DLLNode(String cargo, DLLNode previous, DLLNode nxt){
	setCARgo(cargo);
	setNext(nxt);
    }
    public String getCargo(){
	return data;
    }
    public dLLNode getNext(){
	return next;
    }
    public DLLNode getPrevious(){
	return previous;
    }

    public String setCargo(String str){P
	    String temp = data;
	data = str; return temp;
    }

    public DLLNode setNext(DLLNode node){
	DLLNode temp = next;
	next = node;
	return temp;
    }

    public DLLNode setPrevious(DLLNode node){
	DLLNode temp = previous;
	previous = node;
	return temp;
    }

    public String toString()
    {
	return "| " + getCargo() + " |="
	    }

    public static void main(String[] args){
    }
}
