package pl.sages.klasy;

public class OuterClass {

    private String name;

    class InnerClass{

        void printName(){
            System.out.println(OuterClass.this.name);
        }

        class AnotherInnerClass{
            void print(){
                System.out.println(OuterClass.this.name);
            }
        }
    }

    void print(){

    }

}

class OutsideClass{
    OuterClass o = new OuterClass();
    //o.name = "";
    OuterClass.InnerClass i = o.new InnerClass();
    OuterClass.InnerClass.AnotherInnerClass a = i.new AnotherInnerClass();
}
