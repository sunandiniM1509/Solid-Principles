package solidDemo;

import java.util.*;
/*
public class Whatsapp {
    public void notifyWapp() {
    }
}

public class Instagram {
    public void notifyIgram() {
    }
}
public class Messenger {
    private Whatsapp wapp = new Whatsapp();
    private Instagram igr = new Instagram();
    public void implement() {
        wapp.notifyWapp();
        igr.notifyIgram();
    }
}*/
interface Messenger {
    void pingInbox();
}
class Whatsapp implements Messenger {
    @Override
    public void pingInbox() {
        notifyWapp();
    }
    private void notifyWapp() {
    }
}
class Instagram implements Messenger {
   @Override
    public void pingInbox() {
        notifyIgram();
    }
    private void notifyIgram() {
    }
}
 class App {
    private List<Messenger> messages;//{whatsapp_msg,instagram_msg,whatsapp_msg,whatsapp_msg}
    public App(List<Messenger> messages) {
        this.messages = messages;
    }
    public void implement() {
        messages.forEach(messages->messages.pingInbox());
    }
}
public class DependencyInversionPrinciple//Notification application
{
    public static void main (String[] args) {
        System.out.println();
        System.out.println("The higer-level modules no more depend on lower-level modules.");
    }
}

