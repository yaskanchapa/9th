package day9;

import java.util.ArrayList;
import java.util.List;

public class MainMethod3 {

	public static void main(String[] args) {
		List<BoardBean> boardBeanList = new ArrayList<BoardBean>();

		BoardBean boardbean1 = new BoardBean();

		boardbean1.setContent("중고판매1");
		boardbean1.setDate("9월4일1");
		boardbean1.setDelFlag(151);
		boardbean1.setHit(881);
		boardbean1.setTitle("동유모1");
		boardbean1.setUser("김태환1");

		BoardBean boardbean2 = new BoardBean();

		boardbean2.setContent("중고판매2");
		boardbean2.setDate("9월4일2");
		boardbean2.setDelFlag(152);
		boardbean2.setHit(882);
		boardbean2.setTitle("동유모2");
		boardbean2.setUser("김태환2");

		BoardBean boardbean3 = new BoardBean();

		boardbean3.setContent("중고판매3");
		boardbean3.setDate("9월4일3");
		boardbean3.setDelFlag(153);
		boardbean3.setHit(883);
		boardbean3.setTitle("동유모3");
		boardbean3.setUser("김태환3");

		boardBeanList.add(boardbean1);
		boardBeanList.add(boardbean2);
		boardBeanList.add(boardbean3);

		for(BoardBean boardbean : boardBeanList) {
			System.out.println(boardbean.getContent());
			System.out.println(boardbean.getDate());
			System.out.println(boardbean.getDelFlag());
			System.out.println(boardbean.getHit());
			System.out.println(boardbean.getTitle());
			System.out.println(boardbean.getUser());
		}
	}

}
