package P02_Accessors_and_Mutators;

public class Student {

    private String name;
    private int age;

    ////////////////////////////////

    public int readAge(){   /*age > Accessor Method*/
        return age;
    }
    public void writeAge(int age){  /*age > Mutator Method*/
        if(age<=0){
            System.out.println("wrong Elements");
        }
        else {
            this.age = age;
        }
    }

    ////////////////////////////////

    public String readName(){   /*name > Accessor*/

        return name;
    }
    public void writeName(String name){ /*name > Mutator*/
        if(!(name.isEmpty())){
            this.name=name;
        }
        else{
            System.out.println("insert any thing");
        }
    }
}
