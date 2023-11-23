public class atividade11 {
    public static void main(String[] args) {
        int tempoFilme = 120;
        int inicio = 0;
        while (inicio <= tempoFilme) {
            try {
                Thread.sleep(60000);
                System.out.println("Assistindo filme. Já se passaram " + inicio + " minutos.");
                inicio++;
            } catch (InterruptedException e) {
                System.out.println("Ops! Houve algum erro...: " + e);
            }
        }
        System.out.println("Fim do filme.");
    }
}