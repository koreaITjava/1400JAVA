package Ch15Updowncasting;

class Computer{
	//-SN : String; //SerialNo
	private String SN;
	//-CPUSpec : String;
	private String CPUSpec;
	//-RAMSpec : String;
	private String RAMSpec;
	//-DISKSpec : String;
	private String DISKSpec;
	//+PowerOn() : void -> "전원을 켭니다"가 출력
	public void PowerOn() {System.out.println(SN + "전원을 켭니다.");}
	//+PowerOff() : void -> "전원을 끕니다"가 출력
	public void PowerOff() {System.out.println(SN + "전원을 끕니다.");}
	
	//Getter and Setter 메서드 필요
	public String getSN() {
		return SN;
	}
	public void setSN(String sN) {
		SN = sN;
	}
	public String getCPUSpec() {
		return CPUSpec;
	}
	public void setCPUSpec(String cPUSpec) {
		CPUSpec = cPUSpec;
	}
	public String getRAMSpec() {
		return RAMSpec;
	}
	public void setRAMSpec(String rAMSpec) {
		RAMSpec = rAMSpec;
	}
	public String getDISKSpec() {
		return DISKSpec;
	}
	public void setDISKSpec(String dISKSpec) {
		DISKSpec = dISKSpec;
	}
	
	//모든 인자를 받는 생성자 함수를 만드세요
	
	
	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}
}

class Notebook extends Computer{
	//+battery : int;
	public int battery;
	Notebook(String SN,String CPUSpec, String RAMSpec,String DISKSpec, int battery)
	{
		super(SN,CPUSpec,RAMSpec,DISKSpec);
		this.battery=battery;
	}
	//+move() : void -> "이동합니다"가 출력, 호출시마다 배터리 -5 감소
	public void move() {
		if(battery-5<0) {
			battery = 0;
			System.out.println("배터리가 방전되어 전원이 꺼집니다.");
			PowerOff();
		}else {
			System.out.println(this.getSN()+" 노트북이 이동합니다.");
			battery-=5;
		}
		
	}
	@Override
	public String toString() {
		return "Notebook [battery=" + battery + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
	
}

class Tablet extends Computer{
	//+PencilNo : String;
	public String PencilNo;
	Tablet(String SN,String CPUSpec, String RAMSpec,String DISKSpec, String PencilNo){
		super(SN,CPUSpec,RAMSpec,DISKSpec);
		this.PencilNo = PencilNo;
	}
	//+WritePen() : void; -> "Pen으로 씁니다"가 출력
	public void WritePen() {
		System.out.println(PencilNo +"를 이용하여 씁니다.");
	}
	@Override
	public String toString() {
		return "Tablet [PencilNo=" + PencilNo + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
	
}

public class C03UpdownCastingMain {

	public static void ShowInfo(Computer ref) {
		//instanceof로 각각 연결된 객체에 맞게 Downcasting
		//전달받은 멤버의 Spec값을 출력하는 코드 작성
		if(ref instanceof Notebook)
		{
			Notebook down = (Notebook)ref;
			System.out.println(down.toString());
		}
		else if(ref instanceof Tablet) {
			Tablet down = (Tablet)ref;
			System.out.println(down.toString());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Notebook Mycom = new Notebook("1-2-3-4","I7","16G","1T",100);
						//SN, CPUSpec, RAMSpec, DISKSpec, battery
		Tablet Mytab = new Tablet("9-8-7-6","I3","8G","128G","Pen-123");
						//SN, CPUSpec, RAMSpec, DISKSpec, PencilNo
		
		ShowInfo(Mycom);
		ShowInfo(Mytab);
	}

}
