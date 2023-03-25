public class Aluno extends Pessoa{
    private String matricula;
    public String registrar(){
        return "Sou o"+super.obterNomeCompleto()+" e minha matrícula é"+matricula;
    }
}
