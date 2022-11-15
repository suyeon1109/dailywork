// 테이블과 폼이 있는 문서가 있다고 가정합시다.
// 아래 조건에 맞는 요소는 어떻게 찾을 수 있을까요?

// 1. id="age-table" 인 테이블
// 2. 테이블 내의 label 요소 모두 (총 3개)
// 3. 테이블 내의 첫 번째 td (age가 적힌 곳)
// 4. name="search"인 form
// 5. 폼의 첫번째, 
// 6. 마지막 input

/* 
1. let elements = table.getElementById('age-table'); 

2. let elements = table.getElementsByTagName('label'); 

3. let elements = table.getElementsByTagName('td')[0]; 

4. let form = document.getElementsByName("search"); 
         
5. let elements = form.getElementsByTagName('input')[0];

6. let inputs = form.querySelectorAll('input'); 
inputs[inputs.length-1]
*/
