package Ch12Array;

import java.util.Scanner;

class BookInfo{
	String bookCode;
	String bookTitle;
	String Publisher;
	@Override
	public String toString() {
		return "BookInfo [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", Publisher=" + Publisher + "]";
	}
}

public class C02BookMain {

	public static void main(String[] args) {
		BookInfo list[] = new BookInfo[3];
		Scanner sc = new Scanner(System.in);
		
		//******list의 요소마다 BookInfo객체 연결코드 작성******
		list[0]=new BookInfo();
		list[1]=new BookInfo();
		list[2]=new BookInfo();
		
		
		//list의 요소마다 BookInfo객체 연결코드 작성
		
		for(BookInfo book : list)
		{
			System.out.print("코드|제목|출판사 입력 : ");
			book.bookCode = sc.next();
			book.bookTitle = sc.next();
			book.Publisher = sc.next();
			
		}
		
		for(BookInfo book : list) {
			System.out.println(book.toString()); //모든 필드의 값이 출력되게 BookInfo의
												 //toString()재정의 할 것
			
		}

	}

}
