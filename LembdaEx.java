package features;

//To Impelment any interface we need to perform below operations right:
//create interface if there is none already
//create class to implement that interface and 
//implement in form of methods
//create object of interface and call methods to execute events

//below example of Lambda Expression and how it decrease code length, files in system and ease out things

//1.Created Interface Phones have abstract method SwitchOn
interface Phones{
	void SwitchOn();
}

//#1
//2.Created class to implement Phones Interface
//class iPhones5 implements Phones {
//
//	//3.Implemented Unimplemented Method -SwitchOn
//	public void SwitchOn() {
//		// TODO Auto-generated method stub
//		System.out.println("Phone Switched ON");
//	}
//	
//}

public class LembdaEx {

	public static void main(String[] args) {
		/**
		// TODO Auto-generated method stub
		//4.Created object of Interface 
		Phones iPhone = new iPhone();
		//5.Performed Operations
		iPhone.SwitchOn();*/
		
		// TODO Auto-generated method stub

		//#2
		//4.Created object of Interface 
//		Phones iPhone = new iPhones5();
//		//5.Performed Operations
//		iPhone.SwitchOn();

		//To Understand Lambda Exp. Now I am taking steps
		//Currently inside bin there are 3 File
		//LambdaEx,Phones,iPhones5 including code commented in #1,#2
		
		//As there is only one interface to be implemented, 
		//why should i create separate class file, right waste of space and file size
		//Commented part #1
		//Now on commenting my created object start throwing error
		//Cannot instantiate the type Phones
		//So lets created Method here only, 
		//we are aware only Phones object need to be created there is no need of new Phones
		//As soon as I created class within object body
		//new file named-LembdaEx$1 created called Anonymous Inner class
		
		//Phones iPhone = new Phones() 
		//#3
//		Phones iPhone ;
//		iPhone= new Phones(){ //Anonymous Inner class
//			public void SwitchOn() {
//				System.out.println("Phone Switched ON");
//			}
//		};
		
		//Now below code part we have already written in Interface creation
		//Why to write it again Right? replace that part with Lambda Expression
		//Now Anonymous Inner Class file has been deleted
		
//		 new Phones(){ //Anonymous Inner class
//				public void SwitchOn
		//#4
//		Phones iPhone ;
//		iPhone= () -> {
//				System.out.println("Phone Switched ON");
//			
//		};
		
		//we dont need to keeo these {} braces , it doesnt add any value Right?
		//Lets remove It
		//See how simple code become
		Phones iPhone ;
		iPhone= () ->System.out.println("Phone Switched ON");
		iPhone.SwitchOn();
	}
}
