package JavaCollection;

public class Employee_Comparable implements Comparable {

	String name;
	int eid;
	Employee_Comparable(int eid, String name)
	{
	this.name = name;
	this.eid = eid;
	}

	public String toString()
	{
	return name+"--"+eid;
	}

	public int compareTo(Object obj) {
		//from construtor
		int eid1 = this.eid;
		Employee_Comparable e = (Employee_Comparable)obj;
		//from argument
		int eid2 = e.eid;
		if(eid1 < eid2)
		{
		return -1;
		}else if(eid1 > eid2)
		{
		return +1;
		}else
		return 0;
	}
}
