document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('reserve-form').addEventListener('submit', function (event) {
        var departureDateTime = document.getElementById('departureDateTime').value.trim();
        var returnDateTime = document.getElementById('returnDateTime').value.trim();

        if (departureDateTime === '' || returnDateTime === '') {
            alert('すべての必須フィールドに入力してください。');
            event.preventDefault(); 
        }
    });
});

var day1 = new Date();
  var day2 = new Date();
  day1 = document.getElementById("departureDateTime").value;
  day2 = document.getElementById("returnDateTime").value;
  console.log(day1);
  console.log(day1.getTime());
   if (day1.getTime() > day2.getTime()) {
   		alert("選択された時間が不正です");   
  }