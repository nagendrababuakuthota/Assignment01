abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class _04Main {
    public static void main(String[] args) {
        Instrument i1 = new Piano();
        Instrument i2 = new Flute();
        Instrument i3 = new Guitar();
        i1.play();
        i2.play();
        i3.play();
    }
}
