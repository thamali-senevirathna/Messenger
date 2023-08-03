
public class Observable {
    Observer[] observers = new Sender[0];
    private String textMessage;
    private int index;

    private static Observable observable=null;

    String title;

    private Observable() {

    }

    private void extendArray() {
        Observer[] tempObservers = new Observer[observers.length + 1];
        for (int i = 0; i < observers.length; i++) {
            tempObservers[i] = observers[i];
        }
        observers = tempObservers;
    }

    public void addSender(Observer ob) {
        extendArray();
        observers[observers.length - 1] = ob;
    }

    public void notifyObject() {
        for (Observer ob : observers) {
            ob.update(title,textMessage);
        }
    }

    public void setValue(String title,String textMessage) {

        this.textMessage = textMessage;
        this.title=title;
        notifyObject();

    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static Observable gettInstance(){
        if(observable==null){
            observable=new Observable();
        }
        return observable;
    }
    public void addNewSender() {
        String newSenderTitle = "Sender  " + (observers.length + 1);
        Sender newSender = new Sender(newSenderTitle);
        addSender(newSender);
    }


}


