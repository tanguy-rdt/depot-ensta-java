package genie_logiciel.TPIntList;

public class ArrayIntStack extends ArrayIntList implements IntStack {

    @Override
    public int peek() {
        return super.getValueAt(getSize() - 1);
    }

    @Override
    public int pop() {
        return super.removeValueAt(getSize() - 1);
    }

    @Override
    public void push(int n) {
        super.add(n);
    }

    @Override
    public int size() {
        return super.getSize();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

}
