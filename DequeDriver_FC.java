//StillCold (Fiona Cai, Kevin Feng, Alexia Leong)
//APCS2 pd1
//Dequester Driver
/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeDriver_FC{
  public static void main(String[] args) {
    Dequester<String> iscream = new Dequester<String>();

    System.out.println("-----Adding to front------");
    iscream.addFirst("Chocolate");
    System.out.println(iscream.peekFirst()); //Chocolate
    iscream.addFirst("Vanilla");
    System.out.println(iscream.peekFirst()); //Vanilla
    iscream.addFirst("Strawberry");
    System.out.println(iscream.peekFirst()); //Strawberry
    iscream.addFirst("Mint");
    System.out.println(iscream.peekFirst()); //Mint

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.addLast("Pistachio");
    System.out.println(iscream.peekLast()); //Pistachio
    iscream.addLast("Coffee");
    System.out.println(iscream.peekLast()); //Coffee
    iscream.addLast("S'mores");
    System.out.println(iscream.peekLast()); //S'mores

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("-----Removing from front-----");
    iscream.removeFirst(); //Mint  dies
    System.out.println(iscream.peekFirst()); //Strawberry

    System.out.println("");

    System.out.println("-----Removing from end-----");
    iscream.removeLast(); //S'mores dies
    System.out.println(iscream.peekLast()); //Coffee

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    iscream.removeFirst();
    System.out.println(iscream);
    iscream.removeLast();
    System.out.println(iscream);
    iscream.removeFirst();
    System.out.println(iscream);
    iscream.removeLast();
    System.out.println(iscream);
    iscream.removeFirst();
    System.out.println(iscream);
    System.out.println("Empty now?: "+iscream.isEmpty()); //true
  }





}
