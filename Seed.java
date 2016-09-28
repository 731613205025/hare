/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seed;

/**
 *
 * @author Student
 */
public class Seed {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
        	int x = 0,y = 0,t,x1=1;
	scanf("%d %d",&x,&y);
	t=x;
	int i;
	while(x!=0)
	{
		x1*=x%10;
	//	printf("%d",x1);
		x=x/10;
	}
	if((x1*t)==y)
		printf("seed");
	else
		printf("not seed");
return 0;
    }

    private static void printf(String not_seed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
