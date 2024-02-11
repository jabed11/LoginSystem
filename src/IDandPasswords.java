import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Jabed", "Burger");
        logininfo.put("Noor", "Legpiece");
        logininfo.put("Shohag", "Spice");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }








}
