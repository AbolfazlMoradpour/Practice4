package P03_Method_Declaration;

public class Student {
    private int age;
    private String name;
    private int degree;

    ///////////////////////////
    /*
    * - a method can be any DataType.
    * - a method can get any type argument.
    * - method that have DataType should have return example [getAge()].
    * - return means that exit from stack space.
    * - methods are set on methods space.
    * */
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        age = this.age;
    }
}
