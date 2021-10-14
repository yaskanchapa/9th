package day9;

public class MainMethod2 {

	public static void main(String[] args) {
		UserBean1 userBean1 = new UserBean1();

		userBean1.setId("admin");
		userBean1.setPassword("admin132422");
		userBean1.setName("고길동");
		userBean1.setAge(55);
		userBean1.setAddress("서울시");
		userBean1.setMarried(true);

		System.out.println(userBean1.getId());
		System.out.println(userBean1.getPassword());
		System.out.println(userBean1.getName());
		System.out.println(userBean1.getAge());
		System.out.println(userBean1.getAddress());
		System.out.println(userBean1.isMarried());

		BoardBean boardbean = new BoardBean();

		boardbean.setContent("중고판매");
		boardbean.setDate("9월4일");
		boardbean.setDelFlag(15);
		boardbean.setHit(88);
		boardbean.setTitle("동유모");
		boardbean.setUser("김태환");

		System.out.println(boardbean.getContent());
		System.out.println(boardbean.getDate());
		System.out.println(boardbean.getDelFlag());
		System.out.println(boardbean.getHit());
		System.out.println(boardbean.getTitle());
		System.out.println(boardbean.getUser());
	}

}
