package week08;
public class Student
{
    private String name;
    private int id;    
    private String address;
    private long phoneNo;
    private static String collegeName="Islington_College";
    Student(String name, int id, String address, long phoneNo){
        this.name=name;
        this.id=id;
        this.address=address;
        this.phoneNo=phoneNo;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setPhoneNo(long phoneNo)
    {
        this.phoneNo=phoneNo;
    }
    public long getPhoneNo()
    {
        return this.phoneNo;
    }
    public void displayInfo()
    {
        System.out.println("Name of the student is:" + this.name);
        System.out.println("ID of the student is:" + this.id);
        System.out.println("Address of the student is:" + this.address);
        System.out.println("Contact number of the student is:" + this.phoneNo);
        System.out.println("Name of the college is:" +this.collegeName);
    }
}

