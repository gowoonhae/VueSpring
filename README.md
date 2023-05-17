# 쇼핑몰 프로젝트 Cloudmall

1. 메인 화면
![1](https://github.com/gowoonhae/VueSpring/assets/131464304/0c5f3d05-b553-47f6-83c4-9b1b9bae441d)
- 프론트엔드에서 useFetch API를 활용해 백엔드로 데이터 요청을 보낸다.
- 백엔드의 컨트롤러가 요청을 받아 서비스로 넘긴다.
- 서비스는 JPA Repository 의 findAll() 메소드를 실행, 상품 엔티티에서 상품 데이터를 가져와 컨트롤러에 반환한다.
- @RestController 어노테이션으로 상품 데이터의 객체를 리스트 형태로 반환한다.
- 반환받은 데이터를 HTML 요소에 바인딩하여 화면을 그린다.

![2](https://github.com/gowoonhae/VueSpring/assets/131464304/d587318c-5e72-45e2-b552-cf14edca98d2)

![3](https://github.com/gowoonhae/VueSpring/assets/131464304/b7489f34-d387-4cec-80c7-0b671d94d95f)

![4](https://github.com/gowoonhae/VueSpring/assets/131464304/0a6b31f2-35b1-4089-ab19-27fa130bf61f)

![5](https://github.com/gowoonhae/VueSpring/assets/131464304/6501c2d7-afa1-4e4b-bfdc-80fbdc52d390)

![6](https://github.com/gowoonhae/VueSpring/assets/131464304/a352a355-f96b-40cf-bd08-31af341daeed)
