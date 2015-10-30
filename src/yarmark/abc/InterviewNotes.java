package yarmark.abc;

public class InterviewNotes {
/*
 * what are the 4 main part of OOP
 * 
 * An OOP class should do the minimum work possible.
 * 'single responsibility'
 * 
 * 1. inheritance
 * 	- one class extends another class, using super to call its constructors
 * and objects to call its methods
 * 
 * 2. polymorphism
 * can write code to be used any of a large array of class types
 * it will work for all the class types that extend/implement it
 * ex:
 * container.add(new SmileComponent(), BorderLayout.CENTER)
 * because container is an interface
 * 
 * 3. encapsulation
 * - data hiding, calling member variables private
 * 
 * 
 * 4. abstraction
 * putting all the complicated stuff behind the scenes
 * HOW something gets done is not important
 * 
 * DO NOT USE INSTANCEOF
 * 
 * 
 * design pattern:
 * By GoF
 * recurring problems and solutions in programming
 * SINGLETON:
 * if you will want access to the scrabble dictionary in a few places, you only want to load the class once.
 * where ever you are in your program, you will get access to the same dictionary
 * use A STATIC public variable of scrabble dictionary
 * (usually called singlton, instance)
 * 
 *  static- there is only one instance of this variable in the application
 *  a static method can be access without an instance variable
 *  call it with ClassName.methodName
 *  making the constructor private only allows the instantiation of one instance,
 *  with the getInstance
 *  
 *  BUILDER:
 *  put pieces together until its done and then call the build method
 *  ex: StringBuilder appends to the string
 *  when done, call toString()
 *  
 *  OBSERVABLE:
 *  i want to know when something happens
 *  actionlistener lets you know when something happes
 *  create listener
 *  give it to the object you want it to listen to
 *  
 *  MODEL VIEW CONTROLLER / MVC:
 *  used in GUI programming
 *  have model, view, and controller (as 3 separate pieces)
 *  
 *  MODEL- in memory object that represents what's on screen. the actual data
 *  ex: Projectile class
 *  it doesn't know anything abotu drawing, only math
 *  
 *  VIEW- know how to draw the projectile on the screen
 *  ex: ProjectileComponent
 *  
 *  CONTROLLER- know how to manipulate the object and updates the view
 *  ex: ActionListener*
 *  
 *  
 *  
 *  11/19- project due
 *  connect4 gui
 *  2 players
 *  6x7
 *  each cell as its own component
 *  grid layout
 */
}
