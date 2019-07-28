public class GarageDoor {
  String location;
  public GarageDoor(String location) {
    this.location = location;
  }
  public void up() {
    System.out.println(location + " Garage Door is Opne!");
  }
  public void down() {
    System.out.println(location + " Garage Door is Close!");
  }
  public void stop() {
    System.out.println(location + " Garage Door is Stop!");
  }
  public void lightOn() {
    System.out.println(location + " Garage Light On!");
  }
  public void lightOff() {
    System.out.println(location + " Garage Light Off!");
  }
}
