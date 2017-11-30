package edu.wust.array;

public class Score {
	int stuNo;
	double Score;
	int courseNo;
	Score(int s,int c,double S){
		this.stuNo=s;
		this.Score=S;
		this.courseNo=c;
	}
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public double getScore() {
		return Score;
	}
	public void setScore(double Score) {
		this.Score = Score;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	
	public String toString() {
		return("stuNo:"+getStuNo()+
				" CourseNo:"+getCourseNo()+
				" score:"+getScore());
	}

}
