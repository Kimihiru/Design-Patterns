package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver(1);
        Observer observer2 = new ConcreteObserver(2);

        System.out.println("Observer 1 state: " + observer1.getState());
        System.out.println("Observer 2 state: " + observer2.getState());

        Subject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState(10);
        subject.notifyObservers();

        System.out.println("Observer 1 state: " + observer1.getState());
        System.out.println("Observer 2 state: " + observer2.getState());
    }
}