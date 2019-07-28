public class Stereo {
  String location;
  public Stereo(String location) {
    this.location = location;
  }
  public void on() {
    System.out.println(location + " Stereo on!");
  }
  public void off() {
    System.out.println(location + " Stereo on!");
  }
  public void setCd() {
    System.out.println(location + " Load CD...");
  }
  public void setDvd() {
    System.out.println(location + " Load DVD...");
  }
  public void setRadio() {
    System.out.println(location + " Load Radio...");
  }
  public void setVolume(int volume) {
    if (volume <= 100) {
      System.out.println(location + " Set Volume is " + volume);
    } else {
      System.out.println(location + "Volume is too load");
    }

  }
}
