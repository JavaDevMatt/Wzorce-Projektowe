package pl.javadevmatt.builder.simple;

public class Cat
{
    private String name;
    private String color;
    private int age;
    private String owner;
 
	private Cat(final Builder builder)
    {
        this.name = builder.name;
        this.color = builder.color;
        this.age = builder.age;
        this.owner = builder.owner;
    }
 
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }
    public String getOwner()
    {
        return owner;
    }
 
    public static class Builder
    {
        private final String name; // final because the name is required
        private String color;
        private int age;
        private String owner;
 
        public Builder(final String name)
        {
            this.name = name;
        }
 
        public Builder color(final String color)
        {
            this.color = color;
            return this;
        }
 
        public Builder age(final int age)
        {
            this.age = age;
            return this;
        }
 
        public Builder owner(final String owner)
        {
            this.owner = owner;
            return this;
        }
 
        public Cat build()
        {
            return new Cat(this);
        }
 
    }
    
    @Override
   	public String toString() {
   		return "Cat [name=" + name + ", color=" + color + ", age=" + age
   				+ ", owner=" + owner + "]";
   	}
 
}
