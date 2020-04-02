package Four_Choice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Four_Choice.Four_Choice_DAO;
import Four_Choice.Four_Choice_DTO;


public class Ver1_Four_Choice_BusinessLogic {


	//1問目をインスタンス化( 問題 ID  )
	public Four_Choice_DTO getQuestion(int QID) {
		Four_Choice_DAO dao = new Four_Choice_DAO();
		Four_Choice_DTO dto = new Four_Choice_DTO();
		dto = dao.Select_quizz(QID);
		return dto;
	}
		
		
	//問題表示メソッド
	//問題文をシャッフルする処理も追加（HotFix3
	//正誤判定のため、戻り値としてシャッフル後の選択肢を返す。(HotFix4
	public String[] show(Four_Choice_DTO dto) {
		System.out.println(dto.getPb());
		
		//問題文を選択肢配列に入れる。
		String[] choice = new String[4];
		choice[0] = dto.getC1();
		choice[1] = dto.getC2();
		choice[2] = dto.getC3();
		choice[3] = dto.getC4();
		
		//選択肢をシャッフルする。
		for(int i=0 ; i<choice.length;i++) {
			String hako;
			
			int rand 		= (int)(Math.random()*4);
			hako 			= choice[i];
			choice[i] 		= choice[rand];
			choice[rand]	= hako;
		}
		
		//シャッフルした選択肢を表示させる。
		for(int i=0 ; i<choice.length ; i++) {
			System.out.print(i+1+"."+choice[i]+"　");
		}
		
		System.out.print("\n");

		return choice;
	}

		
	//解答メソッド(答案番号を受け取るメソッド)
	public int answer()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int InpAns = Integer.parseInt(str);
		return InpAns;
	}	
		
	//正誤判定メソッド
	//引数（解答番号、選択肢、正解）
	public void judge(int ans,String[] choice,Four_Choice_DTO dto) {
		//正解
		String rightAnswer = dto.getAns();
		
		//答案番号(response answer
		String respAnswer = choice[ans-1];
		
		if(respAnswer.contentEquals(rightAnswer)) {
			System.out.println("正解です。");
		} else {
			System.out.println("不正解です。");
		}
			
	}

}
