
package desafioClasseDeUmJogo;
import java.util.Scanner;


    public class Heroi {
        private String nome;
        private int idade;
        private String tipo;

        public Heroi(String nome, int idade, String tipo) {
            this.nome = nome;
            this.idade = idade;
            this.tipo = tipo;
        }

        public void atacar() {
            String ataque = "";
            switch (tipo.toLowerCase()) {
                case "mago":
                    ataque = "magia";
                    break;
                case "guerreiro":
                    ataque = "espada";
                    break;
                case "monge":
                    ataque = "artes marciais";
                    break;
                case "ninja":
                    ataque = "shuriken";
                    break;
                default:
                    ataque = "ataque desconhecido";
                    break;
            }

            System.out.println("O " + tipo + " " + nome + " atacou usando " + ataque);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do herói:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do herói:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o tipo do herói (mago, guerreiro, monge, ninja):");
            String tipo = scanner.nextLine();

            Heroi heroi = new Heroi(nome, idade, tipo);
            heroi.atacar();
        }
    }

