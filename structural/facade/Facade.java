package structural.facade;

public class Facade {
    private final SubSystemA subsystemA;
    private final SubSystemB subsystemB;
    private final SubSystemC subsystemC;

    Facade() {
        this.subsystemA = new SubSystemA();
        this.subsystemB = new SubSystemB();
        this.subsystemC = new SubSystemC();
    }

    void operation1() {
        this.subsystemA.suboperation();
        this.subsystemB.suboperation();
    }

    void operation2() {
        this.subsystemC.suboperation();
    }
}