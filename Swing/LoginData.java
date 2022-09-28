import java.util.HashMap;

public class LoginData {
    HashMap<String, String> loginData = new HashMap<String, String>();

    LoginData() {
        loginData.put("123", "123");
    }

    public HashMap<String, String> getLoginData() {
        return loginData;
    }
}
