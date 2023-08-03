public class Main {
    public static void main(String[] args) {

        Observable observable = Observable.gettInstance();
        observable.addSender(new Sender("Supun"));
        observable.addSender(new Sender("Nimali"));
        observable.addSender(new Sender("Sharada"));
        observable.addSender(new Sender("Thamali"));



    }
}