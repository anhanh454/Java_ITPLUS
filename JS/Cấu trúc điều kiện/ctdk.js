/*1. Viết một chương trình JavaScript để kiểm tra một số có phải là số chẵn hay không.
Nếu là số chẵn thì in ra "Số chẵn", ngược lại in ra "Số lẻ".*/

function kiemTraChanLe(number)
{
    if(number %2 == 0)
    {
        console.log(number + " là số chẵn");
    }
    else
    {
        console.log(number + " là số lẻ");
    }
    console.log("");
}

/*2. Viết một chương trình JavaScript để kiểm tra một số có phải là số nguyên dương hay không.
Nếu là số nguyên dương thì in ra "Số nguyên dương", ngược lại in ra "Không phải số nguyên dương".*/

function kiemTraSoNguyenDuong(number)
{
    if(number > 0 && Number.isInteger(number))
    {
        console.log(number + " là số nguyên dương");
    }
    else
    {
        console.log(number + " không phải là số nguyên dương");
    }
    console.log("");
}

/*3. Viết một chương trình JavaScript để kiểm tra một năm có phải là năm nhuận hay không.
Năm nhuận là năm chia hết cho 4 nhưng không chia hết cho 100, hoặc là năm chia hết cho 400.*/

function kiemTraNamNhuan(year)
{
    if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))
    {
        console.log(year + " là năm nhuận");
    }
    else
    {
        console.log(year + " không phải năm nhuận");
    }
}

var soCanKiemTra = prompt("Nhập số: ");
soCanKiemTra = parseInt(soCanKiemTra);
if(isNaN(soCanKiemTra))
{
    console.log("Vui lòng nhập một số hợp lệ");
}
else
{
    kiemTraChanLe(soCanKiemTra);
    kiemTraSoNguyenDuong(soCanKiemTra);
    kiemTraNamNhuan(soCanKiemTra);
}
