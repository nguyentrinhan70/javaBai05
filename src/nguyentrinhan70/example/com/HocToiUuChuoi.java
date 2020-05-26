package nguyentrinhan70.example.com;

public class HocToiUuChuoi {

	public static void main(String[] args) {

		String s = "   Nguyen      Tri    Nhan     ";
		System.out.println(s);
		String []arr = s.split(" ");
		String chuoiToiUu="";
		for(String tu: arr) {
			if(tu.trim().length()!=0) {
				chuoiToiUu +=tu + " ";
			}
			chuoiToiUu.trim();
		}
		System.out.println("Chuỗi tối ưu là: "+chuoiToiUu);
	}

}
