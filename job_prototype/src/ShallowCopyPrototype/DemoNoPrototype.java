package ShallowCopyPrototype;

/**
 *
 * 
 */
public class DemoNoPrototype {
    
    public static void main(String[] args) {
        
        Job job1 = new Job("Programmer", "GEC", 5, 3, 20000);
        System.out.println("Job 1" + "\n" + job1);
        
        Job job2 = job1;
        System.out.println("Job 2" + "\n" + job2);
    }
    
}
