package decorator.ssoInterceptor.optimal_design;

import decorator.ssoInterceptor.HandleInterceptor;

public abstract class SsoDecorator implements HandleInterceptor {
    private HandleInterceptor handleInterceptor;
    private SsoDecorator(){};
    public SsoDecorator(HandleInterceptor handleInterceptor){
        this.handleInterceptor = handleInterceptor;
    }
    public boolean decoratoredPreHandle(String request, String response, Object handle){
        return handleInterceptor.preHandle(request,response,handle);
    }
}
