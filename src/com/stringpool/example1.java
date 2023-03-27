package com.stringpool;

public class example1 {

    public static void main(String args[]){

        String str00 = "ram";
        String str01 = "ram";
        String str02 = "bam";               //content

        String str1= new String("Krishank");        //refernce
        String str2= new String("Krishank");
        String str3= new String("bam");
        String str4= new String("bam").intern();

        System.out.println(str00.equals(str01));
        System.out.println(str1.equals(str2));
        System.out.println(str02.equals(str3));
        System.out.println("-------------");
        System.out.println(str00==str01);
        System.out.println(str1==str2);
        System.out.println(str02==str3);
        System.out.println(str02==str4);

        System.out.println(str02.hashCode());
        System.out.println(str4.hashCode());

    }
}
