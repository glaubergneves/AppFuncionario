package tests;
import java.util.Scanner;
import domain.Aluno;
import domain.Pessoa;
import domain.Professor;
public class Tp2 {
    private static Pessoa[] pessoas;
    private static final int TAMANHO = 100;
    private static int pos = 0;
    public static void imprimir(int index) {
        for (int i = 0; i < pos; i++) {
            pessoas[i].impressao();
        }
    }
    public static void imprimir() {
        for (int i = 0; i < pos; i++) {
            pessoas[i].impressao();
        }
    }
    public static void main(String[] args) {
        pessoas = new Pessoa[TAMANHO];
        Scanner sc = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("[1] Cadastrar aluno.");
            System.out.println("[2] Cadastrar professor.");
            System.out.println("[3] Consultar situação de um docente/discente.");
            System.out.println("[4] Sair.");
            System.out.print("\nInforme a opcao desejada: ");
            opcao = sc.next();

            switch (opcao) {
                case "1":
                    if(pos < TAMANHO) { 
                        Aluno aluno = new Aluno();           
                        System.out.print("Informe seu nome: ");
                        aluno.setNome(sc.next());
                        System.out.print("Informe a idade: ");
                        aluno.setIdade(sc.nextInt());
                        System.out.print("Informe a nota da AV1: ");
                        aluno.setAvaliacao1(sc.nextFloat());
                        System.out.print("Informe a nota da AV2: ");
                        aluno.setAvaliacao2(sc.nextFloat()); 
                        if((aluno.getAvaliacao1() < 0 || aluno.getAvaliacao1() > 10) || (aluno.getAvaliacao2() < 0 || aluno.getAvaliacao2() > 10)) {
                            System.out.println("\nValor invalido de nota. A nota deve ser entre 0 e 10!\n");
                            break;
                        }
                        pessoas[pos] = aluno;
                        pessoas[pos].impressao();
                        pos++;
                    }
                    break;
                case "2":
                    if(pos < TAMANHO) { 
                        Professor professor = new Professor();           
                        System.out.print("Informe seu nome: ");
                        professor.setNome(sc.next());
                        System.out.print("Informe a idade: ");
                        professor.setIdade(sc.nextInt());
                        pessoas[pos] = professor;
                        pessoas[pos].impressao();
                        pos++;
                    }
                    break;
                case "3":
                    System.out.print("Informe codigo de um docente/discente: ");
                    int codigo = sc.nextInt();
                    if(codigo >= 0 && codigo < pos) {
                        pessoas[codigo].impressao();
                    } else {
                        System.out.println("Codigo invalido!\n");
                    }
            }
        } while(!"4".equalsIgnoreCase(opcao));

        sc.close();
    }
}