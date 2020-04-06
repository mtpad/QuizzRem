



package For_Test;

import java.io.IOException;
import Four_Choice.Four_Choice_DTO;

public class Develop2_MultiQuestion {
	
	//総出題数をクラス変数で作成
	public static int TotalQuestion = 1;

	
	//四択問題を引数問　出題するメソッド
	public void FourChoiceMultiQ(int numOfQue) throws IOException, InterruptedException {

		//重複なしで、１～１０のなかの整数の乱数を出題数分受け取る処理。
		//１～１０をシャッフルして前から出題数分受け取る
		//のちに１～１０ではなく、トータル問題数のなかから乱数を発生させる処理にアップデート予定
		int[] ran = new int[10];
		for(int i=0;i<ran.length;i++) {
			ran[i] = i;
		}
		for(int i=0 ; i<ran.length ; i++) {
			int hako;
			int random = (int)(Math.random()*10);
			
			hako 		= ran[i];
			ran[i]		= ran[random];
			ran[random] = hako;
		}
		
		for(int i=0 ; i<numOfQue ; i++) {
			Develop2_BusinessLogic bl = new Develop2_BusinessLogic();
		
			//問題を取り込む
			Four_Choice_DTO dto = new Four_Choice_DTO();
			dto = bl.getQuestion(ran[i]+1);
		
			//クラス変数から出題数を引っ張ってくる
			System.out.println("第"+TotalQuestion+"問");
			
			//第〇問と出した後の問題文が表示されるまでの待機時間
			Thread.sleep(700);
			
			
			//問題を表示させるメソッドを取り込む
			//同時にシャッフルした後の選択肢を受け取る（正誤判定メソッド使うため）
			String[] resp = bl.show(dto);
		
			//解答を受け取る
			int ans = bl.answer();
		
			//正誤判定
			bl.judge(ans,resp,dto);

			//問題間の待機時間。
			Thread.sleep(1000);
			
			//改行
			System.out.println();
			
			//総出題数をインクリメント
			TotalQuestion++;
		}
		
		
	}

}
