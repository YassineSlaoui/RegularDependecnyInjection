import implementations.Injectable.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        ServiceInterface service = new ServiceC();
        ClientInterface client = new Client(service);
        client.doSomething();
        ((Client)client).setService(new ServiceB());
        client.doSomething();
    }
}
