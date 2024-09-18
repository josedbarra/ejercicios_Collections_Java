public class Course
{

     private String name;

     private String id;

     private int credits;

    public Course( String name, String id, int credits )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
        
    }
    
    public String getname() {
    	return name;
    }
    
    public String getid() {
    	return id;
    }
    
    public int getcredits() {
    	return credits;
    }

    @Override
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
}