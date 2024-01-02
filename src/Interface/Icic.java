package Interface;

public class Icic implements FundTransfer{
    private boolean OtpValidt = false;

    @Override
    public void Benifix(int toAccNo, String Name) {
        System.out.println("Benifix added in Icic.Benifix Account no:"+toAccNo+" Benifix Name:"+Name);

    }

    @Override
    public void  Transfer(int accNo, int ammount) {

            System.out.println("Money is transferred to:" + accNo + "Ammount transferred:" + ammount);
        }
        }





