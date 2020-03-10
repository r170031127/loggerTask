package DesignPatternBehavioral;

public class Abc {
private State s;

void A()
{
	s=null;
}
public void setState(State s){
    this.s = s;		
 }

 public State getState(){
    return s;
 }
}