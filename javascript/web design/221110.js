/*
shorten this

let accessAllowed;
let age=prompt('나이를 입력해주세요');

if (age > 18) {
    accessAllowed = true;
} else {
    accessAllowed = false;
}
alert(accessAllowed);
*/

// let result = condition ? value1 : value2
let age=prompt('나이를 입력해주세요',"");
let accessAllowed = (age>18) ? true : false;

/*
shorten this 

let result;

if (a+b<4) {
    result='미만';
} else {
    result = '이상';
}
*/

let result=(a+b<4) ? '미만' : '이상';


/*
shorten this

let message;

if (login == '직원') {
    message="안녕하세요.";
} else if (login=='임원) {
    message="환영합니다.";
} else if (login='') {
    message="로그인이 필요합니다.";
} else {
    message='';
}
*/

let message = (login == '직원') ? '안녕하세요' :
    (login=='임원') ? '환영합니다' :
    (login=='') ? '로그인이 필요합니다.';
