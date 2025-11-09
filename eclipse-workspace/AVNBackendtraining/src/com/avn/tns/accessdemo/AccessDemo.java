package com.avn.tns.accessdemo;

public class AccessDemo {
    public String name;
    private int contact;
    protected String village;
    // default with no keyword
    String college;

    public void display() {
        System.out.println("studentname:"+name);
        System.out.println("contactno:"+contact);
        System.out.println("location:"+ village);
        System.out.println("study:"+college);
        
    }
}
