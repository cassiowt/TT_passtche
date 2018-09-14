package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class app2 {

    static List<String> lista = new ArrayList<String>();

    // psvm
    public static void main(String[] args) {

        // fori
        for (int i = 0; i < 51; i++) {
            // soutm
            lista.add(i + " app2.main");
        }

       lista.forEach(iten-> System.out.println(iten));

        lista();

    }

    // pv

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    //sbc

    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////


   public static void lista(){

        Map<String, Integer> items = new HashMap<>();
       items.put("A", 10);
       items.put("B", 20);
       items.put("C", 30);
       items.put("D", 40);
       items.put("E", 50);
       items.put("F", 60);

       items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

       items.forEach((k,v)->{
           System.out.println("Item : " + k + " Count : " + v);
           if("E".equals(k)){
               System.out.println("Hello E");
           }
       });
   }
}
