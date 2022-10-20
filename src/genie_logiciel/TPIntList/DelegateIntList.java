package genie_logiciel.TPIntList;

import java.util.ArrayList;
import java.util.List;

public class DelegateIntList implements IntList {
    private final List<Integer> internalList;

    public DelegateIntList() {
        this.internalList = new ArrayList<>();
    }

    @Override
    public void add(int n) {
        this.internalList.add(n);
    }

    @Override
    public int getSize() {
        return this.internalList.size();
    }

    @Override
    public int getValueAt(int index) {
        return this.internalList.get(index);
    }

    @Override
    public int removeValueAt(int index) {
        return this.internalList.remove(index);
    }

}
