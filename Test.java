import java.util.*;
    import java.lang.*;

public class Test {  
              static void que1(){
                int count=0,count1=0,count2=0;
                System.out.println("please enter your no");
                Scanner sc = new Scanner(System.in);
               int n=sc.nextInt();
               
                //ArrayList<String> arr=new ArrayList<String>(20);
                int arrc[]=new int[n];
                String[]s=new String[arrc.length];
                for( int i=1;i<=n;i++){
                   
                    arrc[i-1]=i; 
                 }
                     

             for( int i=0;i<arrc.length;i++){
                   
                s[i]=String.valueOf(arrc[i]); 
             }
for(String j:s){
    if(((j.length())%2)!=0){
                  count+=j.length()*2;

    }
    else{
if(((j.length())%4)!=0){
count1+=j.length()*3;

}else{
    count2+=j.length()*4;

}

    } 
} 
int x=count+count1+count2;
 
int a=0,b=0;
while(true){
    a+=x%10;
    x=x/10;
    if(x==0){
                if(a>=10){
                    x=a;
                    a=0;
                    continue;

                }
                else{ System.out.println("finel print "+a);
            break;  }

        
    } 
}
    
              }
             
              static void que2(){
                System.out.println("plesr enter your string");
                Scanner sc = new Scanner(System.in);
      
                        String a=sc.nextLine(); 
            for(int i =0;i<a.length();i++){ 
              if(a.charAt(i)==' '){
                  System.out.print("");
              }
              else{
                  System.out.print(a.charAt(i));
              }
            }
           
                 } 
      
                 static void que3(){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("please enter your ticket no ");
                    int a=sc.nextInt();

                    
                    int count=0,count1=0,count2=0;
                   int b[]=new int[a];
                    for(int i=0;i<b.length;i++){
                        System.out.println("please enter age ");
                         b[i]=sc.nextInt();

                    }
for(int j:b){
    if(j<3){
        count++;
    }
    else if(j>2&&j<12){
        count1+=100;

    }
    else{
count2+=150;
    }
}

int totel = count1+count2;
System.out.println("your totel bil is = "+totel+"rs"+"\n"+"your "+count+" child free to enjoy movies");

                  } 
    public static void main(String[] args) {
        System.out.println("please enter que1 for 1 ,que2 for 2 and que3 for 3");
        Scanner sc = new Scanner (System.in);
        int m=sc.nextInt();
        if(m==1){
que1();
        }
else if(m==2){
que2();
}else if(m==3){
que3();
}
        
        
    }
    
}
