public class ParttimeEmployee extends Employee{

    private int OTHrs;

    public ParttimeEmployee(String name, double salary,int OTHrs) {
        super(name, salary);
        this.OTHrs = OTHrs;
    }

    public int getOTHrs() {
        return OTHrs;
    }

    public void setOTHrs(int OTHrs) {
        this.OTHrs = OTHrs;
    }

    public void DisplayEmpInfo(){
        this.DisplayInfo();
        System.out.println("OTHrs : "+OTHrs);
    }

}
