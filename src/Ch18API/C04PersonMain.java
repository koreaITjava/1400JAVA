package Ch18API;

class Person
{
	
	private String name;	//이름
	private String id;		//주민번호
	private String addr;	//주소
	
	public Person(String name,String id,String addr){
		super();
		this.name = name;
		this.id=id;
		this.addr=addr;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;
			
			return this.id.equals(down.id) && this.addr.equals(down.addr);
		}
		return false;
	};
	
	
	//생성자는 Main 함수 보면서 만들어보세요
	//toString() 재정의 name과 addr만 리턴
	//equals () 재정의 id와 addr가 일치하면 true/불일치하면 false
}

public class C04PersonMain {

	public static void main(String[] args) {
		Person hong1 = new Person("홍길동","888888-8888888","대구");
		Person hong2 = new Person("홍길동","888888-8888888","대구");
		Person kim = new Person("김상중","123456-12345674","울산");
		System.out.println(hong1);	//name과 addr이 리턴
		System.out.println(hong1.equals(hong2)); //true
		System.out.println(hong1.equals(kim));	 //false

	}

}
