package domain;

public class Professor extends Pessoa{
    public String toString() {
        return String.format("%s - |Professor|",
                super.toString());
    }
}
