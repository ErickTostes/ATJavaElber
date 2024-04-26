package cafeteriaApp.model.domain;

public class Funcionario {
    private Integer id;
    private String nome;
    private String salario;

    public Funcionario(Integer id, String nome, String salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
        // Construtor vazio necessário para serialização/desserialização JSON
    }

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário -> id = " + id + ", nome = " + nome + ", salário = " + salario;
    }
}