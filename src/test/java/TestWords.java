import org.junit.jupiter.api.Test;
import service.ComparerService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestWords {


    //Input: 1=somemessage 2=emma Output: 1=essa
    @Test
    public void TestEmma() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("somemessage", "emma"), "essa");

    }

    //Input: 1=billoldo 1=tam Output: 1=old
    @Test
    public void TestTam() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("billoldo", "tam"), "old");
    }

    //Input: 1=welcome 2=orange Output 1=welcom
    @Test
    public void TestOrange() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("welcome", "orange"), "welcom");

    }

    //Input: tamerderstecher, ingee output: erste
    @Test
    public void TestIngee() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("tamerderstecher", "ingee"), "erste");

    }

    //input: axelsenikitlasin, birol output: nikit
    @Test
    public void TestBirol() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("axelsenikitlasin", "birol"), "nikit");

    }

    //input: schlappschlappschlappi birooool
    //output: hlappsch output: hlappsch
    @Test
    public void TestBirooool() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("schlappschlappschlappi", "birooool"), "hlappsch hlappsch");
    }

    //input: treetreetree wood
    //output: reet output: reet
    @Test
    public void TestWood() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("treetreetree", "wood"), "reet reet");

    }


    //Input: 1=relativer 2=overlay
/*
    @Test
    public void TestOverlay() {
        ComparerService comparer = new ComparerService();
        assertEquals(comparer.compareWords("relativer", "overlay"), "xxx");

    }
*/



}
