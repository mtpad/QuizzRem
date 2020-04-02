package Four_Choice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Four_Choice_Sel_BusinessLogic_Proto {
	
	private int totalCollect = 0;
	
	
	//選択肢をシャッフルするメソッド（仮引数は選択肢をシャッフルさせたいDTO
	public Four_Choice_DTO ShaffleChoice(Four_Choice_DTO normalDto) {
		

		//通常の選択肢を抽出
		String[] choice = new String[4];
		choice[0] = normalDto.getC1();
		choice[1] = normalDto.getC2();
		choice[2] = normalDto.getC3();
		choice[3] = normalDto.getC4();
		
		
		//choice配列をシャッフルする処理
		for(int i=0 ; i<choice.length ; i++) {
			String hako;
			int random = (int)(Math.random()*4);
			hako = choice[0];
			choice[random]	= choice[i];
			choice[i]		= hako;
		}
		
		
		//選択肢をシャッフルした後の問題をいれる箱をつくる。
		Four_Choice_DTO shaffledDto = new Four_Choice_DTO();
		
		
		//シャッフルしたchoice配列をchaffledDtoに入れ込む処理
		shaffledDto.setC1(choice[0]);
		shaffledDto.setC2(choice[1]);
		shaffledDto.setC3(choice[2]);
		shaffledDto.setC4(choice[3]);
		
		
		return shaffledDto;
	}
	
	
	
	//正誤判定をするメソッド（仮引数はユーザー解答番号と、問題のDTO
	public void judgement(int res,Four_Choice_DTO dto) {
		
		//正解文をanswerに代入
		String answer = dto.getAns();
		
		//解答番号に応じて正誤判定
		switch(res) {
		case 1 :
			if(answer.contentEquals(dto.getC1())) {
				System.out.println("正解です。");
				totalCollect++;
			}else {
				System.out.println("不正解です。");
			}
			break;
		case 2 :
			if(answer.contentEquals(dto.getC2())) {
				System.out.println("正解です。");
				totalCollect++;
			}else {
				System.out.println("不正解です。");
			}
			break;
		case 3 :
			if(answer.contentEquals(dto.getC3())) {
				System.out.println("正解です。");
				totalCollect++;
			}else {
				System.out.println("不正解です。");
			}
			break;
		case 4 :
			if(answer.contentEquals(dto.getC4())) {
				System.out.println("正解です。");
				totalCollect++;
			}else {
				System.out.println("不正解です。");
			}
			break;
		}
	}

	
	
	//問題文を表示させるメソッド（仮引数は表示させたいDTOと、第何問目か。
	public void showDTO(Four_Choice_DTO dto,int No) {
		
		System.out.println("第"+No+"問目");
		System.out.println(dto.getPb());
		System.out.print("1:"+dto.getC1()+"　");
		System.out.print("2:"+dto.getC2()+"　");
		System.out.print("3:"+dto.getC3()+"　");
		System.out.print("4:"+dto.getC4());

	}
	
	
	
	
	//出題させるメソッド(仮引数は出題数
	public void Question(int TotalQuestion) throws IOException{
		
		//出題数分の１～１０までの数を重複なしで生成。
		//困難なため、１～１０をシャッフルして、前から出題数分だけ利用する。
		int[] id = new int[10];
		for(int i=0 ;i<id.length ;i++) {
			int hako;
			int random 	=	(int)(Math.random()*10);
			hako 		=	id[i];
			id[i]		=	id[random];
			id[random]	=	hako;
		}
		
		//DAOのインスタンス化
		Four_Choice_DAO dao = new Four_Choice_DAO();
		
		
		//指定された数だけ出題を繰り返す。
		for(int i=0 ; i<TotalQuestion ;i++) {
			
			//出題するDTOを呼び出す。
			Four_Choice_DTO dto = dao.Select_quizz(id[i]);
			
			//選択肢をシャッフルするメソッド
			this.ShaffleChoice(dto);
			
			//問題文と選択肢を表示させるメソッド
			this.showDTO(dto, i);
			
			//ユーザーに解答させる処理
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			//正誤判定させるメソッド
			this.judgement(res, dto);
		}
		
		//結果発表
		System.out.println("総出題数は"+TotalQuestion+"問");
		System.out.println("正解数は"+totalCollect+"でした。");
	}
}
