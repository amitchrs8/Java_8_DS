print('hello world testing from js file 1 ');
eval(323+434);
print('hello world testing from js file 2 ');
print('hello world testing from js file 3 ');
eval(3+4);


var fun1 = function(name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
};

var myJavaClass = Java.type('java_8_only.NashornScript1');
var result = myJavaClass.fun('Amit');
print('Printing the result of Java method call '+result);
