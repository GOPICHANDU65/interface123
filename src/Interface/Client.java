package Interface;

public class Client {
    public static void main(String[]args){
        Client cc = new Client();
        Sbi s  = new Sbi();
        Hdfc h = new Hdfc();
        Icic icic = new Icic();
        s.Benifix(789311815,"chandu");
        s.Validt(3651,"Chandu");
        s.Transfer(12345567,65500);
        h.Benifix(5739939,"sarath");
        h.Validt(2233,"Sarath");
        h.Transfer(98765432,100000);
        icic.Benifix(3457,"sasank");
        icic.Transfer(34576,70000);


    }
}
