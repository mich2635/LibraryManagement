package com.librarymanagement;

public class ViewBooks {
	/**
	 * this function used to see department for bo0ks
	 * @return
	 */
			public static int selectDepartment()
			{
				System.out.println("ENTER THE DEPARTMENT");
				System.out.println("1.MECH");
				System.out.println("2.CIVIL");
				System.out.println("3.CSE");
				return 0;
			}
			/**
			 * this function used to see all departmental books
			 * @param choice
			 * @return
			 */
				public static int books(int choice)
				{
				
				switch(choice)
				{
				case 1:												//Mech dept books
					System.out.println("1 :SOLID MECHANICS");
					
					System.out.println("2 :FLUID MECHANICS");
					
					return 1;
					
				
				case 2:												//civil debt books
					System.out.println("3 :BRICKS");
					
					System.out.println("4 :SURVEY");
					
					return 1;
					
					
				case 3:												//cse debt books
					System.out.println("5 :DBMS");
					
					System.out.println("6 :JAVA");
					
					 return 1;
				default :
					System.out.println("ENTER THE DETAILS CORRECTLY");
				}
				return 0;
					
				}	
}
