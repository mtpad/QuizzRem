package Four_Choice;

import java.io.IOException;;

public class Four_Choice_Main_Proto {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		//出題数をコマンド引数にする
		int TotalQ = Integer.parseInt(args[0]);
		
		Four_Choice_Sel_BusinessLogic_Proto fcsbl = new Four_Choice_Sel_BusinessLogic_Proto();
		fcsbl.Question(TotalQ);
	}

}
