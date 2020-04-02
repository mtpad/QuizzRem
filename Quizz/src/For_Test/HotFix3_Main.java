package For_Test;

import java.io.IOException;

import Four_Choice.Four_Choice_DTO;

public class HotFix3_Main {

	public static void main(String[] args) throws IOException {


		HotFix3_BusinessLogic bl = new HotFix3_BusinessLogic();
		
		//問題を取り込む
		Four_Choice_DTO dto = new Four_Choice_DTO();
		dto = bl.getQuestion(3);
		
		//問題を表示させるメソッドを取り込む
		bl.show(dto);
		
		//解答を受け取る
		int ans = bl.answer();
		
		//正誤判定(HotFix3では正しく動作しません。)
		bl.judge(ans);

	}

}
