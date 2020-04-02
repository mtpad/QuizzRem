package For_Test;

import java.io.IOException;

import Four_Choice.Four_Choice_DTO;

public class HotFix2_Main {

	public static void main(String[] args) throws IOException {


		HotFix2_BusinessLogic bl = new HotFix2_BusinessLogic();
		
		//問題を取り込む
		Four_Choice_DTO dto = new Four_Choice_DTO();
		dto = bl.getQuestion();
		
		//問題を表示させるメソッドを取り込む
		bl.show(dto);
		
		//解答を受け取る
		int ans = bl.answer();
		
		//正誤判定
		bl.judge(ans);

	}

}
