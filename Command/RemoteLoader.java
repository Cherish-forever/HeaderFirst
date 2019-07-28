public class RemoteLoader {
  public static void main(String[] args) {
      RemoteControl remoteControl = new RemoteControl();
      Light livingRoomLight = new Light("Living Room");
      Light kitchenLight = new Light("Kitchen");
      Stereo stereo = new Stereo("Living Room");

      LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
      LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

      LightOnCommand kitchenOn = new LightOnCommand(kitchenLight);
      LightOffCommand kitchenOff = new LightOffCommand(kitchenLight);

      StereoOnWithCDCommand steroOnWithCD = new StereoOnWithCDCommand(stereo);
      StereoOffCommand stereoOff = new StereoOffCommand(stereo);

      remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
      remoteControl.setCommand(1, kitchenOn, kitchenOff);
      remoteControl.setCommand(2, steroOnWithCD, stereoOff);

      System.out.println(remoteControl);

      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      remoteControl.onButtonWasPushed(1);
      remoteControl.offButtonWasPushed(1);
      remoteControl.onButtonWasPushed(2);
      remoteControl.offButtonWasPushed(2);
  }
}
