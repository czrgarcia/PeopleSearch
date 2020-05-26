public class People {
    int age;
    int salary;
    String name;

    public People()//default constructor overwrite
    {
        this.age = 22;
        this.salary = 40000;
        this.name = "Susan";
    }
    public People(String name, int age, int salary)
    {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
