package day9;

//	빈용의 객체를 생성한 것
public class UserBean1 {

	private String id;
	private String password;
	private String name;
	private String address;
	private int age;
//	boolean 이름 정할 때 조심
	private boolean isMarried;
//	메소드 밖에서 이렇게 만들어 진 것은 변수로 사용 할 수 없다.
//	이런걸 필드라고 하고 의미는 단순히 선언이라고 여기면 된다. 선언해두고 마우스 오른쪽 소스->게터세터 자동생성하기쉬움
//	get 값을 보내는 것 set 값을 담아두는 것
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	get set 이름이 booolean은 좀 특이함
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}


}
