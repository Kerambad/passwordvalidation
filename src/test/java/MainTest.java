import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void password_lengthTestfalse() {
    //given
        String password = "1234567";
        //when
        boolean actual = Main.password_length(password);
        //then
        assertFalse(actual);

    }

    @Test
    void password_lengthTesttrue() {
        //given
        String password = "12345678";
        //when
        boolean actual = Main.password_length(password);
        //then
        assertTrue(actual);

    }

    @Test
    void password_numberTesttrue() {
        //given
        String password = "Hal10o";
        //when
        boolean actual = Main.password_number(password);
        //then
        assertTrue(actual);

    }

    @Test
    void password_numberTestfalse() {
        //given
        String password = "hallo";
        //when
        boolean actual = Main.password_number(password);
        //then
        assertFalse(actual);

    }

    @Test
    void password_checkdigitTest_true() {
        //given
        String password = "haLlo";
        //when
        boolean actual = Main.password_checkdigit(password);
        //then
        assertTrue(actual);

    }@Test
    void password_checkdigitTest_false() {
        //given
        String password = "hallo";
        //when
        boolean actual = Main.password_checkdigit(password);
        //then
        assertFalse(actual);

    }
    @Test
    void password_checkdigitTest_nodigit() {
        //given
        String password = "{}0977}";
        //when
        boolean actual = Main.password_checkdigit(password);
        //then
        assertFalse(actual);

    }
    @Test
    void password_badwordTest_true() {
        //given
        String password = "12345678";
        //when
        boolean actual = Main.password_badword(password);
        //then
        assertTrue(actual);

    }
    @Test
    void password_badwordTest_false() {
        //given
        String password = "1234fg";
        //when
        boolean actual = Main.password_badword(password);
        //then
        assertFalse(actual);
    }
}
