package br.com.mtanuri.validator.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import br.com.mtanuri.validator.Validator;

public class EmailValidator implements Validator {
    private String mail;

    public EmailValidator(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean validate() {
        if (mail == null || mail.trim().isEmpty()) return false;
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(mail);

        return matcher.matches();
    }
}
