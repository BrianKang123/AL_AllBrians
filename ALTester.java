import java.util.ArrayList;
public class ALTester{

  public static void main(String[] args){
    ArrayList<Integer> test = new ArrayList<Integer>();
    for(int i = 0 ; i < 23 ; i += 1){
      //test.add((int)(Math.random() * 10));
      test.add(i);
    }
    System.out.println(test.toString());
    System.out.println(isSorted(test));
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
