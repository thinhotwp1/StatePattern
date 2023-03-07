Chương 10: State Pattern – Trạng thái vạn vật
https://toihocdesignpattern.com/chuong-10-state-pattern-trang-thai-van-vat.html

Link github: https://github.com/thinhotwp1/StatePattern.git

Cùng 1 sơ đồ với Strategy Pattern nhưng thay vì gán các hành vi linh hoạt khi runtime(xác định các type chọn xong rồi chọn các hành động cụ thể trong runtime) thì State Pattern lại ủy quyền mọi hành động cho trạng thái hiện tại của chủ thể (xác định các hành động của trạng thái chỉ thay đổi các trạng thái của chủ thể và thực hiện các hành động)

Lưu ý: 
State pattern tách các trạng thái và object ra riêng, ví dụ tách GumballMachine và các trạng thái có xu, không có xu,... ra thành các class riêng.
State pattern nên dùng cho chủ thể(object) có nhiều trạng thái và có thể dễ dàng thêm các trạng thái mới vào và không phải đụng vào code cũ, và khi sử dụng chỉ cần gọi chủ thể kèm theo hành động, sự thay đổi trạng thái được cài đặt ở trong chính các class trạng thái đó. Ví dụ chuyển từ trạng thái chưa có xu thành trạng thái có xu khi đã thực hiện hành động cho xu vào được cài đặt ở class trạng thái chưa có xu.
Trong ví dụ bài viết GumballMachine 4 hành động thêm xu, trả xu, quay tay quay và cho ra kẹo và mọi trạng thái đều phải implement 4 hành động này. Khi thêm hành động mới thì các trạng thái cần phải implement thêm hành động mới này.

So sánh với Strategy pattern:
Link tài liệu strategy pattern: https://docs.google.com/document/d/1mk1rEqvGNsheRnQLLy5IYpCeYrngSy7sFJUo9QMar6s/edit?usp=sharing

Strategy pattern tách hành vi và object ra riêng, thì khi runtime có thể thay đổi linh hoạt các hành vi khác nhau cho 1 object, như súng có thể lúc bắn đạn có lúc phun lửa,... Khác với state pattern fix cứng các hành vi tùy theo trạng thái và chỉ thay đổi các trạng thái.

=> Tóm lại, cần xác định số trạng thái hay số hành vi của object cái nào thay đổi nhiều thì cho cái còn lại làm class riêng, ví dụ: object có số hành vi ít thay đổi và nhiều trạng thái thì dùng State Pattern, còn object có nhiều hành vi cần thay đổi linh hoạt ngay lúc runtime thì dùng Strategy, 2 mẫu này cùng sơ đồ nhưng mục đích sử dụng lại khác nhau.
