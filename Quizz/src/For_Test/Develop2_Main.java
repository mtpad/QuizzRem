package For_Test;

import java.io.IOException;

public class Develop2_Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Develop2_BusinessLogic bl = new Develop2_BusinessLogic();
		Develop2_MultiQuestion mq = new Develop2_MultiQuestion();
	
		//引数問の四択問題を出題させるメソッド
		mq.FourChoiceMultiQ(5);
		
		//結果発表メソッド
		bl.Result();
	}
	
}

//ver2