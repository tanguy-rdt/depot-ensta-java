package genie_logiciel.TPIntList;

public class ArrayIntList implements IntList {

    private int size;
    private int[] internalArray;

    public ArrayIntList(int capacity) {
        this.size = 0;
        this.internalArray = new int[capacity];
    }

    public ArrayIntList() {
        this(10);
    }

    private void growCapacity() {
        int[] nextInternalArray = new int[internalArray.length * 3/2];
        for (int index = 0; index < this.size; index++) {
            nextInternalArray[index] = this.internalArray[index];
        }
        this.internalArray = nextInternalArray;
    }

    @Override
    public void add(int n) {
        if (this.size >= internalArray.length) {
            this.growCapacity();
        }
        this.internalArray[this.size] = n;
        this.size += 1;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getValueAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return this.internalArray[index];
    }

    @Override
    public int removeValueAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Index out of bound");
        }
        int result = this.internalArray[index];
        this.size -= 1;
        for (int i = index; i < this.size; i++) {
            this.internalArray[i] = this.internalArray[i+1];
        }
        return result;
    }

}

