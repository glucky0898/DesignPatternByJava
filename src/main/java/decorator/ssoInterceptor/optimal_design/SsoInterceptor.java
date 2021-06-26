package decorator.ssoInterceptor.optimal_design;

import decorator.ssoInterceptor.HandleInterceptor;

public class SsoInterceptor implements HandleInterceptor {
    public boolean preHandle(String request,String response,Object handle){
       //获取cookie并验证
        String ticket = request.substring(1,8);
        return ticket.equals("success");
    }
}
