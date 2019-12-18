/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeepCopyPrototye;

/**
 *
 * @author chutipong
 */
public class DemoDeepPrototype {
    
    public static void main(String[] args) {
        
        CloneJob cc = new CloneJob();
        cc.setNum(3);
        cc.setJob(new Job("Programmer", "GEC", 5, 3, 20000));
        System.out.println("\nBefore cloning");
        System.out.println("clone job: " + cc); // call CloneMgr.toString()

        // do ShallowCopy & DeepCopy
        //
        CloneJob shallowClone = cc.clone();
        CloneJob deepClone = cc.deepClone();

        // change cm num & name
        cc.setNum(5);
        Job job = cc.getComputer();
        
        job.setWorktype("Police");
        job.setPlace("office");
        job.setYear(2);
        job.setExperience(5);
        job.setSalary(8000);

        System.out.println("\nAfter cloning");
        System.out.println("clone computer :" + cc);
        System.out.println("\nshallowClone:" + shallowClone);
        System.out.println("\ndeepClone:" + deepClone);
    }
    
}
