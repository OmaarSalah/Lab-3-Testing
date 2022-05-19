import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class CofeeMachineTest {


    public static CofeeMachine cm1;
    public static CofeeRes cr1;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            cm1 = new CofeeMachine();
            cr1 = new CofeeRes();
        }

        @Test
        public void testCm1(){
            assertFalse(cm1.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm1.input('l'));
        }


        @Test
        public void testCm4(){
            assertTrue(cm1.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm1.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm1.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm1.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm1.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void testCr(){
            assertFalse(cr1.useBeans());
            assertFalse(cr1.useWater());
            assertFalse(cr1.useMilk());
            assertFalse(cr1.useChoco());
            cr1.refillBeans(1);
            cr1.refillWater(1);
            cr1.refillMilk(1);
            cr1.refillChoco(1);
            assertTrue(cr1.useBeans());
            assertTrue(cr1.useWater());
            assertTrue(cr1.useMilk());
            assertTrue(cr1.useChoco());
        }

    }


    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            cm1 = new CofeeMachine();
            cr1 = new CofeeRes();
        }

        @Test
        public void testCr(){
            assertFalse(cr1.useBeans());
            assertFalse(cr1.useWater());
            assertFalse(cr1.useMilk());
            assertFalse(cr1.useChoco());
            cr1.refillBeans(1);
            cr1.refillWater(1);
            cr1.refillMilk(1);
            cr1.refillChoco(1);
            assertTrue(cr1.useBeans());
            assertTrue(cr1.useWater());
            assertTrue(cr1.useMilk());
            assertTrue(cr1.useChoco());
        }


        @Test
        public void testCm1(){
            assertFalse(cm1.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm1.input('l'));
        }

        @Test
        public void testCm3(){
            assertFalse(cm1.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm1.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm1.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm1.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm1.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm1.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm1.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm1.input('c'));
        }

    }



}