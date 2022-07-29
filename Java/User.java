public class User extends Account{
    String nameUser;

    public User(String nameUser,String name, String document, String email,String password){
        super(name, document);
        this.nameUser = nameUser;
    }
}
