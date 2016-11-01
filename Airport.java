public class Airport{
  private String radarStatus;
  private Plane[] planeCapacity;

  public Airport(String radarStatus){
    this.radarStatus = radarStatus;
    this.planeCapacity = new Plane[10];
  }

  public String getRadarStatus(){
    return this.radarStatus;

  }
  public void radarSwitch(String status){
    this.radarStatus = status;
  }

  public int planeCount(){
    int result = 0;
    for (Plane plane: this.planeCapacity ) {
      if(plane != null){
        result ++;
      }
    }
    return result;
  }

  public void takePlane(Plane plane){
    this.planeCapacity[planeCount()] = plane;
  }
}