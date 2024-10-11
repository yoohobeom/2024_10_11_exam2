/* - 프로그램 시작과 동시에 게시글(article) 테스트데이터 3개 생성 후 ArrayList를 활용하여 저장

 - 사용자에게 명령어를 반복해서 입력받는다.

 - 게시글(article)의 속성(id, regDate, title, body)을 고려하여 클래스를 구현한다.

 - article write(글쓰기), article list(글 목록), article list 검색어(검색어가 제목에 포함된 글 목록), 
 article detail(상세보기), article modify(글 수정), article delete(글 삭제)의 기능을 구현한다.

 - article list 검색어(검색어가 제목에 포함된 글 목록) 기능은 별도로 구현하는 것이 아니라 article list(글 목록) 기능에 포함시켜 구현한다.

 - article detail(상세보기), article modify(글 수정), article delete(글 삭제) 기능은 명령어 뒤에 글 번호를 입력하여 어떤 글에 대한 명령인지 판단할 수 있도록 한다.
  (예시 : article detail 1 -> 1번 글 상세보기)

 - 기능에 맞는 적절한 문구가 출력되어야 한다.

 - 모든 클래스는 각각의 파일로 만들어야 한다.*/

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

import Util.Util;

public class Main {
	
	static int lastArticleId;
	static List<Article> articles;
	
	static {
		articles = new ArrayList<Article>();
		lastArticleId = 0;
	}
	
	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");

		Scanner sc = new Scanner(System.in);


		System.out.printf("명령어)");

		String cmd = sc.nextLine();

		while (true) {
			if (cmd.equals("exit")) {
				break;
			} else if (cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				lastArticleId++;
				
				Article article = new Article(lastArticleId, Util.getDateStr(), title, body);
				
				articles.add(article);
				
			} else if (cmd.startsWith("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 존재하지 않습니다");
				}
//				String foundArticle = cmd.substring(12).trim();
//				Article printArticle;
				
				System.out.println("번호	|	번호	|	내용");
				for (int i =lastArticleId - 1; i >= 0; i--) {
						
				}
			} else if (cmd.startsWith("article detail ")) {
				
			} else if (cmd.startsWith("article modify ")) {
				
			} else if (cmd.startsWith("article delete ")) {
				String[] bits = cmd.split(" ");
				
				int a = Integer.parseInt(bits[2]);
				
				for (Article article : articles) {
					if (article.id == a) {
						articles.remove(a);
					}
				}
			}

		}

		sc.close();

		System.out.println("=== 프로그램 종료 ===");

	}
}

void test() {
	for (int i = 0; i <= 3; i++) {
		
	}
}



class Article {
	int id;
	String refDate;
	String title;
	String body;
	
	public Article (int id, String refDate, String title, String body) {
		this.id = id;
		this.refDate = refDate;
		this.title = title;
		this.body = body;
	}
}
