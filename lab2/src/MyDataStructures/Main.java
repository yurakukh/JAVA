package MyDataStructures;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {


    MyArrayList<String> stringList = new MyArrayList<String>(3);

    stringList.add("Peter");
    stringList.add("Joshua");
    stringList.add("Ben");

    stringList.display();

    stringList.remove(1);

        stringList.display();

        stringList.add("Vasiea");
        stringList.add("VaSSSS");

        stringList.display();

    }



}
