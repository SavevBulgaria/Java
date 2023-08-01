package OOP20_2;

interface Playable {
    void play();
}

interface Bounceable {
    void bounce();
}

class Ball implements Playable, Bounceable {
    public void play() {
        System.out.println("Playing");
    }

    public void bounce() {
        System.out.println("Bouncing");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.play();
        ball.bounce();
    }
}
