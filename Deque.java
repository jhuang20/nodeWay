public interface Deque<Card> {
  private int _size;
  public void addFirst(Card e);

  public void addLast(Card e);

  public Card peekFirst();
  public Card peekLast();
  public Card removeFirst();
  public Card removeLast();
}
