public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Frodo", "Balings", new MasterCard(0), new EmailContactInfo("tarek@novi.nl"));
        customer.getCreditCard().pay(100);
        customer.printName();
        customer.getContactInfo().sendMail();
        System.out.println(customer.getCreditCard().getDebt());


        Customer customer2 = new Customer("Samwise", "Gamgee", new VisaCard(0), new SmsContactInfo("066666668"));
        customer2.getCreditCard().pay(100);

        customer2.printName();
        customer2.getContactInfo().sendMail();
        System.out.println(customer2.getCreditCard().getDebt());

    }
}
