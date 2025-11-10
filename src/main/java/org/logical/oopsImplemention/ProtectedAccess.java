package org.logical.oopsImplemention;

import org.logical.oops.ProtectedKeyword;

public class ProtectedAccess extends ProtectedKeyword {

    public static void main(String[] args) {

        ProtectedKeyword parentObject = new ProtectedKeyword(); // Parent Object

        // pk.age=20; Compile Time Error | Parent Class Object cannot access the Protected Members.

        ProtectedAccess childObject = new ProtectedAccess();  //Child Object
        childObject.age = 12; // Only child object can access the protected members.

    }


}
