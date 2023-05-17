# 쇼핑몰 프로젝트 Cloudmall

 1. 메인 화면

![1](https://github.com/gowoonhae/VueSpring/assets/131464304/0925b581-4e8f-4536-9a8a-29bec1c1f425)
- 프론트엔드에서 useFetch API를 활용해 백엔드로 데이터 요청을 보낸다.
- 백엔드의 컨트롤러가 요청을 받아 서비스로 넘긴다.
- 서비스는 JPA Repository 의 findAll() 메소드를 실행, 상품 엔티티에서 상품 데이터를 가져와 컨트롤러에 반환한다.
- @RestController 어노테이션으로 상품 데이터의 객체를 리스트 형태로 반환한다.
- 반환받은 데이터를 HTML 요소에 바인딩하여 화면을 그린다.

<br>

2. 등록 화면

![2](https://github.com/gowoonhae/VueSpring/assets/131464304/03111d71-6b7e-4abc-84a9-f386da4e747c)
- 이미지를 직접 DB에 저장하면 비효율적이므로, 다른 서버에 저장하고 그 이미지가 저장된 주소를 DB에 저장한다.
- 프론트엔드의 Node.js 서버를 이미지 저장소로 임시 활용했다.
- 이미지 등록 버튼을 누르면, FormData 형태로 Node.js 백엔드에 이미지를 전달한다.
- formidable 라이브러리를 활용해, 서버에 이미지를 저장하고, 이미지가 저장된 주소를 반환한다.
<br>

- 등록 버튼을 누르면, form에 입력받은 데이터와 이미지 주소를 함께 Spring 백엔드로 전달한다.
- 컨트롤러가 요청을 서비스로 전달한다.
- 서비스는 save() 메소드를 실행, 상품 엔티티에 상품 데이터를 저장한다.

<br>

3. 등록이 완료된 메인 화면

![3](https://github.com/gowoonhae/VueSpring/assets/131464304/8d67dc5a-7627-4f7d-bfcc-251e0e7dd1f3)

<br>

4. 상품 상세 화면

![4](https://github.com/gowoonhae/VueSpring/assets/131464304/751e0579-db34-4579-846d-ab50c76a69bf)
- 메인 화면에서 상품을 클릭하면, 그 상품의 id를 패러미터로 백엔드에 전달한다. detail/{id}
- 컨트롤러는 @PathVariable 어노테이션으로 id를 가져와 서비스로 보낸다.
- 서비스는 findById 메소드로 엔티티에서 상품의 상세 정보를 가져온다.
- @RestController 어노테이션으로 프론트엔드에 상품 데이터 객체를 반환한다.
- 반환받은 데이터를 HTML 요소에 바인딩하여 화면을 그린다.

<br>

5. 상품 수정 화면

![5](https://github.com/gowoonhae/VueSpring/assets/131464304/bf575a50-fcf8-4e56-86ee-8bdf2f6a34d0)
- 상세 화면에서 수정 버튼을 누르면, 그 상품의 id를 패러미터로 백엔드에 전달한다. create/{id}
- 가져온 id로 상품 등록 화면의 form 요소에 상품 데이터를 바인딩한다.
- 등록 화면을 그대로 사용해 낭비되는 중복 코드가 없다.
- 넘겨받은 id가 없다면 등록, id가 있다면 수정 화면을 띄운다.

<br>

6. 수정이 완료된 메인 화면

![6](https://github.com/gowoonhae/VueSpring/assets/131464304/a5a15556-b230-4c26-9025-2343d03e4023)
