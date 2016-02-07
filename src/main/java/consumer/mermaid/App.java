package consumer.mermaid;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Test t = new Test();

        t.show();

        Test tt = new Test();

        tt.show();

    }


    public boolean test(int i){

    	if(i%2 ==0){
    		return true;
    	}else{
    		return false;
    	}

    }
}
