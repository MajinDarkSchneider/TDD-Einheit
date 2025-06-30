package org.example;

import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}
class PlayerCharacter{
    static int[] position = {0,0};
    public static void main(String[] args) {
    }
    public static int getX(){
        return position[0];
    }
    public static int getY(){
        return position[1];
    }
    public static void setX(int newValue){
        position[0] = newValue;
    }
    public static void setY(int newValue){
        position[1] = newValue;
    }
    public static void moveW(){
        setY(getY()+1);
    }
    public static void moveA(){
        setX(getX()-1);
    }
    public static void moveS(){
        setY(getY()-1);
    }
    public static void moveD(){
        setX(getX()+1);
    }

}