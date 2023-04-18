package P04_Method_Overloading;

public class Student {
    private int age;
    private int degree;
    private String name;

    /////////////////////////////

    /*
    * - in method overloading we have some condition:
    * -1 kind and number of data_type's should be different.
    * -2 arity should use in over of input argument.
    * -3 in method over loading kind of method and access modifier+
    * can't be effected.
    * Example:
    * */
    //1(kind and number of data_type's should be different.):
    void m1(){}
    void m1(int i){}
    void m1(String s , int i){}

    //2(arity should use in over of input argument.):
    void m1(String st,int...a){}

    //3(in method over loading kind of method and access modifier can't be effected.):
    /*
    * private m1(){}    //should get error
    * */
}
