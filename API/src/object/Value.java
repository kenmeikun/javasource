package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	};
	@Override
	public boolean equals(Object obj) {//object obj =value2
		// value1.equals(value2);
		//object obj =value2
		Value v=(Value)obj;
		if (this.value==v.value) {
			return true;
		}
		return false;
	}
		//int���� ���ڿ��� �����ϴ¹� :int+"",String.valueOF(int)
	@Override
	public String toString() {
	
		return value+"";
	}
	
	
}
