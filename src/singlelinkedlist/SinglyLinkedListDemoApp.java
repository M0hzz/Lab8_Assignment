/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinkedlist;

public class SinglyLinkedListDemoApp {

   public static boolean contain3(int n){ //does int contain 3
      while(n > 0)
      {
         if(n % 10 == 3)
            return true;

         n=n/10;
      }
      return false;
   }

   public static void list3(LinkedList n, LinkedList n2){ //creates Linked list with digits that have 3
      Node temp = n.head;
      n2.append(temp);
      while(temp != null){
         if(contain3(temp.data) == true ){
            n2.append(temp);
         }
         temp = temp.next;
      }
   }
   public static boolean isPrime(int n) //check prime
   {
      // Corner case
      if (n <= 1)
         return false;

      // Check from 2 to n-1
      for (int i = 2; i < n; i++)
         if (n % i == 0)
            return false;

      return true;
   }
   public static void PrimeList(LinkedList prime, int n){
      for(int x = 0; x <= n; x++){
         if(isPrime(x) == true){
            Node nodeA = new Node(x);
            prime.append(nodeA);
         }
      }

   }
   public static int total(LinkedList n){
      Node temp = n.head;
      int total = 0;
      while(temp != null){
         total += temp.data;
         temp = temp.next;
      }
      return total;
   }
   public static void main(String[] args) {
      LinkedList numList = new LinkedList();
      Node nodeA = new Node(66);
      Node nodeB = new Node(99);
      Node nodeC = new Node(44);
      Node nodeD = new Node(95);
      Node nodeE = new Node(42);
      Node nodeF = new Node(17);

      numList.append(nodeB);   // Add 99
      numList.append(nodeC);   // Add 44, make the tail
      numList.append(nodeE);   // Add 42, make the tail

      numList.prepend(nodeA);  // Add 66, make the head

      numList.insertAfter(nodeC, nodeD);  // Insert 95 after 44
      numList.insertAfter(nodeE, nodeF);  // Insert 17 after tail (42)

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();

      // Remove the tail node, then the head node
      numList.removeAfter(nodeE);
      numList.removeAfter(null);

      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();

      LinkedList x = new LinkedList();
      PrimeList(x,83);
      System.out.println(' ');
      x.printList();

      System.out.println(contain3(569));

      LinkedList y = new LinkedList();
      System.out.println(' ');
      list3(x,y);
      x.printList();
      System.out.println(' ');
      y.printList();

      System.out.println(' ');
      System.out.println(total(y));
   }
}
