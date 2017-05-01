package chapter03;

public class Value {
	private int a;
	private int b;
	
	public Value(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() { //자동생성
		return "Value [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() { //equals 성능이 안좋기 때문에 hashCode() 부터 실행되도록 한다. hashCode가 같으면 equals를 호출하도록 한다. (자동생성 : Source->Generate hashCode() and equals())
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) { //성능이 떨어진다.(자동생성 : Source->Generate hashCode() and equals())
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
}
