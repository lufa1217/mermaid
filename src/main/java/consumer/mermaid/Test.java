package consumer.mermaid;

public class Test {

	private int value;
	private String name;

	Test(){
		setValue(10);
		setName("sato");
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return this.value;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void show(){
		System.out.println(this.getValue());
		System.out.println(this.getName());
	}

}
