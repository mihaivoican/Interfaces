package interfaces3;
// atentie: o cls poate implementa 2 interfete deodata
public class DemoClass implements FirstInterface,SecondInterface{
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
