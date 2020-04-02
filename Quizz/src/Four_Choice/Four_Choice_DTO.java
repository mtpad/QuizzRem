package Four_Choice;

public class Four_Choice_DTO {

	private int 	id;
	private String pb;
	private String ans;
	private String[] cho = new String[4];
	
	
	//getter/setter(id)
	public int 	getID()				{	return id;		}
	public void	setID(int id)		{	this.id = id;	}
	
	//getter/setter(problem)
	public String	getPb()				{	return pb;		}
	public void	setPb(String pb)	{	this.pb = pb;	}
	
	//getter/setter(answer)
	public String	getAns()			{	return ans;		}
	public void	setAns(String ans)	{	this.ans = ans;	}
	
	//getter/setter(choice1)
	public String	getC1()				{	return cho[0];	}
	public void	setC1(String c1)	{	cho[0] = c1;	}
	
	//getter/setter(choice2)
	public String	getC2()				{	return cho[1];	}
	public void	setC2(String c2)	{	cho[1] = c2;	}
	
	//getter/setter(choice3)
	public String	getC3()				{	return cho[2];	}
	public void	setC3(String c3)	{	cho[2] = c3;	}

	//getter/setter(choice4)
	public String	getC4()				{	return cho[3];	}
	public void	setC4(String c4)	{	cho[3] = c4;	}

}
