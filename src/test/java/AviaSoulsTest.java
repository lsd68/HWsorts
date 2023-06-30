import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.search("Msk", "Spb");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Ekb", "Spb");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("Nsb", "Tmb");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWhitComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket8, ticket1, ticket2, ticket6, ticket4};
        Ticket[] actual = manager.search("Msk", "Spb", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWhitComparator1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Ekb", "Spb", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWhitComparator2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Spb", 100, 11, 14);
        Ticket ticket3 = new Ticket("Msk", "Tmb", 200, 10, 16);
        Ticket ticket4 = new Ticket("Msk", "Spb", 400, 7, 17);
        Ticket ticket5 = new Ticket("Nsb", "Tmb", 800, 4, 9);
        Ticket ticket6 = new Ticket("Msk", "Spb", 200, 6, 10);
        Ticket ticket7 = new Ticket("Vvk", "Msk", 300, 15, 18);
        Ticket ticket8 = new Ticket("Msk", "Spb", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = manager.search("Nsb", "Tmb", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}