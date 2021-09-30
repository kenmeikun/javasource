package dept;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블 모양과 똑같이 작성

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {
	private int deptNo;
	private String dname;
	private String loc;
	
	//생성자,getter,setter,toString
	
}
