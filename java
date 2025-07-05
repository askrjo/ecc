// GET
@GetMapping("/api/articles")
public List<Article> index() {
	return articleservice.index()；
}

public List<Article> index() {
	return articleRepository.findAll()；
}

@GetMapping("/api/articles/{id}")
public Article show(@PathVariable Long id) {
	return articleservice.show(id)；
}

public Article show(Long id) {
	return articleRepository.findById(id).orElse(null)；
}

@PostMapping("/api/transaction-test")
public ResponseEntity<List<Article» transactionTest
		(@RequestBody List<ArticleForm> dtos) {
	List<Article> createdList = articleService.createArticles(dtos)；
	return (createdList != null) ? // 생성 결과에 따라 응답 처리
		ResponseEntity.status(HttpStatus.OK).body(createdList) :
		ResponseEntity.status(HttpStatus,BAD_REQUEST).build()；
}

package com.example.firstproject.service；
import org.junit.jupiter.api.Test； 
import static org. junit. jupiter. api.Assertions.*； 
@SpringBoostTest
class ArticleServiceTest {
	@Autowired
    ArticleService articleService
	@Test 
	void index() {
	}
}

//예상 데이터 입력
Article a = new Article(1L, "가가가가", "1111")；
Article b = new Article(2L, "나나나나1‘, "2222")；
Article c = new Article(3L, "다다다다‘1, "3333")；
List<Article> expected = new ArrayList〈Article〉(Arrays.asList(a, b, c))；

// 비교 및 검증
assertEquals(expected.toStrinq(), articles.toStringO)；

public class Comment {
	@Id 
	@GenerateValue(strategy=GenerationType.IDENTITY)
 	private Long id;
	private Long id； // 대표키
  @ManyToOne
  @JoinColumn(name="article_id")
	private Article article； // 해당 댓글의 부모 게시글
  @Column
	private String nickname； // 댓글을 단 사람
  @Column
	private String body； // 댓글 본문
 }

@DataJpaTest // 해당 클래스를 JPA와 연동해 테스팅
class CommentRepositoryTest {
	©Autowired
	CommentRepository commentRepository；// @ commentRepository 객체 주입
	@Test
	void findByArticlelcK) {
	}
	©Test
	void findByNickname() {
	}
} 

@Test
@DisplayName("특정 닉네임의 모든 댓글 조회’,)
void findByNicknameO {

    
    String nickname = "Park"； 
    List<Comment> comments = commentRepository.findByNickname(nickname)；  
    Comment a = new CommentClL, new Article(4L, "인생 영화?", nickname, "굿 윌 헌팅");
    Comment b = new Comment(4L, new Article(5L,"소울 푸드?", nickname, "치킨11);
	
    List<Comment> expected = Arrays.asList(a, bz c)；    
  
    assertEquals(expected.toString()z comments.toString(), "Park의 모든 댓글을 출력!,,);  //4. 비교 및 검증
}

