public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }

    public static void main(String[] args) {
        Long amount = 10L;
        TicketOffice ticketOffice = new TicketOffice(10L, new Ticket(), new Ticket(), new Ticket());
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Bag bag1 = new Bag(5L);
        Audience audience1 = new Audience(bag1);

        theater.enter(audience1);
    }
}