package com.example.liskovsubstitution.mobprogramming.solution;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ObjectsWithoutEnginesTest {
    @Test
public void whenForceAppliedIsTrueThenMessageContainsStartMoving(){
        //given
        Bicycle bicycle = new Bicycle();
        Skateboard skateboard = new Skateboard();

        //when
        String whenbicycle = bicycle.applyForce(true);
        String whenskateboard = skateboard.applyForce(true);

        //then
        assertTrue(whenbicycle.contains("Start moving"));
        assertTrue(whenskateboard.contains("Start moving"));
    }

    @Test
public void whenForceAppliedIsFalseThenMessageContainsApplyMoreForce(){
        //given
        Bicycle bicycle = new Bicycle();
        Skateboard skateboard = new Skateboard();

        //when
        String whenbicycle = bicycle.applyForce(false);
        String whenskateboard = skateboard.applyForce(false);

        //then
        assertTrue(whenbicycle.contains("Apply more force"));
        assertTrue(whenskateboard.contains("Apply more force"));
    }
}
