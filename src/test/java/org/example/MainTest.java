package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @BeforeEach
    void unset(){
        PlayerCharacter.setX(0);
        PlayerCharacter.setY(0);
    }
    @Test
    void getX(){
        //GIVEN

        //WHEN
        int valueX = PlayerCharacter.getX();
        //THEN
        assertEquals(valueX, 0);
    }
    @Test
    void getY(){
        //GIVEN

        //WHEN
        int valueY = PlayerCharacter.getY();
        //THEN
        assertEquals(valueY, 0);
    }

    @Test
    void moveW(){
        //Given
        int[] position = {PlayerCharacter.getX(),PlayerCharacter.getY()};
        //WHEN
        PlayerCharacter.moveW();
        //THEN
        assertEquals(1,PlayerCharacter.getY());
    }
    @Test
    void moveA(){
        //Given
        int[] position = {PlayerCharacter.getX(),PlayerCharacter.getY()};
        //WHEN
        PlayerCharacter.moveA();
        //THEN
        assertEquals(-1,PlayerCharacter.getX());
    }
    @Test
    void moveS(){
        //Given
        int[] position = {PlayerCharacter.getX(),PlayerCharacter.getY()};
        //WHEN
        PlayerCharacter.moveS();
        //THEN
        assertEquals(-1,PlayerCharacter.getY());
    }
    @Test
    void moveD(){
        //Given
        int[] position = {PlayerCharacter.getX(),PlayerCharacter.getY()};
        //WHEN
        PlayerCharacter.moveD();
        //THEN
        assertEquals(1,PlayerCharacter.getX());
    }
    @Test
    void moveADouble(){
        //Given
        int[] position = {PlayerCharacter.getX(),PlayerCharacter.getY()};
        //WHEN
        PlayerCharacter.moveA();
        PlayerCharacter.moveA();
        //THEN
        assertEquals(-2,PlayerCharacter.getX());
    }
}
