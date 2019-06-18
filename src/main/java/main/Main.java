package main;


import java.util.Arrays;
import java.util.List;

/*
Adapter Pattern is similar to a plug adapter. Think of a Dongle for your mac there
can be a lot of different ones.


We use this when we want a client to talk to an existing interface. Usually when one
module or feature can't be changed (like a legacy app)

Translates Requests

It is client centric

 */
public class Main {
    public static void main(String Args[]){

        Integer[] arrayofInts = new Integer[] {2,4,5,6};
        List<Integer> listofInts = Arrays.asList(arrayofInts);

        System.out.println(arrayofInts);
        System.out.println(listofInts);

    }
}
