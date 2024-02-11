import java.util.HashMap;

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
