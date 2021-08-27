package framework.ui;

import framework.entity.Exam;

public class InlineExamConsole implements ExamConsole {

private Exam exam;

	public InlineExamConsole(Exam exam) {
			this.exam = exam;
		}

	public void print() {
		System.out.printf("total is %d, avg if %f\n",exam.total(),exam.avg());
	}
}
