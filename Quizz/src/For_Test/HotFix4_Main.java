package For_Test;

import java.io.IOException;

import Four_Choice.Four_Choice_DTO;

public class HotFix4_Main {

	public static void main(String[] args) throws IOException {


		HotFix4_BusinessLogic bl = new HotFix4_BusinessLogic();
		
		//問題を取り込む
		Four_Choice_DTO dto = new Four_Choice_DTO();
		dto = bl.getQuestion(3);
		
		//問題を表示させるメソッドを取り込む
		//同時にシャッフルした後の選択肢を受け取る（正誤判定メソッド使うため）
		String[] resp = bl.show(dto);
		
		//解答を受け取る
		int ans = bl.answer();
		
		//正誤判定
		bl.judge(ans,resp,dto);

	}

}
