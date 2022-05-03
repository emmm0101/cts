package ro.ase.csie.cts.g1085;

public class Main {
    public static void main(String[] args){
        AgentieTurism agentie = AgentieTurism.getInstance("Bucuresti",3,
                "Travel now",null,null);
        System.out.println("Agentie 1: "+agentie.getNrAngajati());

        AgentieTurism agentie2 = AgentieTurism.getInstance("Constanta",10,
                "Travel",null,null);
        System.out.println("Agentie 2: "+agentie2.getNrAngajati());

//        AgentieTurism agentie = AgentieTurism.getInstance();
//        agentie.toString();
//        try{
//            System.out.println("Agentie 1: "+agentie.getNrAngajati());
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Final catch");
//        }
//        System.out.println("Final de tot");
    }
}