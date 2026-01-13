package week10;
public class Course
{
    private int courseid;
    private String coursename;
    protected double basefee;
    public Course(int courseid, String coursename,double basefee)
    {
        this.courseid = courseid;
        this.coursename = coursename;
        this.basefee = basefee;
    }
    public void setCourseid (int newid)
    {
        this.courseid = newid;
    }
    public int getCourseid()
    {
        return this.courseid;
    }
     public void setCoursename (String newname)
    {
        this.coursename = newname;
    }
    public String getCoursename()
    {
        return this.coursename;
    }
    public void setBasefee (double newbasefee)
    {
        this.basefee = newbasefee;
    }
    public double getBasefee()
    {
        return this.basefee;
    }
}   
