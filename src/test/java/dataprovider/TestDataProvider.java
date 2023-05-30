package dataprovider;

import com.rd.dz12.Man;
import com.rd.dz12.Woman;
import org.testng.annotations.DataProvider;

    public class TestDataProvider {

        @DataProvider(name = "manIsRetireData")
        public static Object[][] manIsRetireData() {
            Man man1 = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
            Man man2 = new Man("Ben", "Benson", "Kyiv", "Ukraine", null, 70);

            return new Object[][] {
                    { man1, false },
                    { man2, true }
            };
        }

        @DataProvider(name = "womanIsRetireData")
        public static Object[][] womanIsRetireData() {
            Woman woman1 = new Woman("Jacklyn", "Jackson", "Kyiv", "Ukraine", null, 60, "Stevenson");
            Woman woman2 = new Woman("Kathy", "Benson", "Kyiv", "Ukraine", null, 45, "Robertson");

            return new Object[][] {
                    { woman1, true },
                    { woman2, false }
            };
        }

        @DataProvider(name = "manPartnership")
        public static Object[][] manPartnership() {
            Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
            Woman woman = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", null, 25, "Danielson");

            return new Object[][] {
                    { man, woman },
                    { null, woman }
            };
        }

        @DataProvider(name = "womanPartnership")
        public static Object[][] womanManPartnership() {
            Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
            Man man = new Man("Ben", "Benson", "Kyiv", "Ukraine", null, 30);

            return new Object[][] {
                    { woman, man },
                    { woman, null }
            };
        }
        @DataProvider(name = "manDeregisterPartnership")
        public static Object[][] manDeregisterPartnership(){
            Woman woman = null;
            Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", woman, 30);
            Woman woman1 = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", man,25,"Danielson");

            return new Object[][]{
                    {man, null}
            };
        }
        @DataProvider(name = "womanDeregisterPartnership")
        public static Object[][] womanDeregisterPartnership(){
            Woman woman = null;
            Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", woman, 30);
            Woman woman1 = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", man,25,"Danielson");

            return new Object[][]{
                    {woman, null}
            };
        }


    }
