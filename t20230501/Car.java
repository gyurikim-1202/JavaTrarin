package t20230501;
//날짜 클래스 Day(ver.1)
class Car {
	private int year = 1;  //년
	private int month = 1;  //월
	private int date = 1;  //일
	
	//---생성자---//
	public Day()								{ }
	public Day(int year)						{ this.year = year }
	public Day(int year, int month) 			{ this(year); this.month = month;}
	public Day(int year, int month, int date)   { this(year, month); this.date= date;}
	public Day(Day d)							{ this(d.year, d.month, d.date); }
	
	//---연, 월, 일 불러오기---//
	public int getYear() { return year; }  //연 불러오기
	public int getMonth() { return month; }  //월 불러오기
	public int getDate() { return date; }  //일 불러오기
	
	//---연, 월, 일 설정---//
	public void setYear(int year)  { this.year = year; }  //연 설정
	public void setMonth(int Month)  { this.month= month; }  //월 설정
	public void setDate(int date)  { this.date = date; }  //일 설정
	
	public void set(int year, int month, int date) {		//연, 월, 일 설정
		this.year = year;  //연
		this.month = month;  //월
		this.date= date;  //일
	}
	
	//---요일 찾기---//
	public int dayOfWeek() {
		int y = year;  // 0 ... 일요일
		int m = month; // 1 ... 월요일
		if ( m == 1 || m == 2) {  // :
			y--;   // 5 ... 금요일
			m+= 12;   // 6 ... 토요일
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	//---날짜 d와 같은가?---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	//---문자열 표현 반환---//
	public String toString() {
		String[] wd = { "일", "월", "화", "수", "목", "금", "토"};
		return String.format("%04d년 %02d월 %02d일(%s)",
				year, month, date, wd[dayOfWeek()]);
	}

}
