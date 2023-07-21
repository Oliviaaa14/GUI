import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Login {
    private Map<String, String> users;

    public Login() {
        users = new HashMap<>();
        loadUsers("users.txt");
    }

    public void loadUsers ( String fileName){
        ArrayList<String> userdata= Filehandler.readFile(fileName);
        for(int i=0; i< userdata.size(); i=i+2){
            addUser(userdata.get(i), userdata.get(i+1));
        }
    }



    public void addUser(String username, String password) {
        users.put(username, password);
    }

    public boolean isValid(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {

            return true;
        } else {

            return false;
        }
    }}


