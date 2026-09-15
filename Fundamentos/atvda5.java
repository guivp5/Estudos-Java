void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("""
            Digite o combustivel usado para abastecer o carro:\s
            1 = Alcool
            2 = Gasolina
            3 = Diesel
            """);

    int alcool = 0, gasolina = 0, diesel = 0;
    int x = sc.nextInt();

    if (x < 1 || x > 4) {
        IO.println("Valor inválido, digite novamente: ");
    }

    while (x != 4) {
        if (x == 1) {
            alcool++;
        }  else if (x == 2) {
            gasolina++;
        } else if (x == 3) {
            diesel++;
        }

        IO.println("""
                Digite o combustivel usado para abastecer o carro:\s
                1 = Alcool
                2 = Gasolina
                3 = Diesel
                """);
        x = sc.nextInt();

        if (x < 1 || x > 4) {
            IO.println("Valor inválido, digite novamente: ");
        }
    }

    System.out.printf("MUITO OBRIGADO\n" +
            "Alcool: %d\n" +
            "Gasolina: %d\n" +
            "Diesel: %d\n", alcool, gasolina, diesel);

    sc.close();
}