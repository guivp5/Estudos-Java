void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int a = sc.nextInt();

    System.out.println("Digite o segundo valor: ");
    int b = sc.nextInt();

    if (a % b == 0 || b % a == 0) {
        System.out.println("Multiplo");
    } else {
        System.out.println("Nao Multiplo");
    }
}