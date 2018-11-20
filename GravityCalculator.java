/*
 * Intro to Programming in Java
 * 
 * Assignment 1: Gravity Calculator
 * Computes distance an object fall's in Earth's gravity.
 * 
 */ 

import java.io.*;

public class GravityCalculator {

	public static void main(String[] arguments){

		double  acceleration =-9.81; // Earth's gravity in m/s^2

		double  fallingTime = 10.0; // starting time of fall (s)

		double  initialVelocity = 0.0; // Initial velocity of the falling object (m/s)

		double  initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending position in meters

		double finalPosition = (.5 * acceleration * (fallingTime*fallingTime)) + (initialVelocity * fallingTime) + initialPosition;
		
		System.out.println("An object's position after " + fallingTime + " seconds is " + finalPosition + " meters.");

	}
}