package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	private ArrayList<Integer> arr= new ArrayList<Integer>();
	public void input() {
		arr.add(3);
		arr.add(-22);
		arr.add(5);
		arr.add(9);
		arr.add(-6);
		arr.add(3);
		arr.add(3);
		arr.add(6);
		arr.add(8);
	}
@Override
	public String toString() {
		return arr.toString();
	}
	public int sum() {
		int s=0;
		for(int i=0;i<arr.size();i++)
			s=s+arr.get(i);
		return s;
	}
	//thiet lap lai cac phan tu o vi tri chan =10
	public void set() {
		for(int i=0;i<arr.size();i=i+2)
			arr.set(i, 10);
	}
	//viet ham kiem tra snt
	public boolean isPrime(int x) {
		if(x<2) return false;
			for(int i=2;i<=Math.sqrt(x);i++)
				if(x%i==0)
					return false;
						return true;
	}
	//tinh trung binh cong so nguyen to
	public void tbc() {
		double s=0,tbc=0;
		int dem=0;
		for(int i=0;i<arr.size();i++) 
			if(isPrime(arr.get(i))==true) {
				dem++;
				s=s+arr.get(i);
				
			}
		
		tbc=1.0*s/dem;
		System.out.println(tbc);
	}
	// xoa cac gia tri am 
	public void removeNegative () {
		for(int i = 0;i<arr.size();i++) {
			if(arr.get(i)<0)
				arr.remove(i);
		}
	}
	//xao cac phan tu trung nhau (giu lai mot phan tu) trong arrayList
	public void remove2() {
		for(int i =0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) 
				if(arr.get(i)==arr.get(j)) {
					arr.remove(j);
					i--;
					}
			}
		}
	//sap xep 
	public void sort() {
		for(int i = 0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)<arr.get(j)) {
					int k= arr.get(i);
					arr.set(i,arr.get(j));
					arr.set(j,k);
				}
		}
	}
}
	//tong hai so lon nhat 
	public int summax() {
		int summax=arr.get(0)+arr.get(1);
		for (int i=1;i<arr.size()-1;i++) {
			if(summax <arr.get(i)+arr.get(i+1))
				summax =arr.get(i)+arr.get(i+1);
		}
		return summax;
	}
	//so chan ve truoc sole ve sau
	public void evenOdd() {
		for(int i=0;i<arr.size();i++) {
		for(int j=i+1;j<arr.size();j++) 
			if(arr.get(j)%2==0) {
				int k= arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,k);
			}
		}	
}
	//hai so lon nhat 
	public int summax2() {
		int max=arr.get(0),min=arr.get(0),p=0;
		for(int i=0;i<arr.size();i++) {
			if(max<arr.get(i)) {
				max=arr.get(i);
				p=i;
			}
			if(min>arr.get(i)) {
				min=arr.get(i);
			}
		}
		int h=min;
		for(int i=0;i<arr.size();i++) {
			if(h<arr.get(i)&&i!=p)
				h=arr.get(i);
		}
		return max+h;
		}
	// dao nguoc vi tri cac phan tu 
	public void daonguoc() {
		Collections.reverse(arr);
		System.out.println(arr);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		System.out.println(t.toString());
		System.out.println(t.sum());
		t.tbc();
		System.out.println(t.summax());
		t.removeNegative();
		System.out.println(t.toString());
		t.sort();
		System.out.println(t.toString());
		t.remove2();
		System.out.println(t.toString());
		t.evenOdd();
		System.out.println(t.toString());
		System.out.println(t.summax2());
		t.daonguoc();
	}
}
	
