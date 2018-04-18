public interface Deque<Card> {
  private DLLNode<Card> _list;
  private int _size;
  public void addFirst(Card e);//adds to beginning

  public void addLast(Card e);//adds to end

  public Card peekFirst();//peeks at element being removed in front
  public Card peekLast();//peeks at element being removed in back
  public Card removeFirst();//remove first element
  public Card removeLast();//remove last element
  public int size();
}
