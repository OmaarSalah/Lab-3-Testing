import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class DigitalWatchTest {

    public static DigitalWatch dw1;
    public static AlarmMod am1;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            dw1 = new DigitalWatch();
            am1 = new AlarmMod();
        }

        @Test
        public void testdw1(){
            assertTrue(dw1.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(dw1.input('a'));
        }


        @Test
        public void testdw4(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw5(){
            assertTrue(dw1.input('c'));
        }

        @Test
        public void testdw6(){
            assertTrue(dw1.input('t'));
        }

        @Test
        public void testdw7(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw8(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(dw1.input('m'));
        }

        @Test
        public void testdw10(){
            assertTrue(dw1.input('D'));
        }

        @Test
        public void testdw11(){
            assertTrue(dw1.input('M'));
        }

        @Test
        public void testdw12(){
            assertTrue(dw1.input('Y'));
        }

        @Test
        public void testdw13(){
            assertTrue(dw1.input('t'));
        }

        @Test
        public void testam(){
            assertFalse(am1.checkA());
            assertFalse(am1.unsetA());
            assertTrue(am1.setA());
            assertTrue(am1.checkA());
            assertTrue(am1.setA());
            assertFalse(am1.setA());
            assertTrue(am1.unsetA());
        }

    }


    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            dw1 = new DigitalWatch();
            am1 = new AlarmMod();
        }

        @Test
        public void testam() {
            assertFalse(am1.checkA());
            assertFalse(am1.unsetA());
            assertTrue(am1.setA());
            assertTrue(am1.checkA());
            assertTrue(am1.setA());
            assertFalse(am1.setA());
            assertTrue(am1.unsetA());
        }


        @Test
        public void testdw1(){
            assertTrue(dw1.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(dw1.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw4(){
            assertTrue(dw1.input('c'));
        }

        @Test
        public void testdw5(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw6(){
            assertTrue(dw1.input('u'));
        }

        @Test
        public void testdw7(){
            assertTrue(dw1.input('t'));
        }

        @Test
        public void testdw8(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(dw1.input('s'));
        }

        @Test
        public void testdw10(){
            assertTrue(dw1.input('m'));
        }

        @Test
        public void testdw11(){
            assertTrue(dw1.input('D'));
        }

        @Test
        public void testdw12(){
            assertTrue(dw1.input('M'));
        }

        @Test
        public void testdw13(){
            assertTrue(dw1.input('Y'));
        }

        @Test
        public void testdw14(){
            assertTrue(dw1.input('t'));
        }
    }

}