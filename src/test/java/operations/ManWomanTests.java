package operations;

import com.rd.dz12.Man;
import com.rd.dz12.Person;
import com.rd.dz12.Woman;
import dataprovider.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManWomanTests {

    @Test(dataProvider = "manIsRetireData", dataProviderClass = TestDataProvider.class)
    public void testManIsRetired(Man man, boolean expected) {
        Assert.assertEquals(man.isRetired(), expected, "This result is wrong for man");
    }
    @Test(dataProvider = "womanIsRetireData", dataProviderClass = TestDataProvider.class)
    public void testWomanIsRetired(Woman woman, boolean expected) {
        Assert.assertEquals(woman.isRetired(), expected, "This result is wrong for woman");
    }
    @Test(dataProvider = "manPartnership", dataProviderClass = TestDataProvider.class)
    public void testManPartnership(Man man, Woman woman){
        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(),woman, "Register partnership method not working, null is wrong for man");
    }
    @Test(dataProvider = "womanPartnership", dataProviderClass = TestDataProvider.class)
    public void testWomanPartnership(Woman woman, Man man){
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getPartner(),man, "Register partnership method not working, null is wrong for woman");
    }
    @Test(dataProvider = "manDeregisterPartnership", dataProviderClass = TestDataProvider.class)
    public void testManDeregisterPartnership(Man man){
        man.deregisterPartnership();
        Assert.assertNull(man.getPartner(), "Partner value should be null for man");
    }
    @Test(dataProvider = "womanDeregisterPartnership", dataProviderClass = TestDataProvider.class)
    public void testWomanDeregisterPartnership(Woman woman){
        woman.deregisterPartnership(true);
        Assert.assertNull(woman.getPartner(), "Partner value should be null for woman");
    }
}
