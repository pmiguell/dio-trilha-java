import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 10), "Evento A", "Beatles");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 16), "Evento B", "David Guetta");
        agendaEventos.adicionarEvento(LocalDate.of(2027, Month.APRIL, 20), "Evento A", "The Clash");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}