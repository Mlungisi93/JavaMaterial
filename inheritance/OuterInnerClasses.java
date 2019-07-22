package inheritance;

class OuterInnerClasses{
    // Simple nested inner class
    public class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }
}
class Main {
    public static void main(String[] args) {
        OuterInnerClasses.Inner in = new OuterInnerClasses().new Inner();
        in.show();
    }
}

