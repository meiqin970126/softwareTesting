package jUnitTest;

public class Triangle {
	public String check(int a, int b, int c){        
        String result = "";
        if(a == b && b == c){
            result = "该三角形为等边三角形";
        }else if(a == b || a == c || b ==c){
            result = "该三角形为等腰三角形";
        }else if(a + b > c && a + c > b && b + c > a){
            result = "该三角形为不等边三角形";
        }else{
            result = "这不是一个三角形";
        }

        return result;     
    }

}
