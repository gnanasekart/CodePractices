package JavaCollection;

public class Demo1 {

	public static void main(String[] args) {
		int[] a = {1, 2, 4, 0, 0, 7, 5};
		int[] b = {1, 0, 2, 4, 0, 5, 7};
		int[] c = {1, 7, 2, 0, 4, 5, 0};
		
		Demo1 d = new Demo1();
				System.out.println(d.solution(b));
	}
	
public boolean solution(int[] A) {
	//need to correct
	int n = 0;
	for(int s = 0; s <A.length; s++)
	{
		int a = A[s];
		int b = A[s+1];
		int ss = A[A.length];
		if((A[a + (b+1)])!= ss)
		{
			return true;
		}
	}
	return false;   
    }

public boolean solutio(int[] A)
{
int n = 0;
for(int s = 0; s <A.length-2; s++)
{
	if(A[s] == 0 && A[s+1] == 0 && A[s+2] ==7)
	{
		return true;
	}
}
return false;   
}
}