public class Car {
    String name;
    double power;
    int speed;

    Car(String n, double p, int s) {
        name = n;
        power = p;
        speed = s;
    }

    void turbo() {
        power = power * 1.1;
    }

    void increaseSpeed(int moreSpeed) {
        speed += moreSpeed;
    }

    void desreasedSpeed(int lessSpeed) {
        speed -= lessSpeed;
    }

    String getInfo() {
        return "Car name: " + name + ", moc: " + power + ", predkosc: " + speed;
    }
}
