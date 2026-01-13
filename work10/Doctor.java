package work10;
public class Doctor extends Person {
    private String specialization;
    private double consultationFee;
    public Doctor(int id, String name, String specialization, double consultationFee) {
        super(id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    public String getSpecialization() 
    { 
        return specialization; 
    }
    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization; 
    }

    public double getConsultationFee() 
    { 
        return consultationFee; 
    }
    public void setConsultationFee(double consultationFee) 
    {
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateSalary() 
    {
        return super.calculateSalary() + consultationFee;
    }
    public double calculateSalary(int emergencyCases) 
    {
        double emergencyBonus = emergencyCases * 500;
        return calculateSalary() + emergencyBonus;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Specialization: " + specialization + ", Fee: " + consultationFee;
    }
}