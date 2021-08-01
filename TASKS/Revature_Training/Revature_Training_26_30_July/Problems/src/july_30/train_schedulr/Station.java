package july_30.train_schedulr;

public class Station {
	protected String stnCode;
	protected String name;
	private double deptime;
	private double arrtime;
	protected int srlNo=0;
	public Station(String stnCode, String name) {
		this.stnCode = stnCode;
		this.name = name;
		this.srlNo++;
	}
	public Station(String stnCode, String name,double dt,double at) {
		this(stnCode,name); //Constructor Chaining
		this.deptime=dt;
		this.arrtime=at;
	}
	
	public String showDetails()
	{
		return this.stnCode+"     "+this.name+"   "+this.arrtime+"   "+this.deptime;
	}
}

class StartingStn extends Station{
	private double time;
	public StartingStn(String stnCode, String name,double t)
	{
		super(stnCode,name);
		this.time=t;
		this.srlNo++;
	}
	public String showDetails(){
		return this.stnCode+"     "+this.name+"    "+this.time;
	}
}

class EndStn extends Station{
	private double time;
	public EndStn(String stnCode, String name,double t)
	{
		super(stnCode,name);
		this.time=t;
		this.srlNo++;
	}
	public String showDetails() {
		return this.stnCode+"     "+this.name+"    "+this.time;
	}
}
