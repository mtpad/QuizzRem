package For_Test;

import java.io.IOException;

public class HotFix5_Main {

	public static void main(String[] args) throws IOException {
		
		HotFix5_MultiQuestion mq = new HotFix5_MultiQuestion();
	
		//引数問の四択問題を出題させるメソッド
		mq.FourChoiceMultiQ(10);
	}
	
}

//とりあえず、形としてはこれで完成