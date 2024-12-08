package features;

interface Phone{
	void call();
	void message();
	void appStore();
	void camera();
	
	default void SwitchOn(String name) {
		System.out.println("Switching On "+name);
	}
	
	static void SwitchOff(String name) {
		System.out.print("Switching Off iPhone "+name);
	}
}

class IPhone implements Phone{
	public void call() {
		System.out.println("Calling....");
	}
	public void message() {
		System.out.println("Messaging..");
	}
	public void appStore() {
		System.out.println("Opening Apple Store..");
	}
	public void camera() {
		System.out.println("Opening Camera..");
	}

	
}
public class InterfaceDefaultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iPhone = new IPhone();
		iPhone.SwitchOn("iPhone 15");
		iPhone.call();
		iPhone.appStore();
		Phone.SwitchOff("iPhone 15");
	}

}

