package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    @Test
    public void getTelevisionStatusBeforeOnTest(){
        Television sonyTv = new Television();
        assertFalse(sonyTv.turnOn());
    }
    @Test
    public void getTelevisionOnTest(){
        Television sonyTv = new Television();
        sonyTv.toggleOn();
        assertTrue(sonyTv.turnOn());
    }
    @Test
    public void changeChannelUpTest(){
        Television sonyTv = new Television();
        sonyTv.setChannel();
        sonyTv.setChannel();
        sonyTv.setChannel();
        assertEquals(4, sonyTv.changeChannel());
    }
    @Test
    public void changeChannelDownTest(){
        Television sonyTv = new Television();
        sonyTv.setChannel();
        sonyTv.setChannel();
        sonyTv.setDecreasedChannel();
        assertEquals(2, sonyTv.changeChannel());
    }
    @Test
    public void increaseChannelVolumeTest(){
        Television sonyTv = new Television();
        for(int count=0; count<6; count++){
            sonyTv.setIncreaseVolume();
        }
        assertEquals(36,sonyTv.getVolume());
    }
    @Test
    public void decreaseChannelVolumeTest(){
        Television sonyTv = new Television();
        for(int count = 1; count <=4; count++){
            sonyTv.setDecreaseVolume();
        }
        assertEquals(26, sonyTv.getVolume());
    }
vb
    @Test
    public void

}