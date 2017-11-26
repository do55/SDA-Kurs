import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ReusablePool pool = ReusablePool.getInstance();
        String one = pool.acquireReusable();
        System.out.println("one = " + one);

        String two = pool.acquireReusable();
        System.out.println("two = " + two);

        String three = pool.acquireReusable();
        System.out.println("three = " + three);

        String empty = pool.acquireReusable();
        System.out.println("empty = " + empty);

        pool.releaseReusable(three);
        three = null;

    }
}

class ReusablePool {
    static private ReusablePool pool;

    private Map<String, Boolean> reusablePool = new LinkedHashMap<>();

    public static ReusablePool getInstance() {
        if (null == pool) {
            pool = new ReusablePool();
        }
        return pool;
    }

//    static {
//        System.out.println("static block");
//    }
//
//    {
//        System.out.println("First object block");
//    }
//
//    static {
//        System.out.println("second static block");
//    }
//
//    {
//        System.out.println("Second object block");
//    }

    public String acquireReusable() {
        String result = null;
        for (Map.Entry<String, Boolean> entry: reusablePool.entrySet()) {
            if (entry.getValue() == false) {
                result = entry.getKey();
                entry.setValue(true);
                break;
            }
        }
        return  result;
    }

    public void releaseReusable(String reusasble) {
        if (reusablePool.containsKey(reusasble)) {
            reusablePool.put(reusasble, false);
        }

    }

    void addObjectToPoll(String reusable) {
        System.out.println("Agregacja");
        reusablePool.put(reusable, false);
    }

    private ReusablePool() {
         super();
         // bloki
        System.out.println("Inside constructor ReusablePool");

        System.out.println("Kompozycja");
        reusablePool.put("One", false);
        reusablePool.put("Two", false);
        reusablePool.put("Three", false);
    }
}