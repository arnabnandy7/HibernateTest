package Controller;

import java.util.ArrayList;

import com.model.BS.ProductBS;
import com.model.Entity.Product;

public class TestProduct {
	
	// Command Line for resolve connection string : TNSPING xe
	
	public static void ReadAllProduct()
	{
		ProductBS bs=new ProductBS();
		ArrayList<Product> al=(ArrayList<Product>)bs.ReadAll();
		for(Product p:al)
		{
			System.out.println(p.getPid()+"  "+p.getPname()+"  "+p.getPrice());
		}
	}
	public static void UpdateProduct(int pid,String pname,double price)
	{
		Product p=new Product();
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(price);
		ProductBS bs=new ProductBS();
		if(bs.update(p)==1)
		{
			System.out.println("Update successfully.....");
		}
		else
		{
			System.out.println("Sorry.......");
		}
	}
	public static void main(String[] args) {
		ProductBS bs=new ProductBS();
		
		UpdateProduct(222, "Vasu", 82300);
		
	}

}
