package kr.ac.sejong.kmooc.data_engineering.motivation;

public class Email {
	// 데이터 추상화
	int from; // 보낸 사람
	int to; // 받는 사람
	// 프로시저 추상화

	public Email(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return from + " -> " + to;
	}

	@Override
	public boolean equals(Object obj) {
		Email objEmail = (Email) obj;
		if (from == objEmail.from && to == objEmail.to)
			return true;
		return false;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}
	
	
}
