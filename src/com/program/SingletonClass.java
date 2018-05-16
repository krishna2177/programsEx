package com.program;

class Singleton {
public static Singleton single=null;
private Singleton() {
	System.out.println("This is a private constructor...");
}
public static Singleton getSingle() {
	if(single == null) {
		single=new Singleton();
		return single;
	}
	return single;
}
}
public class SingletonClass {
    public static void main(String[] args) {
    	Singleton single=Singleton.getSingle();
    	System.out.println(single);
    	System.out.println(single);
    }
}
