package P07_this_Keyword;

public class Student {
    /*
    * this keyword is used for link an obj from heap to method space.
    * */
    void m1(){
        System.out.println(this);   /*print address of Student Class(Student obj)*/
    }
}
