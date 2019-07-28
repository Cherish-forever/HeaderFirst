public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    /* Light */
    Light light= new Light("Living Room");
    LightOnCommand LightOn = new LightOnCommand(light);
    /* Garage Door */
    GarageDoor garage = new GarageDoor("");
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);

    remote.SetCommand(LightOn);
    remote.buttonWasPressed();
    remote.SetCommand(garageOpen);
    remote.buttonWasPressed();
  }
}
