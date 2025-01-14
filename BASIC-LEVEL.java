import java.util.Scanner;

class BankAccount
{
    private String AccountHolder;
    private Double AccountBalance;
    private int AccountNumber;

    public BankAccount(String AccountHolder, Double AccountBalance, int AccountNumber)
    {
        this.AccountBalance=AccountBalance;
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;
    }

    public Double viewBalance()
    {
        return AccountBalance;
    }

    public void displayAccDetails()
    {
        System.out.println("AccountHolder - "+ AccountHolder);
        System.out.println("AccountBalance - "+ AccountBalance);
        System.out.println("AccountNumber - "+AccountNumber);
    }

    public void withdrawMoney(double money)
    {
        if(money > AccountBalance)
        {
            System.out.println("Insufficient money in Acc");
        }
        else if(money < AccountBalance)
        {
            AccountBalance-=money;
            System.out.println("Withdrawal successfully" + AccountBalance);
        }
    }

    public void addMoney(double money)
    {
        AccountBalance+=money;
        System.out.println("deposited successfully"+AccountBalance);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount acc=null;

        while(true)
        {
            System.out.println("\n----=======-------BANKING SYSTEM MENU-----====--------");
            System.out.println("1)create a new Acc");
            System.out.println("2)viewBalance");
            System.out.println("3)Deposit money");
            System.out.println("4)withdrawal");
            System.out.println("5)display acc details");
            System.out.println("6)exit");
            System.out.println("ENTER YOUR CHOICE :-");

            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("ENTER YOUR NAME");
                    sc.nextLine();
                    String AccountHolder=sc.nextLine();
                    System.out.println("ENTER YOUR DEPOSIT AMOUNT");
                    Double deposit=sc.nextDouble();

                    int id=(int)(Math.random()*1000000);

                    acc=new BankAccount(AccountHolder,deposit,id);
                    System.out.println("YOUR ACCOUNT IS SUCESSFULLY CREATED AND YOUR ACC DETAILS IS ");
                    acc.displayAccDetails();
                    break;

                case 2:
                    if(acc==null)
                    {
                        System.out.println("PLEASE OPEN A NEW ACCOUNT FIRST");
                    }
                    else
                    {
                        System.out.println("YOUR CURRENT BALANCE IS -"+acc.viewBalance());
                    }
                    break;

                case 3:
                    double depo= sc.nextDouble();
                    acc.addMoney(depo);
                    break;

                case 4:
                    double withdrawal=sc.nextDouble();
                    acc.withdrawMoney(withdrawal);
                    break;

                case 5:
                    if(acc==null)
                    {
                        System.out.println("PLEASE CREATE ACC FIRST");
                    }
                    else {
                        acc.displayAccDetails();
                    }
                    break;

                case 6:
                    System.out.println("THANKYOU FOR USING OUR BANKINGSYSTEM ");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("PLEASE CHOOSE THE CHOICE CORRECTLY");
            }

        }
    }
}
