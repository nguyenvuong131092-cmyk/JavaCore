package com.vti.frontend;

import com.vti.entity.*;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "HM";

        Position position1 = new Position();
        position1.PositionID = 1;
        position1.PositionName = "Dev";

        Position position2 = new Position();
        position2.PositionID = 2;
        position2.PositionName = "Test";

        Position position3 = new Position();
        position3.PositionID = 3;
        position3.PositionName = "Scrum";

        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "A＠gmail.com";
        account1.username = "A";
        account1.fullName = "NguyenVanA";
        account1.departmentId = 1;
        account1.positionId = 1;
        account1.createDate = LocalDate.of(2000, 1, 20);

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "B@gmail.com";
        account2.username = "B";
        account2.fullName = "NguyenVanB";
        account2.departmentId = 2;
        account2.positionId = 2;
        account2.createDate = LocalDate.of(2000, 2, 20);

        Account account3 = new Account();
        account3.accountId = 3;
        account3.email = "C＠gmail.com";
        account3.username = "C";
        account3.fullName = "NguyenVanC";
        account3.departmentId = 3;
        account3.positionId = 3;
        account3.createDate = LocalDate.of(2000, 3, 20);

        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Javateam";
        group1.creatorId = 1;
        group1.createDate = LocalDate.of(2000, 1, 20);

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "SQLteam";
        group2.creatorId = 2;
        group2.createDate = LocalDate.of(2000, 2, 20);

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Devteam";
        group3.creatorId = 3;
        group3.createDate = LocalDate.of(2000, 3, 20);

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupId = 1;
        groupAccount1.accountId = 1;
        groupAccount1.joinDate = LocalDate.of(2000, 1, 20);

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupId = 2;
        groupAccount2.accountId = 2;
        groupAccount2.joinDate = LocalDate.of(2000, 2, 20);

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupId = 3;
        groupAccount3.accountId = 3;
        groupAccount3.joinDate = LocalDate.of(2000, 3, 20);

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeId = 1;
        typeQuestion1.typeName ="Essay";

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeId = 2;
        typeQuestion2.typeName ="Maultiple-choice";

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.CategoryId = 1;
        categoryQuestion1.CategoryName ="Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.CategoryId = 2;
        categoryQuestion2.CategoryName ="NET";

        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "Java la gi";
        question1.categoryId = 1;
        question1.typeId = 1;
        question1.creatorId = 1;
        question1.createDate = LocalDate.of(2000, 1, 20);

        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "Cong Viec Dev";
        question2.categoryId = 2;
        question2.typeId = 2;
        question2.creatorId = 2;
        question2.createDate = LocalDate.of(2000, 2, 20);

        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "AI la gi";
        question3.categoryId = 3;
        question3.typeId = 3;
        question3.creatorId = 3;
        question3.createDate = LocalDate.of(2000, 3, 20);

        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "Java mot ngon ngu lap trinh";
        answer1.questionId = 1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "Dev la lap trinh vien";
        answer2.questionId = 2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "AI la tri thong minh nhan tao";
        answer3.questionId = 3;
        answer3.isCorrect = true;

        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "R1";
        exam1.title = "tao database";
        exam1.categoryId =1;
        exam1.duration = 15;
        exam1.creatorId =1;
        exam1.createDate = LocalDate.of(2000,1,1);

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "R2";
        exam2.title = "insert du lieu";
        exam2.categoryId =2;
        exam2.duration = 30;
        exam2.creatorId =2;
        exam2.createDate = LocalDate.of(2000,1,2);

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = "R3";
        exam3.title = "them du lieu";
        exam3.categoryId =3;
        exam3.duration = 15;
        exam3.creatorId = 3;
        exam3.createDate = LocalDate.of(2000,1,3);

        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = 1;
        examQuestion1.questionId =1;

        System.out.println("Question 3:  \n" +
                "Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra\n");
        System.out.println("===============================================================");
        System.out.println( "Department: \n" +
                            "ID: " + department1.departmentId + "\n" +
                            "Name: " + department1.departmentName);
        System.out.println("===============================================================");
        System.out.println("Account:  \n" +
                            "ID: " + account1.accountId + "\n " +
                            "FullName: " + account1.fullName + "\n " +
                            "UserName: " + account1.username + "\n " +
                            "Email: " + account1.email + "\n " +
                            "departmentId: " + account1.departmentId  + "\n " +
                            "positionId: " + account1.positionId + "\n " +
                            "createDate: " + account1.createDate);
        System.out.println("===============================================================");
        System.out.println("Answer: \n" +
                           "answerId: " + answer1.answerId + "\n " +
                           "content: " + answer1.content + "\n " +
                           "questionId: " + answer1.questionId + "\n " +
                           "isCorrect: " + answer1.isCorrect);
        System.out.println("===============================================================");
        System.out.println("CategoryQuestion: \n" +
                            "CategoryId: " + categoryQuestion1.CategoryId + "\n " +
                            "CategoryName: " + categoryQuestion1.CategoryName);
        System.out.println("===============================================================");
        System.out.println("Exam: \n" +
                            "ExamId: " + exam1.examId + "\n " +
                            "Title: " + exam1.title  + "\n " +
                            "Code" + exam1.code + "\n " +
                            "Duration: " + exam1.duration + "\n " +
                            "CreatorID: " + exam1.creatorId + "\n " +
                            "CategoryID: " + exam1.categoryId + "\n " +
                            "CreateDate: " + exam1.createDate);
        System.out.println("===============================================================");
        System.out.println("ExamQuestion: \n" +
                            "ExamID: " + examQuestion1.examId + "\n " +
                            "QuestionID: " + examQuestion1.questionId);
        System.out.println("===============================================================");

    }
}
