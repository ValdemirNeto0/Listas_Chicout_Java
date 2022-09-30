import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> ListaPessoas;

    public Agenda(){
        ListaPessoas = new ArrayList<Pessoa>();
    }

    public void armazenaPessoa(String nome, int idade, double altura){
        ListaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void removePessoa(String nome){
        for(int x=0;x<ListaPessoas.size();x++){
            if(ListaPessoas.iterator().next().getNome() == nome){
                ListaPessoas.remove(x);
            }
        }
    }

    public Pessoa buscaPessoa(String nome){
        for(Pessoa pessoa : ListaPessoas){
            if(pessoa.getNome() == nome){
                return pessoa;
            }
        }
        return null;
    }

    public void imprimeAgenda(){
        for (Pessoa pessoa : ListaPessoas){
            System.out.println(pessoa);
        }
    }

    public Pessoa imprimePessoa(int index){
        return ListaPessoas.get(index);
    }
}
/*
imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. 
 */
