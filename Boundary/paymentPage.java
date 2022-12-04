//saina
package Boundary;
public class PaymentPage extends Page
{
    private static String paymentStrategy;

    public static void performStrategy(int seatID)
    {
        if(paymentStrategy.equals("Ticket"))
        {
            PayTicketPage.display(seatID);
        }
        else if(paymentStrategy.equals("Cancel"))
        {
            PayCancellationFeePage.display();
        }
        else if(paymentStrategy.equals("Account"))
        {
            PayAccountFeePage.display();
        }
    }

    public static void setPaymentStrategy(String newPaymentStrategy)
    {
        paymentStrategy = newPaymentStrategy;
    }
}
