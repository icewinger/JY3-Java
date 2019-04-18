package com.neuedu.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Practice702 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入品牌");
		String brand = scanner.next();
		System.out.println("请输入颜色");
		String color = scanner.next();
		Vehicle vehicle = new Vehicle(brand,color);
		System.out.println(vehicle);
		vehicle.run();
		System.out.println();
		System.out.println("请输入可载人数");
		int loader = scanner.nextInt();
		Car car = new Car(brand,color,loader);
		System.out.println(car);
		car.run();
	}
}
class Vehicle 
{
	final String brand ;
	final String color ;
	Double speed = 0.0;
	
	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", speed=" + speed + "]";
	}
	
	public Vehicle(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	public void run() {
		System.out.println("这车不好，开出去一公里发动机漏油");
	}
	
}
class Car extends Vehicle
{
	int loader;
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", color=" + color + ", speed=" + speed + "]"+"Car [loader=" + loader + "]";
	}
	public Car(String brand,String color,int loader) {
		super(brand, color);
		this.loader = loader;
	}
	public void run() {
		System.out.println("这车真的不好 又一个开了不到一百公里就发动机漏油的");
	}
}
