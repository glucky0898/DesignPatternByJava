package decorator.ssoInterceptor.optimal_design;

public class TestMain {
    public static void main(String[] args) {
        LoginSsoDecorator loginSsoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = loginSsoDecorator.preHandle(request, "ewcdqwt40liuiu","t");
    }
}
