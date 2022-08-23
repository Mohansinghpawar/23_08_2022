class Parent {
    static void show()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    void show()
    {
        System.out.println("Child");
    }
}
 
class Static{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.show();
    }
}
