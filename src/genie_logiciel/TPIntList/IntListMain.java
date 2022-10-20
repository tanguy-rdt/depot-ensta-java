package genie_logiciel.TPIntList;

public class IntListMain {

    static public void print(IntList list) {
        System.out.println("Size: " + list.getSize());
        for (int index = 0; index < list.getSize(); index++) {
            System.out.println("Index: " + index + " Value: " + list.getValueAt(index));
        }
    }

    static public void main(String args[]) {
        //IntList list = new ArrayIntList(2);
        IntList list = new DelegateIntList(); // on a le meme resultat avec l-1
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(5);
        print(list);

        int removed = list.removeValueAt(2);
        System.out.println("Removed: " + removed);

        print(list);
    }

}
