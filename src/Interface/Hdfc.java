package Interface;
public class Hdfc implements FundValidt {
    private boolean OtpValidt = false;

    @Override
    public void Benifix(int toAccNo, String Name) {
        System.out.println("Benifix added in Hdfc.Benifix Account no:"+toAccNo+" Benifix Name:"+Name);

    }

    @Override
    public void  Transfer(int accNo, int ammount) {
        if (OtpValidt) {
            System.out.println("Money is transferred to:" + accNo + "Ammount transferred:" + ammount);
        } else {
            System.out.println("please enter valid credentials");

        }
    }

    @Override
    public void  Validt(int mPin, String UserName) {
        if(mPin==2233 && UserName.equals("Sarath")){
            System.out.println("Valid user");
            OtpValidt=true;
        }
        else {
            System.out.println("Invalid Otp");

        }
    }


}