package decorator.ssoInterceptor.bad_design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//除了验证cookie，增加了验证方法名的需求。通过继承方式实现
public class LoginSsoInterceptor extends SsoInterceptor{
    private static Map<String, String> authMap = new
            ConcurrentHashMap<String, String>();
    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handle) {
        //获取cookie并验证
        String ticket = request.substring(1,8);
        boolean success = ticket.equals("success");
        if(!success) return false;
        //验证请求的方法
        String userId = request.substring(9);
        String method = authMap.get(userId);
        return method.equals("queryUserInfo");
    }
}
