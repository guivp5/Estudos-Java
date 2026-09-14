void main() {

    int x = 0;

    Scanner sc = new Scanner(System.in);
    IO.println("Digite um número inteiro de 1 a quantos vc quiser:");
    x = sc.nextInt();

    if (x % 2 == 0) {
        IO.println("O número que você digitou é par");
    } else{
        IO.println("O número que você digitou é ímpar");
    }
}