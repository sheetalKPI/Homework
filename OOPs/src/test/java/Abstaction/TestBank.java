package Abstaction;

import Abstraction.Bank;
import Abstraction.PNB;
import Abstraction.SBI;

public class TestBank {
       public static void main(String args[])
       { Bank b;
       b=new SBI();
       System.out.println("Rate of Interest is:" +b.getRateOfInterest());
       b=new PNB();
       System.out.println("Rate of Interest is:" +b.getRateOfInterest());
       }
}
