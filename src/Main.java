
public class Main {
	public static void main(String[] args) {
		Student Eishi = new Student("Eishi Shimada", 24, 70);
		//beingLazyメソッドで初期のパラメータ(70点)から10点下がる
		Eishi.beingLazy();
		//さらに10点下がり、gradeが60点を下回ると留年が確定する
		Eishi.beingLazy();
		//留年後、学費の投入が必要になるため、addTuisionメソッドでユーザに任意の額を入れさせる
		//ユーザが投入できた額が15万円以下なら再受講は諦めるように促す。
		Eishi.addTuition();
	}
}
