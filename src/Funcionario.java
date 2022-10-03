import java.sql.SQLOutput;

public class Funcionario implements ModeloCrud{
    private int id;
    private String nome;
    private String Cidade;
    private String uf;

    public Funcionario(int id, String nome, String cidade, String uf) {
        this.id = id;
        this.nome = nome;
        Cidade = cidade;
        this.uf = uf;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void incluir() {
        System.out.println("Funcionario " + getNome() + " incluído com sucesso.");

    }

    public void alterar() {
        System.out.println("Dados do funcionário " + getNome() + " alterados com sucesso.");
    }

    public void excluir() {
        System.out.println("Funcionario " + getNome() + " excluído com sucesso.");
    }

    public void recuperar() {
        System.out.printf("""
                Dados do Funcionádio:
                ID: %d
                Nome: %s
                Cidade: %s
                UF: %s
                """, getId(),getNome(),getCidade(),getUf());
    }

    public void validar() {
        System.out.println("Dados do funcionário " + getNome() + " validados com sucesso com sucesso.");
    }
}
