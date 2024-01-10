package Oopsconcepts;
//Write a Java program to create an abstract class Instrument with abstract methods 
//play() and tune(). Create subclasses for Glockenspiel and Violin that extend the 
//Instrument class and implement the respective methods to play and tune each instrument.
abstract class Instrument
{
	abstract void play();
	abstract void tune();
}
class Glockenspiel extends Instrument
{
	void play()
	{
		System.out.println("The Glockenspiel is played by striking the bars with mallets");
	}
	void tune()
	{
		System.out.println("Glockenspiel tune used in Circle of life ");
	}
}
class Violin extends Instrument
{
	void play()
	{
		System.out.println("The violin is played with the bow, not the hand");
	}
	void tune()
	{
		System.out.println("The violin is tuned by adjusting the pegs at the top of the fine tuners at the tailpiece");
	}
}
public class program09abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Glockenspiel
		Glockenspiel g=new Glockenspiel();
		g.play();
		g.tune();
		
		//Violin
		Violin v= new Violin();
		v.play();
		v.tune();

	}

}
