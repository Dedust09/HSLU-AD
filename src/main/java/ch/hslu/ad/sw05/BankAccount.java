package ch.hslu.ad.sw05;

/**
 * Einfaches Bankkonto, das nur den Kontostand beinhaltet.
 */
public class BankAccount {

    private int balance;
    private int id;

    /**
     * Erzeugt ein Bankkonto mit einem Anfangssaldo.
     * @param balance Anfangssaldo
     */
    public BankAccount(final int balance, final int id) {
        this.balance = balance;
        this.id = id;
    }

    /**
     * Erzeugt ein Bankkonto mit Kontostand Null.
     */
    public BankAccount(final int id) {
        this(0, id);
    }

    /**
     * Gibt den aktuellen Kontostand zurück.
     * @return Kontostand.
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Addiert zum bestehen Kontostand einen Betrag hinzu.
     * @param amount Einzuzahlender Betrag
     */
    public void deposite(final int amount) {
        this.balance += amount;
    }

    /**
     * Überweist einen Betrag vom aktuellen Bankkonto an ein Ziel-Bankkonto.
     * @param target Bankkonto auf welches der Betrag überwiesen wird.
     * @param amount zu überweisender Betrag.
     */
    public void transfer(final BankAccount target, final int amount) {
        this.balance -= amount;
        target.deposite(amount);
    }

    @Override
    public String toString() {
        return ("Bankaccount: " + this.id + "   mit Balance: " + this.balance);
    }
}
