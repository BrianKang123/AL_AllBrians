import java.util.ArrayList;

public class OrderedArrayList {
  private ArrayList<Integer> _data;

  public OrderedArrayList(){
    _data = new ArrayList<Integer>();
  }

  public boolean add(int newVal) {
    int idx = calcIndex(newVal);
    _data.add(idx, newVal);
    return true;
  }

  public int remove(int idx) {
    int temp = _data.get(idx);
    _data.remove(idx);
    return temp;
  }

  public int size() {
    return _data.size();
  }

  private int calcIndex(int newVal) {
    for (int i = 0; i < _data.size(); i += 1) {
      if (_data.get(i) > newVal) {
        return i;
      }
    }

    return size();
  }

  public String toString(){
    String result = "[";
    for(int i = 0 ; i < _data.size() ; i += 1){
      result += _data.get(i) + ", ";
    }
    if ( result.length() > 1 )
            //shave off trailing comma
            result = result.substring( 0, result.length() - 2 );
    result += "]";
    return result;
  }

}
