class starpattern{
    public static void main(String[] args) {
       /*
        PRINT THE PATTERN
        
       * * * * *
       * * * * *
       * * * * *
       * * * * *
     */
        for(int i=0;i<4;i++){
           for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    
     
       /* PRINT THE PATTERN
        
      * * * * *
      *       *
      *       *
      * * * * *
     */
        for(int i=0;i<=4;i++){
           for(int j=0;j<=5;j++){
            if(i==0 || i==4 || j==0 || j==5){    
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

/*
 PRINT THE PATTERN
 * 
 * * 
 * * *
 * * * *

*/
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }

/*
 PRINT THE PATTERN
 * * * *
 * * *
 * *
 * 
*/

 for(int i=1;i<=4;i++){
    for(int j=4;j>=i;j--){
        System.out.print("*");
    }
    System.out.println(" ");
 }
/*
PRINT THE PATTERN
      *
    * * 
  * * *
* * * *  
*/

for(int i=1;i<=4;i++){
    for(int j=1;j<=4-i;j++){
        // for spaces
        System.out.print(" ");
    }
        for(int k=1;k<=i;k++){ 
            //for stars
            System.out.print("*");
        } 
System.out.println();
    }

/*
PRINT THE PATTERN
1 
1 2
1 2 3
1 2 3 4
*/

for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println("  ");
}

/*
 PRINT THE PATTERN
12345
1234
123
12
1
*/ 
int n=5;
for(int i=1;i<=n;i++){
    for (int j = 1; j<=n-i+1; j++){ 
        System.out.print(j);
    }
System.out.println();
    }

    /*
     PRINT
1
23
456
78910
     */
    
int number =1;
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print(number);
        number++;
    }
    System.out.println();
}
    /*
     PRINT
 1 
 0  1
 1  0  1
 0  1  0  1
 */    
for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
        System.out.print(" 1 ");
        }
        else{
            System.out.print(" 0 ");
        }
    }
    System.out.println();
}

}
}