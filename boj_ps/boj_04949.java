import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        while(true){
            String str=br.readLine();
            Stack<Character> stack=new Stack<>();
            Boolean check=false;
            
            if(str.compareTo(".")==0){
                break;
            }
            
            for(int i=0;i<str.length();i++){
                char tmp=str.charAt(i);
                if(tmp=='(' || tmp=='['){
                    stack.push(tmp);
                }
                
                else if(tmp==')'){
                    if(stack.empty()){
                        check=true;
                        break;
                    }
                    else if(stack.peek()=='('){
                        stack.pop();
                    }
                    else break;
                    
                }
                else if(tmp==']'){
                    if(stack.empty()){
                        check=true;
                        break;
                    }
                    else if(stack.peek()=='['){
                        stack.pop();
                    }
                    else break;
                }
            }
            if(stack.empty() && check==false){
                System.out.println("yes");
            }
            else System.out.println("no");
        }
    }
}