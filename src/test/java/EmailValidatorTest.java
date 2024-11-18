import br.com.mtanuri.validator.Validator;
import br.com.mtanuri.validator.impl.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    @Test
    void testValidEmailAddresses() {
        Validator emailValidator = new EmailValidator("example@example.com");
        assertTrue(emailValidator.validate(), "Valid email failed validation");

        emailValidator = new EmailValidator("user.name+tag+sorting@example.com");
        assertTrue(emailValidator.validate(), "Valid email failed validation");
    }

    @Test
    void testInvalidEmailAddresses() {
        Validator emailValidator = new EmailValidator("plainaddress");
        assertFalse(emailValidator.validate(), "Invalid email passed validation");

        emailValidator = new EmailValidator("@missingusername.com");
        assertFalse(emailValidator.validate(), "Invalid email passed validation");
    }

    @Test
    void testNullAndEmptyEmails() {
        Validator emailValidator = new EmailValidator(null);
        assertFalse(emailValidator.validate(), "Null email passed validation");

        emailValidator = new EmailValidator("");
        assertFalse(emailValidator.validate(), "Empty email passed validation");

        emailValidator = new EmailValidator("   ");
        assertFalse(emailValidator.validate(), "Whitespace email passed validation");
    }



}
