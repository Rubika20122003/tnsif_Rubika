package com.tnsif.day4.Modifiers;

public class Base {

	
		int varDefault=10;
		public int varPublic=20;
		private int varPrivate=30;
		protected int varProtected=40;
		void methodDefault()
		{
			System.out.println("Default access Base class");
			System.out.println("Default Variable : "+varDefault);
		}
		
		public void methodPublic()
		{
			System.out.println("Public access Base class");
			System.out.println("Public Variable : "+varPublic);
		}
		
		private void methodPrivate()
		{
			System.out.println("Private access Base class");
			System.out.println("Private Variable : "+varPrivate);
		}
		
		protected void methodProtected()
		{
			System.out.println("Protected access Base class");
			System.out.println("Protected Variable : "+varProtected);
		}
	
	public static void main(String[]args) {
		
	Base base=new Base();
	base.methodDefault();
	base.methodProtected();
	base.methodPublic();
	System.out.println("Default variable:"+base.varDefault);
	System.out.println("Default variable:"+base.varProtected);
	System.out.println("Default variable:"+base.varPublic);
	}}


