public class Driver extends Account {
    String license;

    public Driver (String license,String name, String document, String email,String password){
        super(name, document);
        this.license = license;
    }
}
