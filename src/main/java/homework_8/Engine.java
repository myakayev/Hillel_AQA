package homework_8;

import lombok.Getter;

public class Engine {
    @Getter
    String type;

    public Engine(String type) {
        this.type = type;
    }

    void startEngine (){
        System.out.println("The engine is started!");
    }
}
