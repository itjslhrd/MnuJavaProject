
public class Exam_01 {
	public static void main(String[] args) {
		Car car;//참조변수, 인스턴수 변수
		car = new Car();
		car.carName="소나타";
		System.out.println("자동차이름 : " + car.carName);
		
		car.speedUp();
		
	}

}
