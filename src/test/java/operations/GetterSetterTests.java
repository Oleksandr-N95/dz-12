package operations;

import com.rd.dz12.Man;
import com.rd.dz12.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetterSetterTests {

    private Woman woman = null;
    private Man man = null;

    @BeforeTest
    private void createUsers() {
        man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
    }
    @Test
    public void testManGetCity(){
        Assert.assertEquals(man.getCity(),"Kyiv", "City is not getting for man");
    }
    @Test
    public void testManGetPartner(){
        Assert.assertEquals(man.getPartner(),woman, "Partner is not getting for man");
    }
    @Test
    public void testManSetPartner(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", null,25,"Danielson");
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "This partner is wrong for man");
    }
    @Test
    public void testManSetCity(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setCity("Lviv");
        Assert.assertEquals(man.getCity(), "Lviv", "This city is wrong for man");
    }
    @Test
    public void testManGetCountry(){
        Assert.assertEquals(man.getCountry(), "Ukraine", "Country parameters is incorrect for man");
    }
    @Test
    public void testManSetCountry(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setCountry("USA");
        Assert.assertEquals(man.getCountry(), "USA", "This country is wrong for man");
    }
    @Test
    public void testMangetAge(){
        Assert.assertEquals(man.getAge(), 30, "This age is wrong for man");
    }
    @Test
    public void testManSetAge(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setAge(35);
        Assert.assertEquals(man.getAge(), 35, "This age is incorrect for man");
    }

    @Test
    public void testWomanGetCity(){
        Assert.assertEquals(woman.getCity(),"Lviv", "This city is wrong for Woman");
    }
    @Test
    public void testWomanGetPartner() {
        Assert.assertEquals(woman.getPartner(), man, "Partner parameters is incorrect for woman");
    }
    @Test
    public void testWomanSetPartner(){
        Man man = new Man("Steve", "Stevson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "Partner value is wrong for woman");
    }
    @Test
    public void testWomanSetCity(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setCity("Kharkiv");
        Assert.assertEquals(woman.getCity(), "Kharkiv", "Lviv is wrong for woman");
    }
    @Test
    public void testWomanGetCountry(){
        Assert.assertEquals(woman.getCountry(), "Ukraine", "This country is wrong for woman");
    }
    @Test
    public void testWomanSetCountry(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setCountry("Spain");
        Assert.assertEquals(woman.getCountry(), "Spain", "Spain is wrong country for woman");
    }
    @Test
    public void testWomangetAge(){
        Assert.assertEquals(woman.getAge(), 30, "This age is wrong for woman");
    }
    @Test
    public void testWomanSetAge(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setAge(40);
        Assert.assertEquals(woman.getAge(), 40, "Its wrong age value for woman");
    }
}
