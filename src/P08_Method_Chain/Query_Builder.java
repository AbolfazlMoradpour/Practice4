package P08_Method_Chain;

public class Query_Builder {
   private StringBuffer query = new StringBuffer();

   public Query_Builder select(String atribute){
       this.query.append(" SELECT").append(atribute);
       return this;
   }

   public Query_Builder from(String Tname){
       this.query.append(" FROM").append(Tname);
       return this;
   }

   public Query_Builder where(String condition){
       this.query.append(" WHERE").append(condition);
       return this;
   }

   public void print(){
       System.out.println(this.query);
   }
}
