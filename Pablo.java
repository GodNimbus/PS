/**
*Documentacion
@see main Mostramos el hola mundo.
*/
public class Pablo{
	/**
	* @param mana is the amount of energy you have to throw spells.
	* @param age is the years old your character has.
	* @param name is the name from your Pablo character.
	*/
	private int mana;
	protected int age;
	public String name;

	/**
	* The void constructor creates a baby Pablo with only 1 point of mana and 0y/o.
	*/
	public Pablo(){
		this.mana = 1;
		this.age = 0;
	}

	/**
	* This constructor create a Pablo named Pablo and you can select your mana and age.
	*/
	public Pablo(int mana, int age){
		this.mana = mana;
		this.age = age;
		this.name = "Pablo";
	}

	public void frase(Pablo p){
		System.out.println("Sucumbe al poder de "+p.name);
	}

	public static void main(String args[]){
		System.out.println("Hola Mortales, aqui llega Pablo");
		Pablo god = new Pablo(500,50);
		frase(god);
	}
}
