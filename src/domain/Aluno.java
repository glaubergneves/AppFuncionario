package domain;

public class Aluno extends Pessoa {
    private float avaliacao1;
    private float avaliacao2;

    public float getAvaliacao1() {
        return avaliacao1;
    }
    public void setAvaliacao1(float avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }
    public float getAvaliacao2() {
        return avaliacao2;
    }
    public void setAvaliacao2(float avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }
    private float calcularMedia(float av1, float av2) {
        return (av1 + av2) / 2;
    }
    @Override
    public String toString() {
        return String.format("%s | Boletim: %.2f - |Aluno|",
                super.toString(), calcularMedia(avaliacao1, avaliacao2));
    }
}
