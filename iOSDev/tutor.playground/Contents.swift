import UIKit
import Foundation


// Computer Programming 1
// MARK: Simple Data Type

// varialbes

// Integers

//var x
    // initialize 給定初始值
var x1 = 1
var x2:Int = 2
var sum:Int = x1 + x2
print(sum)

// float 單精度浮點數
//var x3:Float
var x4:Float = 3.14159
var x5 = 9 / 2  //int
var x6:Float = 9 / 2 // float
print(x5," vs ",x6)

// Double 雙精度浮點數
var x7:Double = 3.14159
var x8 = 10.5 // this will be automatic seen as Double


// String
var str = "Hello, playground"
print(str)
print(str.count) // 計算字元數
if str.contains("Hello"){
    print("Yes")
}

// Bool 布林值
var b1 = true
var b2:Bool = true
var b3:Bool = false
// 無法與整數資料型態進行比較
// 兩布林值亦無法比較


// Tuple 元組
let myInfo = ("Jason Hsu", 1997)
let myName = myInfo.0 // Jason Hsu
let myBirth = myInfo.1 //1997
    // * Function Print_Name_Birth()


// 不確定資料型別
var unknown = 3 + 0.1 + 3.14159
print(unknown)


// Mark: 判斷式
//if else
if x1 == 1 {
    print("x1 =",1)
} else {
    print("x1 !=",1)
}


var a = 86
if a < 60 {
    print("a is lower than ",60)
} else if a < 80 {
    print("a is lower than ",80)
} else {
    print("a is higher than ",80)
}

//switch cases

//while for loop
//int loop
var i:Int = 0
for i in 1...5 {
    print(i)
}
//array loop 陣列
let names = ["name1","name2","name3"]
for name in names {
    print(name)
}


// Dictionary loop 字典
// Environment
var swift = ["MacOS", "iOS", "tvOS", "watchOS"]
var developDict = ["Macbook": "Xcode",
                   "iPad": "Playground"]

for (code, n) in developDict {
    print("\(code): \(n)")
}
// output
// Macbook: Xcode
// iPad: Playground




// MARK: Function
func func_name() {
    print("aaa")
}
// call function
func_name()

func MathPlus(x:Int,y:Int) {
    print(x + y)
}

// call function
MathPlus(x: 5, y: 1)

func Print_Name_Birth(){
    print("My name is \(myInfo.0), and my age is \(2018-myInfo.1)")
}
Print_Name_Birth()

// MARK: 架構
// Protocol

// Class

// Struct




// Example
// 字串相加
var string = "abc"
string.append("ABC")
string
string.appending("cde") // 保留初始值, 顯示改變值
string


// 亂數
var number = Int.random(in: 0...2)
var number1 = Int.random(in: 0..<2)
let num = [Int](1...10) // 產生一個陣列 存放 1 ~ 10

// 陣列亂數
var array = ["A", "B", "C", "D"]
array.shuffle()
array
array.shuffled() // 保留陣列值, 但顯示隨機陣列值
array
