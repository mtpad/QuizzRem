package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Four_Choice.Four_Choice_DAO;
import Four_Choice.Four_Choice_DTO;


public class Develop2_BusinessLogic {
	
	public static int RightCount = 0;
	public static int WrongCount = 0;
	public static int TotalCount = 0;


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
	public String[] show(Four_Choice_DTO dto) throws InterruptedException {
		
		//問題文表示処理
		//１文字ずつ表示させる処理を書き加える
			//１文字表示して次の１文字を表示させるまでの時間をミリ秒で指定。(1000=1second)
		int millis = 20;
		
			//問題文を１文字ずつに分解する処理
		String pb = dto.getPb();
		String[] pbArray = pb.split("");
		
			//分解した問題文配列を１文字ずつ表示させる処理
		for(int i=0 ; i<pbArray.length ; i++) {
			System.out.print(pbArray[i]);
			Thread.sleep(millis);
		}
		
		//問題を表示させた後に改行して選択肢を表示させる。
		System.out.println();
		
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
			RightCount++;
		} else {
			System.out.println("不正解です。");
			WrongCount++;
		}
		
		TotalCount++;
			
	}
	
	public void Result() {
		double RightRate = (double)(this.RightCount)/(double)(this.TotalCount)*100;
		System.out.println();
		System.out.println("正解数:"+this.RightCount);
		System.out.println("不正解数:"+this.WrongCount);
		System.out.println("出題数:"+this.TotalCount);
		System.out.println("正解率:"+RightRate+"%");
	}

}
