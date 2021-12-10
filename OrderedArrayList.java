import java.util.ArrayList;

public class OrderedArrayList {
  private ArrayList _data;

  public boolean add(int newVal) {
    int idx = calcIndex(newVal);

    
  }

  public int remove() {

  }

  public int remove(int index) {

  }

  public int size() {
    return _data.size()
  }

  private int calcIndex(int newVal) {
    for (int i = 0; i < _data.size(); i += 1) {
      if (_data.get(i) < newVal) {
        return i;
      }
    }

    return size();
  }

}
