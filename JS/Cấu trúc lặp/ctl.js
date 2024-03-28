var n = +prompt("Nhập một số nguyên dương:");
n = parseInt(n);

/*1. Viết một chương trình JavaScript để tính tổng các số từ 1 đến n
(n là một số nguyên dương được nhập từ bàn phím) bằng cách sử dụng vòng lặp for.*/

if(isNaN(n) || n<= 0 || !Number.isInteger(n))
{
    console.log("Nhập số hợp lệ!");
}
else
{
    var sum =0;
    for (var i = 1; i<=n; i++)
    {
        sum+= i;
    }
    console.log("Tổng các số từ 1 đến " + n + " là: " + sum);
    console.log("");
}

/*2. Viết một chương trình JavaScript để tính giai thừa của một số n
(n là một số nguyên dương được nhập từ bàn phím) bằng cách sử dụng vòng lặp while.*/

if(isNaN(n) || n<= 0 || !Number.isInteger(n))
{
    console.log("Nhập số hợp lệ!");
}
else
{
    var factorial = 1;
    var i = 1;

    while (i <= n) {
        factorial *= i;
        i++;
    }
    console.log(n + "! = " +factorial);
    console.log("");
}

/*3. Viết một chương trình JavaScript để in ra 
bảng cửu chương từ 2 đến 9 bằng cách sử dụng vòng lặp lồng nhau.*/

for (var i = 2; i<=9; i++)
{
    console.log("Bảng cửu chương " + i + ":");
    for (var j = 1; j<=10; j++)
    {
        console.log(i + " x " + j + " = " + (i*j));
    }
    console.log("");
}
