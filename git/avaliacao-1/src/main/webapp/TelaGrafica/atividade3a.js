var a = 'palavra';
var b = false;
var c = true;
var d = 0
var e = 1
var f = 2
var g = null

console.log(a || b); // 'palavra'
console.log(c || a); // verdadeiro
console.log(b || a); // 'palavra'
console.log(e || f); // 1
console.log(f || e); // 2
console.log(d || g); // nulo
console.log(g || d); // 0
console.log(a && c); // verdadeiro
console.log(c && a); // 'palavra'