package framework;

import framework.entity.Exam;
import framework.entity.NewlecExam;
import framework.ui.ExamConsole;
import framework.ui.InlineExamConsole;

public class Spring_Di {

	public static void main(String[] args) {

		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam); //exam을 DI하고 있다.
//		ExamConsole console = new GridExamConsole(exam); // exam을 DI하고 있따.
		console.print();
	}
}
