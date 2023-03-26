package tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    @Test
    public void isOnTest(){
        AirConditioner royalAc = new AirConditioner();
        royalAc.setOn(true);
        assertTrue(royalAc.isOn());
    }
    @Test
    public void decreaseTemperatureTest(){
        AirConditioner royalAc = new AirConditioner();
        int result = royalAc.decreaseTemperature(18);
        assertEquals(17, result);
    }

    @Test
    public void getProductNameTest(){
        AirConditioner royalAc = new AirConditioner();
        royalAc.setProductName("royalAC");
        //String result = royalAc.getProductName();
        assertEquals("royalAC", royalAc.getProductName());
    }

    @Test
    public void increaseTemperatureTest(){
        AirConditioner royalAc = new AirConditioner();
        assertEquals(15, royalAc.getTemperature());

        royalAc.setTemperature();
        royalAc.setTemperature();

        assertEquals(17, royalAc.getTemperature());
    }
    //@Test
   // public void onAirCondition(){
        //given
    //    AirConditioner acOne = new AirConditioner();

        //when
     //   acOne.onAc(true);

        //assert
        //boolean Status = segunAc.getAcStatus();
        //assertTrue(acOne.getOnAcStatus());
   //     assertTrue(true);

   // }

    //private void acOne(boolean b) {
    //}
   // @Test
    //public void offAirCondition(){
        //given
       // AirConditioner acTwo = new AirConditioner();

        //when
       // acTwo.getOffAcStatus(false);

        //assert
       // assertFalse(false);
    //}


}