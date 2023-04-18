package P07_this_Keyword.P07_01_this_Keyword_cons_method;

public class Student {
    /*
    * 1- can use this a cons_method but should use in firs line.
    *
    * 2- if we want to run cons_method in other cons_method+
    * should set this()parameter as cons_method that want to run.
    *
    * Example:
    * */
    ///////////////////////////////////////
    private static final String s ="";

    Student(){

    }

    //1:
    Student(String s){
        this(); /*call Student()*/
    }

    //2:
    Student(String ss , int a){
        this(s);    /*call Student(String s)*/
    }
}
