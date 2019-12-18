package DeepCopyPrototye;

import java.io.Serializable;

public class Job implements Serializable{
        /**
    *
    */
    private static final long serialVersionUID = 1L;
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

        public String setWorktype() {
                return worktype;
            }
        
            public String setPlace() {
                return place;
            }
        
            public int setYear() {
                return year;
            }
        
            public int setExperience() {
                return experience;
            }
        
            public int setSalary() {
                return salary;
            }
        
            public String toString() {
                return "/work type :" + this.worktype + "/place : " + this.place + "/year : " + this.year + "/experience : "
                        + this.experience + "/salary : " + this.salary;
            }
        }

        