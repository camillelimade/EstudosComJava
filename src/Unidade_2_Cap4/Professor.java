package Unidade_2_Cap4;

public class Professor {
    private String nome;
    private Departamento dep;

    public Professor(String nome, Departamento dep) {
        this.nome = nome;
        this.dep = dep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }
    public void mostrarDep(){
        if (dep != null){
            System.out.println("O professor " + getNome() + " pertence ao Departamento " + dep.getNome());
        }else if(dep.getNome().contains("") || dep.getNome().isBlank()){
            System.out.println("Digite uma entrada válida, evite espaços em branco!");
        }else {
            System.out.println(getNome() + " não possui departamento");
        }
    }

    public static void main(String[] args){
        Departamento dep1 = new Departamento("Programação");
        Professor prof1 = new Professor("Camille Lima", dep1);
        prof1.mostrarDep();

        Departamento dep2 = new Departamento("RH");
        Professor prof2 = new Professor("Cecília Oliveira", dep2);
        prof2.mostrarDep();
    }
}
