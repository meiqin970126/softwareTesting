package jUnitTest;

public class Triangle {
	public String check(int a, int b, int c){        
        String result = "";
        if(a == b && b == c){
            result = "��������Ϊ�ȱ�������";
        }else if(a == b || a == c || b ==c){
            result = "��������Ϊ����������";
        }else if(a + b > c && a + c > b && b + c > a){
            result = "��������Ϊ���ȱ�������";
        }else{
            result = "�ⲻ��һ��������";
        }

        return result;     
    }

}
