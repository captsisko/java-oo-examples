abstract class Animal {

}

abstract class Carnivore extends Animal {

}

abstract class Herbivore extends Animal {

}

class Deer extends Herbivore {

}

public class AbstractExample {
    
    public static void main(String[] args) {


	Deer deer = new Deer();
	
    }
}
