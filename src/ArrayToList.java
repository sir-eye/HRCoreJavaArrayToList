import java.util.ArrayList;

// Implements the MyList Interface
class ArrayToList implements MyList {
    private ArrayList<String> arrayToList;

    public ArrayToList() {
        arrayToList = new ArrayList<>();
    }
    @Override
    public void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
        }
    }
    @Override
    public void replace(int idx) {
        if (idx >= 0 && idx < arrayToList.size()) {
            String replaced = arrayToList.get(idx);
            arrayToList.set(idx, "");
            System.out.println("I have replaced the string: " + replaced + " with the empty string at index: " + idx);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    @Override
    public ArrayList<String> compact() {
        ArrayList<String> compactedList = new ArrayList<>();
        for (String s : arrayToList) {
            if (!s.isEmpty()) {
                compactedList.add(s);
            }
        }
        return compactedList;
    }
}