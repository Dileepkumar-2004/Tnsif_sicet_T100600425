package com.tnsif.accessmodifiers.different;

import com.tnsif.accessmodifiers.same.accessmodifiers;

public class differentclass {
    public void test() {
        accessmodifiers obj = new accessmodifiers();
        System.out.println(obj.publicVar); // ONLY public is accessible
        // System.out.println(obj.protectedVar); // Error
        // System.out.println(obj.defaultVar);   // Error
    }
}