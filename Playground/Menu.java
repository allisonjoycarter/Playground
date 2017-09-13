package Playground;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private ArrayList<String> options = new ArrayList<>();

    public Menu() {

    }

    public void addOption(){//add an option to the menu
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");

        System.out.println(options);


    }
    public void delOption(){//remove an option from the menu
        options.remove(2);

        System.out.println("Options after removal: " + options);


    }
    public void runMenu(){//makes a menu in the UI
        for(int i = 0; i < options.size(); i++){
            System.out.println(options(i));
        }


    }
    public void changeOption(){//CHALLENGE: change an option from one thing to another

    }


    //hint: who says menu has to be the only object you create?




}
