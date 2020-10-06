package MyDataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<T>{

    private final int DEFAULT_CAPACITY = 10;

    private int size; //current number of elements in array
    private int capacity;

    private Object[] data;

    public MyArrayList(){
        this.capacity = DEFAULT_CAPACITY;
    }
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        size = 0;
    }




    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void add(T element) {

        if(isFull()) {
            expandCapacity();
        }

        data[size++] = element;
    }

//    public void add(int index, Dog dog){
//
//        if(isFull()){
//            expandCapacity();
//        }
//        if(index < 0 || index >= size){
//            throw new IndexOutOfBoundsException();
//        }
//
//
//        data[index] = dog;
//
//    }

    public Object remove(int index) throws Exception {
        if(isEmpty()){
            throw new Exception("ArrayList is already empty!");
        }else if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Object toRemove = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }

        size--;
        return toRemove;
    }


    public boolean contains(T element) {
        if(!isEmpty()){
            for(Object d: data){
                if(d == element) return true;
            }
        }
        return false;
    }


    private Object[] expandCapacity(){

        int newCapacity = (int)(capacity * 1.5 + 1);
        System.out.println(capacity + newCapacity);

        return data = Arrays.copyOf(data, newCapacity);
    }
    public void display(){
        for (int i = 0; i < size; i++){
            System.out.println(data[i]);
        }
    }

}
