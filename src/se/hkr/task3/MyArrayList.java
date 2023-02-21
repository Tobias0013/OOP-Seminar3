package se.hkr.task3;

import java.util.Arrays;

public class MyArrayList<E> {
    private E[] arr;
    private int size;

    public MyArrayList() {
        this.arr = (E[]) new Object[10];
        this.size = 0;
    }

    public MyArrayList(E[] arr) {
        this.arr = arr;
        this.size = arr.length;
    } //maby stay

    public String totalLength(){
        return String.valueOf(arr.length);
    }

    private void addSize(){ //grow?
        arr = Arrays.copyOf(arr, arr.length + 10);
    }

    public void add(E obj){
        if (arr.length == size)
            addSize();

        this.arr[this.size] = obj;
        this.size++;
    }

    public E get(int i){
        if (i < 0 || i > size - 1)
            return null;
        return arr[i];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        boolean empty = true;
        for (E e :
                arr) {
            if (e != null){
                empty = false;
                break;
            }
        }
        return empty;
    }
}
