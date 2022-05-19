import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class AtmTest {

    public static Atm atm1;
    public static AtmRes atr1;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            atm1 = new Atm();
            atr1 = new AtmRes();
        }

        @Test
        public void testatm1(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atm1.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm1.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm1.input('o'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm1.input('u'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm1.input('f'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void testatr(){
            assertFalse(atr1.withdraw());
            atr1.fill(1);
            assertTrue(atr1.withdraw());
            assertFalse(atr1.withdraw());
            atr1.fill(3);
            assertTrue(atr1.withdraw());
            assertTrue(atr1.withdraw());
            assertTrue(atr1.withdraw());
        }

    }


    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            atm1 = new Atm();
            atr1 = new AtmRes();
        }

        @Test
        public void testatr(){
            assertFalse(atr1.withdraw());
            atr1.fill(1);
            assertTrue(atr1.withdraw());
            assertFalse(atr1.withdraw());
            atr1.fill(3);
            assertTrue(atr1.withdraw());
            assertTrue(atr1.withdraw());
            assertTrue(atr1.withdraw());
        }


        @Test
        public void testatm1(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atm1.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm1.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm1.input('w'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm1.input('o'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm1.input('u'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm1.input('f'));
        }

        @Test
        public void testatm8(){
            assertTrue(atm1.input('l'));
        }

        @Test
        public void testatm9(){
            assertTrue(atm1.input('l'));
        }

    }




}