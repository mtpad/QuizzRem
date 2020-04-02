package For_Test;

import Four_Choice.*;

public class HotFix0 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Four_Choice_DAO dao = new Four_Choice_DAO();
		Four_Choice_DTO dto = new Four_Choice_DTO();
		
		dto = dao.Select_quizz(2);
		
		System.out.println(dto.getC1());
		
		
	}

}
