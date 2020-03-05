package custom.list;
@SuppressWarnings("rawtypes")
public class App extends Arraylist
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
        Arraylist<Integer> x=new Arraylist();
        x.add(10);
        x.add(5);
        x.add(6);
        x.add(7);
        x.add(3);
        x.add(6);
        x.add(7);
        x.add(5);
        x.add(4);
        x.add(4);
        x.add(17);
        x.add(15);
        x.add(16);
        System.out.println(x.get(6));
        x.remove(4);
        x.print();
    }
}
