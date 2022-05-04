package day46_static;

import day47_encapsulation.AccessModifier;

public class UsingAccessModifierFromDay47 {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
     // System.out.println(obj.b); set as default, so it's accessible only within the package it was created in
     // System.out.println(obj.c); set as private, so it's accessible only within the same class

        System.out.println(AccessModifier.x);
     // System.out.println(AccessModifier.y); set as default, so it's accessible only within the package it was created in
     // System.out.println(AccessModifier.z); set as private, so it's accessible only within the same class
    }
}
