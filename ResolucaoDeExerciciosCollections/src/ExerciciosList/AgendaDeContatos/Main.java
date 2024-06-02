package ExerciciosList.AgendaDeContatos;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("Maria", "1111111", "mariaEmail");
        agenda.adicionarContato("Roberto", "2222222", "robertoEmail");
        agenda.adicionarContato("rosita", "3333333", "rositaEmail");
        agenda.adicionarContato("Cleide", "4444444", "cleideEmail");
        agenda.adicionarContato("José", "5555555", "joséEmail");

        agenda.exibirContatos();

        agenda.removerContato("rosita");
        agenda.removerContato("Maria");

        agenda.exibirContatos();

        agenda.atualizarEmailContato("Roberto", "RobertsEmail.outlook");
        agenda.exibirContatos();
    }
}
