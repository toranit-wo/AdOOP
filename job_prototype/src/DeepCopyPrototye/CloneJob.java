package DeepCopyPrototye;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class CloneJob implements Cloneable, Serializable {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int num;
    Job job;
    
    public CloneJob clone() {
        try {
            return (CloneJob) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public CloneJob deepClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (CloneJob) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Computer getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String toString() {
        return "\nnum: " + num + "\n" + job;
    }
    
}
