package com.kelani.v2;

public class Main {
    public static void main(String[] args){

        //Make sure to validate the arguments before using....
        if (args.length==0){
            System.out.println("Please provide th operation and the argument");
            return;
        }
        //another validation that we could do to these args?
        //add , sub , mul
         String  operator = args[0];
         if(!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
             System.out.println("Please provide add, sub or mul as the operator argument.");
             return;
         }

         System.out.println(args[0]);
    }


}
