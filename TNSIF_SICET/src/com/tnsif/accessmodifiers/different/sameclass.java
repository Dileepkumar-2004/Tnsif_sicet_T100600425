package com.tnsif.accessmodifiers.different;

import com.tnsif.accessmodifiers.same.accessmodifiers;

public class sameclass extends accessmodifiers {
    public void testProtectedAccess() {
        System.out.println("--- Accessing from Subclass (Different Package) ---");
        System.out.println("Public: " + publicVar);      // Accessible
        System.out.println("Protected: " + protectedVar); // Accessible because of Inheritance
        
        // System.out.println(defaultVar); // Error: Default is package-private
        // System.out.println(privateVar); // Error: Private is class-private
    }
}