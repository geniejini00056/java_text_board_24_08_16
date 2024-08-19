package com.sbs.exam.board;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int articleLastId =0;

        System.out.println("== 자바 텍스트 게시판 ==");
        System.out.println("== 프로그램 시작 ==");
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine();

            if(cmd.equals("/usr/article/write")){
                System.out.println("==게시물 등록==");

                System.out.printf("제목: ");
                String title = sc.nextLine();

                System.out.printf("내용: ");
                String content = sc.nextLine();

                int id = articleLastId + 1;
                articleLastId = id;
                
                Article article = new Article();
                article.id = id;
                article.title = title;
                article.content = content;
                
                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
                System.out.println("생성된 게시물 객체: " + article);
            }

            else if(cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            else{
                System.out.println("명령어를 잘못 입력하셨습니다.");
            }
        }

        sc.close();
    }
}


class Article {
    int id;
    String title;
    String content;

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("글 번호 : %d, 글 제목: %s, 글 내용: %s", id, title, content);
    }
    }

