package polymorphism;
/**
 * @file_name : RoleMain.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 30.
 * @story     : 객체지향 특성을 설명하는 간단한 예제******중요
 */
public class RoleMain {
	/**
	 * 은닉화 : 객체의 속성과 행위를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉한다
	 * 상속 : 새로운 클래그사 기존의 클래스의 자료와 연산을 이용할 수 있게 하는 기능
	 * 추상화 : 불필요한 정보는 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단히 만드는 것
	 * 다형성 : 부모 객체에서 자식 클래스들의 인스턴스를 담는 표현방식
	 * -출처 : 위키-
	 */
	public static void main(String[] args) {
		//다형성, 은닉화, 
		Human[] roles = new Husband[3];
		roles[0] = new Husband();
		roles[1] = new Employee();
		roles[2] = new Father();
		//Human[] roles = new Human[3];//배열은 객체
	//	Human[] roles = {husband, emp, father};
		//int[] arr = new int[2];
		//Human h = new Human(); //인터페이스는 생성자가 없다. = 객체를 만들수 없다
		
		
		
		for (int i = 0; i < roles.length; i++) {
			roles[i].role();
		}
		
	}

}
interface Human{
	public void role(); //추상화
	
}
class Man implements Human{
	private String name; // 은닉화
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void role() {
		System.out.println("남자 역할");
		
	}
	
}
class Husband extends Man{ //상속
	@Override
	public void role() {
	System.out.println("남편 역할");
	}
	public void husbandWorry(){
		System.out.println("남편의 고민");
	}
	
}
class Employee extends Man{
	@Override
	public void role() {
		System.out.println("직원 역할");
	}
	public void EmployeeWorry(){
		System.out.println("직장인의 고민");
 }
}
class Father extends Man{
	@Override
	public void role() {
		System.out.println("아버지의 역할");
	}
	public void fatherWorry(){
		System.out.println("아버지의 고민");
 }
}







