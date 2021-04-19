package test;

import domain.Computer;
import domain.Keyboard;
import domain.Mouse;
import domain.Order;
import domain.Screen;

public class Test {

    public static void main(String[] args) {

        Mouse logitechMouse = new Mouse("WiFi", "Logitech");
        Mouse hpMouse = new Mouse("USB", "HP");

        Keyboard termalKeyboard = new Keyboard("USB", "Termaltake");
        Keyboard logitechKeyboard = new Keyboard("USB", "Logitech");

        Screen asusScreen = new Screen("Asus", 24.6);
        Screen sonyScreen = new Screen("Sony", 16.0);

        Computer computer1 = new Computer("PC Andres", sonyScreen, termalKeyboard, logitechMouse);
        Computer computer2 = new Computer("PC Manu", asusScreen, logitechKeyboard, hpMouse);

        Order order1 = new Order();
        order1.addComputer(computer1);
        order1.addComputer(computer2);

        order1.showOrder();
    }
}
