package ShallowCopyPrototype;


public class Job implements Serializable{
    public String worktype;
    public String place;
    public int year;
    public int experience;
    public int salary;

    private Job(String worktype,string place,int year,int experience,int salary) {
            this.worktype = worktype;
            this.place = place;
            this.year = year;
            this.experience = experience;
            this.salary = salary;
    }

    @Override
    public Prototype doClone() {
        return new Job(worktype, place, year, experience, salary);
    }
    
    public String toString(){
        return "Worktype: "+this.worktype
                +"\nPlace: "+this.place
                +"\nYear: "+this.year
                +"\nExperience: "+this.experience
                +"\nSalary: "+this.salary ;
    }
    
}
