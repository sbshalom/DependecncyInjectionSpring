/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdependencyinjection;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Administrator
 */
public class Triangle implements ApplicationContextAware, BeanNameAware{
    
    private ApplicationContext context=null;

    public ApplicationContext getApplicationContext() {
        return context;
    }
    private List<Point> points;
    
    @Override
      public void setApplicationContext(ApplicationContext ac) throws BeansException{
          this.context=ac;
      }

    public ApplicationContext getContext() {
        return context;
    }
    
      
      
    @Override
    public void setBeanName(String string){
        System.out.println(string);
    }
//    private Point pointA, pointB,pointC;
//
//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;}
    
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    
    public void draw(){
           for(Point point:points)
           {
               System.out.println("X:"+point.getX()+" Y:"+point.getY()+"\n"+getContext());
           } 
//       System.out.println("X:" + getPointA().getX()+" Y:" + getPointA().getY());
//       System.out.println("X:" + getPointB().getX()+" Y:" + getPointB().getY());
//       System.out.println("X:" + getPointC().getX()+" Y:" + getPointC().getY());
    }
}
