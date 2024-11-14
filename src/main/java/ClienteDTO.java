public record ClienteDTO (String nome, String email, String userName){

    public static ClienteDTO from(Cliente cliente){
        return new ClienteDTO(cliente.nome() + " " + cliente.sobrenome(), cliente.email(), (cliente.nome().charAt(0)+cliente.sobrenome()).toLowerCase());
    }

}
