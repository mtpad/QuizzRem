package For_Test;

import java.io.IOException;

public class Develop1_Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Develop1_MultiQuestion mq = new Develop1_MultiQuestion();
	
		//引数問の四択問題を出題させるメソッド
		mq.FourChoiceMultiQ(10);
	}
	
}

//ver2