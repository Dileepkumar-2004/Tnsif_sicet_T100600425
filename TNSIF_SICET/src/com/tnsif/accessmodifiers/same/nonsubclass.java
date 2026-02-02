package com.tnsif.accessmodifiers.same;

public class nonsubclass {
    public void test() {
        accessmodifiers obj = new accessmodifiers();
        System.out.println(obj.publicVar);    
        System.out.println(obj.protectedVar); 
        System.out.println(obj.defaultVar);   
    }
}