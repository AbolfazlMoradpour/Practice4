package P08_Method_Chain;

public class Main {
    public static void main(String[] args) {
        Query_Builder q1 = new Query_Builder();
        q1.select(" name").from(" student").where(" mahsa").print();
    }
}
