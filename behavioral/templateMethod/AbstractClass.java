package behavioral.templateMethod;

public abstract class AbstractClass {
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}