package functionalInterface;
//lambda with no parameter

interface Statement {
public String greet();
}
public class LambdaNP {
public static void main(String[] args) {
Statement s = () -> {return "Hello World.";};
System.out.println(s.greet());
}
}

