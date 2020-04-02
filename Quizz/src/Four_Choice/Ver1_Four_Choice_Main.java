package Four_Choice;

import java.io.IOException;

public class Ver1_Four_Choice_Main {

	public static void main(String[] args) throws IOException {
		
		Ver1_Four_Choice_MultiQuestion mq = new Ver1_Four_Choice_MultiQuestion();
	
		//引数問の四択問題を出題させるメソッド
		mq.FourChoiceMultiQ(10);
	}
	
}