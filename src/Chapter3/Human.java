package Chapter3;

public class Human {
    private String color;

    public Human(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public static void main(String[] args){
        Human deborah = new Human("red");
        System.out.println(deborah.getColor());
        deborah.setColor("green");
        System.out.println(deborah.getColor());

    }

}
