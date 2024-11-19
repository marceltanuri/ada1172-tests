package br.com.mtanuri.validator.impl;

import br.com.mtanuri.validator.Validator;

import java.sql.Array;

public class EmailValidator implements Validator {

    private String mail;

    public EmailValidator(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean validate() {
        boolean[] valid = new boolean[4];

        boolean finalvalidation = true;
        if(mail == null){
            return false;
        }

        valid[0] = mail.contains("@");
        valid[1] = mail.endsWith(".com");
        valid[2] = !mail.isEmpty() || !mail.isBlank();
        valid[3] = !mail.startsWith("@");

        for (int i = 0; i < 4; i++) {
            if (!valid[i]) {
                return false;
            }
        }
        return true;
    }
}
//Validação 1 para ver se contem 1 e apenas um @
//        String[] emailDivided = mail.split("@");
//        valid = emailDivided.length == 2;

//Validação 2 para ver se o endereço contem o minimo de caracteres necessários ou se passa o máximo
//valid = emailDivided[0].length() > 1 && emailDivided[0].length() < 257;

//Validação 3 para ver se contém algun caractere inválido
//String caracteresInvalidos = ",:;<>()[\\\\]\"` ";
//valid = !emailDivided[0].matches(".*[" + caracteresInvalidos + "]+.*");