package decorator.ssoInterceptor;

public interface HandleInterceptor {
    boolean preHandle(String request,String response,Object handle);
}
