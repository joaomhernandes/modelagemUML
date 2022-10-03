public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "João", "Paulínia", "SP");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setId(2);
        funcionario2.setNome("Maurício");
        funcionario2.setCidade("Campinas");
        funcionario2.setUf("SP");
        funcionario1.incluir();
        funcionario2.alterar();
        funcionario1.excluir();
        funcionario1.recuperar();
        funcionario2.recuperar();
        funcionario2.validar();
    }
}
