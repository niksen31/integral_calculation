package com.test.mian;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import org.la4j.inversion.matrix.*;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
public class HelloWorld {

    public static void main(String[] args) 
{
        double randomNum=0.0;
        for(int i=0;i<1000;i++) {
          //technically generating from uniform (0,1)
          randomNum=ThreadLocalRandom.current().nextDouble(0, 1); 
          System.out.println(nr(0,randomNum));}
          Matrix inverse(a
}

   

    public static double gaussian01(double x){ 
        //defining the gaussian (0,1)
         double par=(Math.sqrt(2*Math.PI));
         double ar=(Math.exp(-(x*x)/2));
         return ar/par;}
      
    public static double integx2(double upper){  
    // defining the integration for the gaussian function
          double lower=-9;
          double step= 0.001;
          int ran=(int)((upper-lower)/step);
          double[] xs=new double[ran+1];
          xs[0]=lower;
          for(int i=1; i<=ran;i++) xs[i]=xs[i-1]+step;
          double[] gin= new double[ran+1];
          for(int i=0; i<=ran;i++) gin[i]=step*(gaussian01(xs[i]));
          double sum=0;
          for(int i=0; i<=ran;i++) sum=sum+gin[i];
          return sum;}   
    
   
   public static double fun(double upper1,double u){ 
   //defining the equation which's solution follows the gaussian (0,1) if 'u' is taken from Uniform(0,1) 
          return integx2(upper1)-u;}

   
   public static double grad(double x0, double uu){ 
      // computing the first derivative for the newton-raphson
       return (fun(x0+0.01,uu)-fun(x0,uu))/0.01;}

   public static double nr(double str, double uuu1){ 
        // solving the equation above with the newton raphson method
         double x1=str-fun(str,uuu1)/grad(str,uuu1);
         double dif=x1-str;
         while(Math.abs(dif)>=0.001){
                str=x1;
                x1=str-fun(str,uuu1)/grad(str,uuu1);
                dif=x1-str;}
         return x1;}
              

}

         



























