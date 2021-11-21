public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario a = new Funcionario();

        a.setCargo("Engenheira");
        a.setSalario(20000.00);
        

        System.out.println("O cargo é " + a.getCargo());
        System.out.println("Matricula: " + a.getSalario());
       
    }
}