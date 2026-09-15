void main() {

    int x;

    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();

    if (x % 2 == 0) {
        IO.println("O número que você digitou é par");
    } else {
        IO.println("O número que você digitou é ímpar");
    }
}