
public class asd {
	public static void main(String[] args){
		int n=4;
		int jz[][]=new int[n][n];
		int num=1;
		System.out.println("˳ʱ�뷽��Ϊ��");
		//˳ʱ��
		for(int i=0;i<n/2+1;i++)
		{
			//�ϱ�
			for(int j=i;j<=n-i-1;j++){
				jz[i][j]=num++;
			}
			//�ұ�
			for(int j=i+1;j<=n-i-1;j++){
				jz[j][n-i-1]=num++;
			}
			//�±�
			for(int j=n-i-2;j>=i;j--){
				jz[n-i-1][j]=num++;
			}
			//���
			for(int j=n-i-2;j>=i+1;j--){
				jz[j][i]=num++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(jz[i][j]+"\t");
			}
			System.out.println();
		}
		int num2=1;
		System.out.println("��ʱ�뷽��Ϊ��");
		for(int i=0;i<n/2+1;i++){
			//���
			for(int j=i;j<=n-i-1;j++){
				jz[j][i]=num2++;
			}
			//�±�
			for(int j=i+1;j<=n-i-1;j++){
				jz[n-i-1][j]=num2++;
			}
			//�ұ�
			for(int j=n-i-2;j>=i;j--){
				jz[j][n-i-1]=num2++;
			}
			//�ϱ�
			for(int j=n-i-2;j>=i+1;j--){
				jz[i][j]=num2++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(jz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
