/*题目描述
请从字符串中找出至少重复一次的子字符串的最大长度
输入描述:
字符串，长度不超过1000
输出描述:
重复子串的长度，不存在输出0
示例1
输入

复制
ababcdabcefsgg
输出

复制
3
说明

abc为重复的最大子串，长度为3*/

package lianxi0503;

import java.util.Scanner;
public class  teat0503{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=0;
        char[]chars=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(chars[i]==chars[j]){
                    int temp=1;
                    for(int k=j+1;k<s.length();k++){
                        if(chars[k]!=chars[k+i-j]){//判断第j位之后的字符是否和第i位之后继续相同
                            break;
                        }
                        else{
                            temp++;
                        }
                    }
                    len=Math.max(len,temp);
                }
            }
        }
        System.out.println(len);
    }

}
