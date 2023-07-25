namespace BOL;

public class Author
{
    public int authId;
    public string name;
    public string description;
    public string email;
    public string phone;
    public double salary;

    public Author(int authId, string name, string description,string email,string phone,double salary)
    {
        this.authId = authId;
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }
}
