package br.com.alexjr.cursodjava.clientes.colecoes;

import br.com.alexjr.cursodjava.clientes.dominio.Cliente;
import br.com.alexjr.cursodjava.clientes.dominio.enums.TipoSexo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OrganizacaoClientes cadastro = new OrganizacaoClientes();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Cicrano");
        cliente.setSexo(TipoSexo.M);

        cadastro.adicionar(cliente);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Maria");
        cliente2.setSexo(TipoSexo.F);

        cadastro.adicionar(cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setCpf("01234");
        cliente3.setNome("Rita");
        cliente3.setSexo(TipoSexo.F);

        cadastro.adicionar(cliente3);

        Cliente cliente4 = new Cliente();
        cliente4.setCpf("01234");
        cliente4.setNome("Paulo");
        cliente4.setSexo(TipoSexo.M);

        cadastro.adicionar(cliente4);

        System.out.println("Femininos: ");
        cadastro.imprimirClientes(TipoSexo.F);

        System.out.println("Masculinos: ");
        cadastro.imprimirClientes(TipoSexo.M);

        List<TipoSexo> tipoSexos = cadastro.obterTiposAdicionados();
        for(TipoSexo tipoSexo : tipoSexos) {
            System.out.println(tipoSexo);
        }
    }

    private static void exemplosMaps() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Maria");
        mapa.put(2, "Cicrano");
        mapa.put(3, "Maria");

        String nome = mapa.get(3);
        System.out.println(nome);

        mapa.remove(1);

        System.out.println(mapa.get(1));

        boolean contemChave = mapa.containsKey(2);
        System.out.println("Contem chave 2: " + contemChave);

        boolean contemValor = mapa.containsValue("fulano");

        System.out.println("Contem o valor fulano? " + contemValor);
    }

    private static void trabalhandoComOrdenacaoDeColecoes() {
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Cicrano");
        cliente2.setSexo(TipoSexo.F);

        List<Cliente> clientes = Arrays.asList(cliente, cliente2);
        clientes.sort(Cliente::compareTo);

        clientes.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
        });

        for (Cliente c: clientes) {
            System.out.println(c);
        }
    }

    private static void repositorioComSet(){
        Set<String> linguagens = new TreeSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("Java");

        for (String l : linguagens) {
            System.out.println(l);
        }
    }

    private static void repositorioComList(){
        List<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Ciclano");
        cliente2.setSexo(TipoSexo.M);

        listaClientes.add(cliente);
        listaClientes.add(cliente2);

        System.out.println(listaClientes.size());

        for (Cliente c: listaClientes) {
            System.out.println(c);
        }

        boolean contem = listaClientes.contains(cliente);
        System.out.println("contem? " + contem);
    }

    private static void repositorioComArray(){
        RepositorioCliente repositorioClientes = new RepositorioCliente();
        Cliente cliente = new Cliente();
        cliente.setCpf("0123");
        cliente.setNome("Fulano");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("01234");
        cliente2.setNome("Ciclano");
        cliente2.setSexo(TipoSexo.M);

        repositorioClientes.adicionar(cliente);
        repositorioClientes.adicionar(cliente2);
        repositorioClientes.imprimirClientes();
    }
}
