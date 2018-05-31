public class DeferredVarReturnType {
    public void main() {
        A a = new A();
        //System.out.println(a.getFoo().length());
        //a.setFoo("");
        a.setFoo(null);
        //a.setFoo<error descr="'setFoo(java.lang.String)' in 'A' cannot be applied to '(int)'">(1)</error>;

        //a.foobaz = "";
        //a.foobaz = <warning descr="'null' is assigned to a variable that is annotated with @NotNull">null</warning>;
        //<error descr="Incompatible types. Found: 'int', required: 'java.lang.String'">a.foobaz = 1</error>;
    }
}
