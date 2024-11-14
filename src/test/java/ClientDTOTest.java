import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientDTOTest {

    @Test
    public void deve_converter_cliente_para_clienteDTO_concatenando_o_nome_e_sobrenome_no_atributo_nome() {
        ClienteDTO clienteDTO = ClienteDTO.from(new Cliente("Marcel", "Tanuri", "marcel.tanuri@gmail.com"));

        assertEquals("Marcel Tanuri", clienteDTO.nome(), "O nome de DTO deve ser uma concatenação de Nome e Sobrenome da classe Cliente");
    }

    @Test
    public void o_campo_username_deve_ser_a_combinacao_da_primeira_letra_do_primeiro_nome_com_o_sobrenome(){
        ClienteDTO clienteDTO = ClienteDTO.from(new Cliente("Marcel", "Tanuri", "marcel.tanuri@gmail.com"));

        assertEquals("mtanuri", clienteDTO.userName(), "Username invalido, deve ser a combincação da primeira letra do primeiro nome com o sobrenome"); ;

    }

}
