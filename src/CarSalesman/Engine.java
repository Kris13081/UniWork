package CarSalesman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;
    Scanner scanner = new Scanner(System.in);


    public Engine(String model, int power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(){

    }


    public Engine engineInitializer() {
        Engine engine;
        String[] enginData = scanner.nextLine().split(" ");
        String engineModel = enginData[0];
        int enginePower = Integer.parseInt(enginData[1]);
        if (enginData.length- 1 < 3) {
            char character = enginData[2].charAt(0);
            if (character >= 101 && character <= 132) {
                String engineEfficiency = enginData[2];
                engine = new Engine(engineModel, enginePower, "n/a", engineEfficiency);

                return engine;
            } else if (character >= 48 && character <= 57) {
                String engineDisplacement = enginData[2];
                engine = new Engine(engineModel, enginePower, engineDisplacement, "n/a");
                return engine;
            }
        }
        String engineDisplacement = enginData[2];
        String engineEfficiency = enginData[3];
        engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
        return engine;
    }

    public Map<String, Engine> enginProducer(){
        int numberOfEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();
        for (int i = 0; i < numberOfEngines; i++) {
            Engine engine = new Engine().engineInitializer();
            engines.put(engine.getModel(),engine);
        }
        return engines;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("""
                %s:
                Power: %s
                Displacement: %s
                Efficiency: %s
                """, model, power, displacement, efficiency);
    }
}
