package qweqewqe;
import java.util.Scanner;
public class RMB                               	//�������
{
	public static boolean end1=false;
	public static boolean end2=false;
	public static boolean end3=false;
    //���ؽ��x�����Ĵ�д��ʽ�ַ���
    public static String toString(double x)
    {
        String yuan="��ǧ��ʰ��ǧ��ʰԪ�Ƿ�";
        String digit="��Ҽ��������½��ƾ�"; 
        String result=""; 
        int y=(int)(x*100);    //����������100����ȡ����������λС����
        //��y�ĵ�λ����λ��ÿ�λ��y��λת�������Ľ����ӳ��ַ���        	
        if(y%100==0){
        	end1=true;
        }
        int count=0;
        if(y/100%10==0)
        	end3=true;
        for(int j=y/1000;j>=0;j/=10){
        	if(y%10==0 && y%100==0)
        		count+=1;
        }
        if(count!=0)
        	end2=true;
        for (int i=yuan.length()-1;  y>0 && i>0;  i--, y/=10)
        {
        	if(end1){
        		result="��";
        		y/=100;
        		i-=2;
        		end1=false;
        	}
        	
        	if(end2){
        		y/=(count*100);
        		i-=(count-1);
        		end2=false;
        		result="��"+result;
        	}
        	
        	if(end3){
        		y/=10;
        		i-=1;
        		end3=false;
        	}
        	
			result = ""+digit.charAt(y % 10)+yuan.charAt(i)+result;
        }
        return result;
    }
	public static void main(String[] args)
    {
    	System.out.println("������Ǯ����");
		@SuppressWarnings("resource")
		Scanner asd = new Scanner(System.in);
		float x=asd.nextFloat();    	
    	String result=toString(x);
    	System.out.println("ת��Ϊ��д��Ľ��Ϊ");
    	System.out.println(result);
    }
}
