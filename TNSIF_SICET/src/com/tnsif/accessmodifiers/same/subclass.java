package com.tnsif.accessmodifiers.same;

public class subclass extends accessmodifiers {
    public void testAccess() {
        System.out.println(publicVar);    
        System.out.println(protectedVar); 
        System.out.println(defaultVar);   
        // System.out.println(privateVar); //  (Error)
    }
}