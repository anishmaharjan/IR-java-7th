public class Boolean {
	public static void main(String[] args) {
		String d[] = {"english tutorial and fast track","book a semantic analysis","tearing latent semantic indexing","advance in structure and semantic indexing","analysis of latent structure"};
		//String[][] arrayD = new String[d.length][d.length];
		boolean adv[] = new boolean[5];
		boolean stu[] = new boolean[5];
		boolean ana[] = {true,true,true,true,true};//new boolean[5];
		boolean ana2[] = new boolean[5];
		boolean and[] = new boolean[5];
		
		//String query1 = "advance";
		//String query2 = "structure";

		/*String d2 = "";
		String d3 = ;
		String d4 = ;
		String d5 = ;*/

		String arrayD1[] = d[0].split(" ");
		String arrayD2[] = d[1].split(" ");
		String arrayD3[] = d[2].split(" ");
		String arrayD4[] = d[3].split(" ");
		String arrayD5[] = d[4].split(" ");


		for(int i=0; i<arrayD1.length; i++)
		{
			if(arrayD1[i].equalsIgnoreCase("advance"))
			{
				adv[0] = true;
			}
			if(arrayD1[i].equalsIgnoreCase("structure"))
			{
				stu[0] = true;
			}
			if(arrayD1[i].equalsIgnoreCase("analysis"))
			{
				ana[0] = false;
			}
		}
		for(int i=0; i<arrayD2.length; i++)
		{
			if(arrayD2[i].equalsIgnoreCase("advance"))
			{
				adv[1] = true;
			}
			if(arrayD2[i].equalsIgnoreCase("structure"))
			{
				stu[1] = true;
			}
			if(arrayD2[i].equalsIgnoreCase("analysis"))
			{
				ana[1] = false;
			}
			
		}
		for(int i=0; i<arrayD3.length; i++)
		{
			if(arrayD3[i].equalsIgnoreCase("advance"))
			{
				adv[2] = true;
			}
			if(arrayD3[i].equalsIgnoreCase("structure"))
			{
				stu[2] = true;
			}
			if(arrayD3[i].equalsIgnoreCase("analysis"))
			{
				ana[2] = false;
			}
		}
		for(int i=0; i<arrayD4.length; i++)
		{
			if(arrayD4[i].equalsIgnoreCase("advance"))
			{
				adv[3] = true;
			}
			if(arrayD4[i].equalsIgnoreCase("structure"))
			{
				stu[3] = true;
			}
			if(arrayD4[i].equalsIgnoreCase("analysis"))
			{
				ana[3] = false;
			}
		}
		for(int i=0; i<arrayD5.length; i++)
		{
			if(arrayD5[i].equalsIgnoreCase("advance"))
			{
				adv[4] = true;
			}
			if(arrayD5[i].equalsIgnoreCase("structure"))
			{
				stu[4] = true;
			}
			if(arrayD5[i].equalsIgnoreCase("analysis"))
			{
				ana[4] = false;
			}
		}
		//printing
		for(int i=0; i<d.length; i++)
		{
			System.out.print("  / " + adv[i]);
		}
		System.out.println(" ");
		for(int i=0; i<d.length; i++)
		{
			System.out.print("  / "+ stu[i]);
		}
		System.out.println(" ");
		
		
		//process
		for(int i=0; i<adv.length; i++)
		{
			and[i] = adv[i] && stu[i];
			
		}
		
		for(int i=0; i<adv.length; i++)
		{
			ana2[i] = and[i] && ana[i];
		}
		System.out.println(" ");
		
		for(int i=0; i<d.length; i++)
		{
			System.out.print("  / "+ and[i]);
		}
		System.out.println(" ");
		for(int i=0; i<d.length; i++)
		{
			System.out.print("  / "+ ana[i]);
		}
		
		
		System.out.println(" ");
		for(int i=0; i<d.length; i++)
		{
			System.out.print("  | "+ ana2[i]);
			
		}
		System.out.println(" ");
		for(int i=0; i<d.length; i++)
		{
			if(ana2[i] == true)
			{
				System.out.println(d[i]);
			}
			
		}
		
		
		


	}
}
