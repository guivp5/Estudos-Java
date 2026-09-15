void main() {

    Scanner sc = new Scanner(System.in);
    double HoraInicial, HoraFinal, duracao;

    IO.println("Digite a hora inicial do jogo: ");
    HoraInicial =  sc.nextDouble();

    IO.println("Digite a hora final do jogo: ");
    HoraFinal = sc.nextDouble();

    if (HoraFinal == 0 && HoraInicial == 0) {
        duracao = 24;
    }  else if (HoraInicial < HoraFinal) {
        duracao = HoraFinal - HoraInicial;
    }  else {
        duracao = (24 - HoraInicial) + HoraFinal;
    }

    System.out.printf("O JOGO DUROU %.2f HORA(S)", duracao);

}