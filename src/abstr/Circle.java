package abstr;

public class Circle extends Shape{
    void circle() {
        System.out.println("This is Circle ");
        colour("Yellow");
    }

    @Override
    void colour(String colour) {
        System.out.println("The colour is "+colour);
    }
}

