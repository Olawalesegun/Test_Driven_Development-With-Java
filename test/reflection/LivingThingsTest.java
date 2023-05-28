package reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LivingThingsTest {

    @Test
    public void test(){
        LivingThings moruf = new Mammals();
        LivingThings taiye = new Pisces();
        taiye.move();

    }
    @Test
    public void test2(){
        Object age = 23;
        age = "Ade";
        age = new LivingThings();
        age = new Mammals();
        age = 'c';
        age = true;
        age = 2.34;
        age = 2.3f;
    }
    @Test
    public void test3(){
        Mammals mamal = new Mammals();
   /* mamal.setName("Ade");
        System.out.println(mamal.getName());*/
    }
  
}