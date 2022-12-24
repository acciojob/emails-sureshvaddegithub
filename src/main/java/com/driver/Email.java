package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(password.equals(oldPassword)){
            if(newPassword.length()>=8){
                int upper = 0;
                int lower = 0;
                int digit = 0;
                int specialCharacter = 0;
                for(int i = 0;i<newPassword.length();i++){
                    char c = newPassword.charAt(i);
                    if(Character.isUpperCase(c))
                        upper++;
                    else if(Character.isLowerCase(c))
                        lower++;
                    else if(Character.isDigit(c))
                        digit++;
                    else
                        specialCharacter++;
                }
                if(upper>0 && lower>0 && digit>0 && specialCharacter>0)
                    password = newPassword;
            }
        }
    }
}
