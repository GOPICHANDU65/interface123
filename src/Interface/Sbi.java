package Interface;

public class Sbi implements FundValidt{
 private boolean OtpValidt = false;

 @Override
 public void Benifix(int toAccNo, String Name) {
  System.out.println("Benifix added in Sbi.Benifix Account no:"+toAccNo+" Benifix Name:"+Name);

 }

 @Override
 public void  Transfer(int accNo, int ammount) {
  if (OtpValidt) {
   System.out.println("Money is transferred to:" + accNo + "Ammount transferred:" + ammount);
  } else {
   System.out.println("please enter valid credentials OtpValid");

  }
 }

 @Override
 public void  Validt(int mPin, String UserName) {
  if(mPin==3651 && UserName.equals("Chandu")){
   System.out.println("Valid user");
    OtpValidt=true;
  }
  else {
   System.out.println("Invalid Otp");

  }
 }
}

