package implementations.Injectable;

import interfaces.ServiceInterface;

public class ServiceA implements ServiceInterface {
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + "'s Info";
    }
}
