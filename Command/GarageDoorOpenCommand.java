public class GarageDoorOpenCommand implements Command {
  GarageDoor garage;
  public GarageDoorOpenCommand(GarageDoor garage) {
    this.garage = garage;
  }
  public void execute() {
    garage.up();
  }
}
