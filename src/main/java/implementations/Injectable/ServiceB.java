package implementations.Injectable;

import interfaces.ServiceInterface;

public class ServiceB implements ServiceInterface {
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + "'s Info";
    }
}