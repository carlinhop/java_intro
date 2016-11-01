import static org.junit.Assert.assertEquals;
import org.junit.*;


public class AirportTest{

  Airport edinburgh;
  Plane easyJet;

  @Before
  public void before(){
     edinburgh = new Airport("off") ;
     easyJet = new Plane();
  }

  @Test
  public void radarCanSwitchOn(){
    edinburgh.radarSwitch("on");
    assertEquals("on", edinburgh.getRadarStatus());
  }

   @Test
   public void planeCountStartsAtZero(){
     assertEquals(0,edinburgh.planeCount());

  }

  @Test
  public void canTakePlanes(){
    edinburgh.takePlane(easyJet);
    assertEquals(1, edinburgh.planeCount());
  }


}