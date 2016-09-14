
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int updateBits(int N, int M, int i, int j){
		int left = ~((1<<(j+1))-1);
	    int right = (1<<i)-1;
		int mask=left|right;
		return (mask&N)|(M<<i);
	}

}
