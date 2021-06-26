package decorator.ssoInterceptor.optimal_design;

import decorator.ssoInterceptor.HandleInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoDecorator{
    private static Map<String, String> authMap = new
            ConcurrentHashMap<String, String>();
    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }
    public LoginSsoDecorator(HandleInterceptor handleInterceptor){
        super(handleInterceptor);
    }
    @Override
    public boolean preHandle(String request,String response,Object handle){
        //调用被装饰类的preHandle方法进行cookie验证
        boolean success = super.decoratoredPreHandle(request,response,handle);
        if(!success) return false;
        //装饰类的方法，为被装饰类添加额外职责
        String userId = request.substring(9);
        String method = authMap.get(userId);
        return method.equals("queryUserInfo");
    }

}
