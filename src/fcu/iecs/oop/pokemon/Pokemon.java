package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private PokemonType type;
	private int cp;
	
	public Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	public String getName(){
		return name;
	}
	public PokemonType getPokemonType(){
		return type;
	}
	public void setcp(int cp){
		this.cp=cp;
	}
	public int getcp(){
		return cp;
	}
	public void attack() {
	}
	
}
