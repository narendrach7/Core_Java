package com.FunctionalInterfaces;

import java.util.function.Function;
class SensorData {
 private double temperature;
 private double humidity;
 
 public SensorData(double temperature, double humidity) {
     this.temperature = temperature;
     this.humidity = humidity;
 }

 public double getTemperature() {
     return temperature;
 }

 public void setTemperature(double temperature) {
     this.temperature = temperature;
 }

 public double getHumidity() {
     return humidity;
 }

 public void setHumidity(double humidity) {
     this.humidity = humidity;
 }
}

class TemperatureAnalyzer {
 public static void main(String[] args) {
     SensorData data = new SensorData(28.5, 65.0);

     double threshold = 25.0;

     Function<SensorData, Double> extractTemperature = new Function<SensorData, Double>() {
         @Override
         public Double apply(SensorData sensorDataInstance) {
             return sensorDataInstance.getTemperature();
         }
     };

     Function<Double, Boolean> isAboveThreshold = new Function<Double, Boolean>() {
         @Override
         public Boolean apply(Double temp) {
             return temp > threshold;
         }
     };

     Double extractedTemp = extractTemperature.apply(data);
     System.out.println("Extracted Temperature: " + extractedTemp + "°C");

     Boolean result = isAboveThreshold.apply(extractedTemp);
     System.out.println("Is temperature above threshold (" + threshold + "°C)? " + result);
 }
}

