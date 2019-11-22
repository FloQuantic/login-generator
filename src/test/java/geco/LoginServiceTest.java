package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService monLogSer;

    private LoginService alreadyAdd;

    private String login1 = "FloQuantic";

    private String login2 = "Ludo81";

    private List<String> maliste;

    private List<String> malistePreFlo;

    @Before
    public void init(){
        String[] monTabLog = {login1};
        monLogSer = new LoginService(monTabLog);
        String[] monTabEntier = {login1,login2};
        alreadyAdd = new LoginService(monTabEntier);
        maliste = new ArrayList<>();
        maliste.add(login1);
        maliste.add(login2);
        malistePreFlo = new ArrayList<>();
        malistePreFlo.add(login1);
    }

    @Test
    public void loginExistsTest(){
        assertTrue(monLogSer.loginExists(login1));
    }

    @Test
    public void addLoginTest(){
        monLogSer.addLogin(login2);
        assertTrue(alreadyAdd.findAllLogins().containsAll(monLogSer.findAllLogins()));
    }

    @Test
    public void findAllLoginsStartingWithTest(){
        assertEquals(malistePreFlo,monLogSer.findAllLoginsStartingWith("Flo"));
    }

    @Test
    public void findAllLoginsTest(){
        assertEquals(maliste,alreadyAdd.findAllLogins());
    }

}