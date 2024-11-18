import br.com.mtanuri.validator.Validator;
import br.com.mtanuri.validator.impl.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    @Test
    public void deve_validar_um_email(){
        Validator emailValidator = new EmailValidator("marcel.tanuri@gmail.com");
        boolean resultado = emailValidator.validate();
        assertTrue(resultado);
    }

}
