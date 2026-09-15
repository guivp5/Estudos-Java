void main() {

    int x;

    Scanner sc = new Scanner(System.in);
    IO.println("Digite um número inteiro de 1 a quantos vc quiser:");
    x = sc.nextInt();

    if (x >= 0) {
        IO.println("O número que você digitou é positivo");
    } else{
        IO.println("O número que você digitou é negativo");
    }
}