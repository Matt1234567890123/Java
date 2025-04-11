public class NegativeLifespanException extends Exception{
    public NegativeLifespanException(Person person) {
        super(String.format("osoba %s urodziła się w %s, który jest poźniejszy niż data śmerci %s.", person.name(), person.getBirthDate(), person.getDeathDate()));
    }
}
