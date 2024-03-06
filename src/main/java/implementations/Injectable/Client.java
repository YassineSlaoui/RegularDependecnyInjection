package implementations.Injectable;

import interfaces.ClientInterface;
import interfaces.ServiceInterface;

public class Client implements ClientInterface {
    ServiceInterface service;

    public Client(ServiceInterface service) {
        this.service = service;
    }

    public void setService(ServiceInterface service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        String info = service.getInfo();
        System.out.println("Info: " + info);
    }
}
