import java.util.HashMap;

//// This is just a friendly commit and push

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Jabed", "12345");
        logininfo.put("Noor", "112233");
        logininfo.put("Shohag", "123123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
