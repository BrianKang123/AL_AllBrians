import java.util.ArrayList;

public class ALTester{
  public static void main(String[] args){
    ArrayList<Integer> unorder = new ArrayList<Integer>();
    System.out.println("normal ArrayList after initialization: " + unorder);
    for(int i = 0 ; i < 23 ; i += 1){
       unorder.add((int)(Math.random() * 10));
       // unorder.add(i);
    }
    System.out.println("normal ArrayList after populated with 23 random values: " + unorder);
    System.out.println("normal ArrayList is sorted?: " + isSorted(unorder));
    System.out.println("===========================");

    OrderedArrayList order = new OrderedArrayList();
    System.out.println("OrderedArrayList after initialization: " + order);
    for(int i = 0 ; i < 23 ; i += 1){
      order.add(unorder.get(i));
    }
    System.out.println("OrderedArrayList after populating with the values of normal ArrayList: " + order);
    System.out.println("OrderedArrayList is sorted?: " + isSorted(order));
  }

  public static boolean isSorted(ArrayList<Integer> al){
    int prev = al.get(0);
    for(int i = 1 ; i < al.size() ; i += 1){
      if(al.get(i).compareTo(prev) < 0){
        return false;
      }
      prev = al.get(i);
    }
    return true;
  }

  public static boolean isSorted(OrderedArrayList al){
    int prev = al.get(0);
    for(int i = 1 ; i < al.size() ; i += 1){
      if(al.get(i) < prev){
        return false;
      }
      prev = al.get(i);
    }
    return true;
  }
}
