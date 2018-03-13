
public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] array= {3,4,12,33,1,21};
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");
		}
		
		array=Ordinatore.selectionSortDecrescente(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");
		}
		array=Ordinatore.selectionSortCrescente(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");
		}
		
		String[] arrayStringhe= {"Caraviello","Botticchio","Pe","Pedersoli","Zendra"};
		System.out.println();
		for (int i = 0; i < arrayStringhe.length; i++) 
		{
			System.out.print(arrayStringhe[i]+ " ");
		}
		System.out.println();
		arrayStringhe=Ordinatore.selectionSortDecrescente(arrayStringhe);
		for (int i = 0; i < arrayStringhe.length; i++) 
		{
			System.out.print(arrayStringhe[i]+ " ");
		}
		System.out.println();
		arrayStringhe=Ordinatore.selectionSortCrescente(arrayStringhe);
		for (int i = 0; i < arrayStringhe.length; i++) 
		{
			System.out.print(arrayStringhe[i]+ " ");
		}
	}

}
