import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private int grade;
	private boolean graduation;

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public boolean SetGraduation() {
		return graduation;
	}

	public void setGraduation(boolean graduation) {
		this.graduation = graduation;
	}

	public void studyHard() {
		grade += 20;
		System.out.println("あなたの点数は" + grade + "点まであがった");
		if (grade >= 80) {
			graduation = true;
			System.out.println("あなたは卒業できました");
		}
	}

	public void beingLazy() {
		grade -= 10;
		System.out.println("あなたの点数は" + grade + "点に下がりました");
		if (grade < 60) {
			graduation = false;
			for (int i = 0; i < 2; i++) {
				System.out.println("あなたは留年しました");
			}
			System.out.println("学費入金メソッド『addTuition()』を使って任意の学費を入力してください");
		}
	}

	public void addTuition() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("学費として出せる最大額をいれてください");
		int tuition = Integer.parseInt(scanner.next());
		if (tuition >= 150000) {
			System.out.println("あなたは再度受講できます。");
		} else {
			System.out.println("学費が足りません。もう諦めてください。");
		}
	}

}
