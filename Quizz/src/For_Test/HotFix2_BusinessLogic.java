package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Four_Choice.Four_Choice_DAO;
import Four_Choice.Four_Choice_DTO;


public class HotFix2_BusinessLogic {


	//1問目をインスタンス化( 問題 ID = 4 )
	public Four_Choice_DTO getQuestion() {
		Four_Choice_DAO dao = new Four_Choice_DAO();
		Four_Choice_DTO dto = new Four_Choice_DTO();
		dto = dao.Select_quizz(4);
		return dto;
	}
		
		
	//問題表示メソッド
	public void show(Four_Choice_DTO dto) {
		System.out.println(dto.getPb());
		System.out.print("1."+dto.getC1()+"　");
		System.out.print("2."+dto.getC2()+"　");
		System.out.print("3."+dto.getC3()+"　");
		System.out.println("4."+dto.getC4()+"　");
	}

		
	//解答メソッド
	public int answer()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int InpAns = Integer.parseInt(str);
		return InpAns;
	}	
		
	//正誤判定メソッド
	public void judge(int ans) {
		switch(ans) {
		case 1 :
			System.out.println("正解");
			break;
		case 2 :
		case 3 :
		case 4 :
			System.out.println("不正解");
			break;

		}
	}
	
	

	

}
