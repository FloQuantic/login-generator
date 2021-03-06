package geco;

import java.util.Random;

public class PasswordGeneration {

    private static PasswordGeneration monGen;

    private PasswordGeneration() { }

    public static PasswordGeneration getInstance(){
        if (monGen==null){
            monGen = new PasswordGeneration();
        }
        return monGen;
    }

    public String getRandomPassword(){
        Random r = new Random();
        String pwd = "";
        for (int i=0; i<8; i++){
            pwd += (char)(r.nextInt(26)+'a');
        }
        return pwd;
    }

}
