package com.learn;

import jdk.jshell.PersistentSnippet;

public class hello {
    public static void main(String[] args) {
        Person p = new Person(66.5f,1.7f);
        p.hello();
        p.weight = 60;
        p.height = 1.5f;
        System.out.println(p.bmi());

        /*int i =32; //位元

        Integer age2 = 19;
        age2.byteValue();

        short s = 16; //位元
        long l = 64; //位元
        char c = 'A'; //單字元單引號
        Character c2 ='A';

        byte b = 8;//位元
        double d = 6.6;
        float f = 1.1f;
        boolean tf = true;
        String xd = "AAA"; //多字元雙引號*/

    }
}
