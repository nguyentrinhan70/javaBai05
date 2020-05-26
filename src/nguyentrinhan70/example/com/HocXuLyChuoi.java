package nguyentrinhan70.example.com;

public class HocXuLyChuoi {

	public static void main(String[] args) {

		String st= "Nguyen Tri Nhan 1970";
		System.out.println("Chiều dài chuỗi là:"+ st.length());
		//Đếm xem chuỗi bao nhiêu in hoa, thường và số.
		int soInHoa=0;
		int soInThuong=0;
		int soChuSo=0;
		char []arr= st.toCharArray();
		for(int i =0; i<arr.length;i++) {
			char c = arr[i];
			if(Character.isUpperCase(c)) {
				soInHoa++;
			}
			if(Character.isLowerCase(c)) {
				soInThuong++;
			}
			if(Character.isDigit(c)) {
				soChuSo++;
			}
		}
		System.out.println("Chuỗi có: "+soInHoa+" chữ in hoa");
		System.out.println("Chuỗi có: "+soInThuong+" chữ in thường");
		System.out.println("Chuỗi có: "+soChuSo+" chữ số");
		
		String bh1="D:/music/nhactrinh/riengmotgoctroi.mp3";
		String bh2 ="D:\\music\\nhactrinh\\riengmotgoctroi.mp3";
		int vtriCuoi =bh1.lastIndexOf("/");
		String tenBaiHat = bh1.substring(vtriCuoi+1);
		System.out.println("Tên của bài hát "+tenBaiHat);
		
		int viTriCuoiDauCham=bh1.lastIndexOf(".");
		tenBaiHat =bh1.substring(vtriCuoi+1,viTriCuoiDauCham);
		System.out.println("Tên bài hát không có đuôi: "+tenBaiHat);
	}

}
