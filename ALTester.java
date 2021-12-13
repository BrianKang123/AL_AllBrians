import java.util.ArrayList;
public class ALTester{

  public static void main(String[] args){
    ArrayList<Integer> unorder = new ArrayList<Integer>();
    for(int i = 0 ; i < 23 ; i += 1){
      unorder.add((int)(Math.random() * 10));
      //unorder.add(i);
    }
    System.out.println(unorder.toString());
    System.out.println(isSorted(unorder));

    OrderedArrayList order = new OrderedArrayList();
    for(int i = 0 ; i < 23 ; i += 1){
      order.add(unorder.get(i));
      //order.add(i);
    }
    System.out.println(order.toString());
    //isSorted is not made to handle OrderedArrayLists, but they should be in order regardless
    //System.out.println(isSorted(order));

  }

  public static boolean isSorted(ArrayList<Integer> al){
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
