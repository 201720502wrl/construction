package q;
import java.util.Random;
public class Qeution {

	public static void main(String[] args) {
		int[] left=new int [51];
		int[] middle=new int [51];
		int[] right=new int [51];//chars�����洢�������0���������1����ӷ�
		printHeader();
		generateEquations(left,middle,right);
		printExercise(left,middle,right);
		printAnswer(left,middle,right);

	}
	static void  printHeader() {
		System.out.println("�����ʮ��100���ڵļӼ�����ʽ��ϰ�⣺");
    }
	static void generateEquations(int[] left,int[] middle,int[] right) {
		
		Random r=new Random();
		for(int i=1;i<=50;i++) {
			left[i]=r.nextInt(101);
			middle[i]=r.nextInt(101);
			right[i]=r.nextInt(2);
			if(right[i]==0) {
				if(left[i]-middle[i]<0){
					i--;
					continue;
				}		
			}
			else {
				if(left[i]+middle[i]>100) {
					i--;
					continue;
				}
				
			}
			int flag=0;
			for(int j=i-1;j>=0;j--) {
				if(left[i]==left[j]&&middle[i]==middle[j]&&right[i]==right[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				i--;
				continue;
			}
		}
	}
	static void printExercise(int[] left,int[] middle,int[] right) {
		for(int i=1;i<=50;i++) {
			if(right[i]==0) {
				System.out.print(""+left[i]+"-"+middle[i]+"   ");
			}
			else{
				System.out.print(""+left[i]+"+"+middle[i]+"   ");
			}
			if(i%5==0) {
				System.out.println("");
			}
		}
	}
	static void printAnswer(int[] left,int[] middle,int[] right) {
		System.out.println("\n50����Ĵ�");
		for(int i=1;i<=50;i++) {
			if(right[i]==0) {
				System.out.print(left[i]-middle[i]+"  ");
			}
			else{
				System.out.print(left[i]+middle[i]+"  ");
			}
			if(i%5==0) {
				System.out.println("");
			}
		}
	}
}