package geco;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService monLogSer = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    private LoginGenerator monGen = new LoginGenerator(monLogSer);
    private String test1 = "FTHI";
    private String test2 = "JROL1";
    private String test3 = "JRAL2";
    private String test4 = "PDU";

    @Test
    public void generateLoginForNomAndPrenomTest1() {
        assertEquals(test1,monGen.generateLoginForNomAndPrenom("Thibaut","Florent"));
    }

    @Test
    public void generateLoginForNomAndPrenomTest2() {
        assertEquals(test2,monGen.generateLoginForNomAndPrenom("Rolland","Jérome"));
    }

    @Test
    public void generateLoginForNomAndPrenomTest3() {
        assertEquals(test3,monGen.generateLoginForNomAndPrenom("Ralbat","Jackie"));
    }

    @Test
    public void generateLoginForNomAndPrenomTest4() {
        assertEquals(test4,monGen.generateLoginForNomAndPrenom("Du","Paul"));
    }
}