package com.navr.springcore.di;

public class StudentNew {

    private long studentId;
    private CheatBook cheatBook;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public CheatBook getCheatBook() {
        return cheatBook;
    }

    public void setCheatBook(CheatBook cheatBook) {
        this.cheatBook = cheatBook;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "studentId=" + studentId +
                ", cheatBook=" + cheatBook +
                '}';
    }
}
