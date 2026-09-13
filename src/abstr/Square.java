package abstr;

public class Square extends Shape{
    void square() {
        System.out.println("This is Square ");
        colour("Red");
    }

    @Override
    void colour(String colour) {
        System.out.println("The colour is "+colour);
    }
}

