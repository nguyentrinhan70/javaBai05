package nguyentrinhan70.example.com;

import java.util.Arrays;

public class HocMangMotChieu {

	public static void main(String[] args) {

		int a[] = new int [5];
		a[0]=7;
		a[1]=5;
		a[2]=3;
		a[3]=9;
		a[4]=0;
		System.out.println("Kết quả mảng của bạn là:");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("Kết quả mảng được sắp xếp là:");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		//Xuất ra các số nguyên tố
		System.out.println();
		System.out.println("Kết quả mảng của bạn là số nguyên tố:");
		for(int i=0; i<a.length;i++) {
			int dem=0;
			for(int j=1;j<=a[i];j++)
				if(a[i]%j==0)
				{
					dem++;
				}
			if(dem==2)
				System.out.print(a[i]+"\t");
		}
	}

}
