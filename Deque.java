//NodeWay- James Huang, Richard Wong, Eddie Zhu
//APCS2 pd1
//L#02 -- All Hands on Deque!
//2018-04-19

public interface Deque<T> {

  public void addFirst(T cargo);//adds to beginning

  public void addLast(T cargo);//adds to end

  public T peekFirst();//peeks at element being removed in front
  public T peekLast();//peeks at element being removed in back
  public T removeFirst();//remove first element
  public T removeLast();//remove last element
  public int size();
}
