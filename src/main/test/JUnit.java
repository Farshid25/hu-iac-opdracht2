package test;


import model.Stad;
import org.junit.Assert;
import org.junit.Test;
import service.BewonerService;

public class JUnit {

TestClass testClass = new TestClass();
BewonerService service = new BewonerService();

    @Test
    public void test1() {
        Stad stad = testClass.geefStad("Amsterdam");
//        Assert.assertEquals(stad, null);
        Assert.assertEquals("Amsterdam", stad.getName());

    }
    public String iets(Stad stad) {


        //JsonObjectBuilder job = Json.createObjectBuilder();
        for (Stad m : service.getCities()) {
            if (service.getCities().contains(m)) {
                System.out.println("poep");
            } else {
                System.out.println("geen poep");

//            List<Stad> list = service.getCities();
//            job.add("naam stad: ", m.getName());
//
//            }
            }
        }return null;
    }
    // OUD TEST
    @Test
    public void testGeefAantalWerklozenPerUtrecht() {
        BewonerService test1 = new BewonerService();
        Assert.assertEquals(16, test1.geefAantalWerklozenPerStad("UtReCht"));
    }
    @Test
    public void testGeefAantalWerklozenPerAmsterdam() {
        BewonerService test2 = new BewonerService();
        Assert.assertEquals(11, test2.geefAantalWerklozenPerStad("AMSTERDAM"));
    }
    @Test
    public void testAantalBewonersUtrecht(){
        BewonerService test3 = new BewonerService();
        Assert.assertEquals(42,test3.geefAantalBewonersPerStad("utrecht"));
    }
    @Test
    public void testAantalBewonersAmsterdam(){
        BewonerService test4 = new BewonerService();
        Assert.assertEquals(43,test4.geefAantalBewonersPerStad("Amsterdam"));
    }
    @Test
    public void testAantalArbeidersAmsterdam(){
        BewonerService test5 = new BewonerService();
        Assert.assertEquals(23,test5.geefAantalArbeidersPerStad("amsterdam"));
    }
    @Test
    public void testAantalArbeidersUtrecht(){
        BewonerService test6 = new BewonerService();
        Assert.assertEquals(43,test6.geefAantalArbeidersPerStad("utrecht"));
    }

}
