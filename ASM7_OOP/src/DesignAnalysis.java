public class DesignAnalysis {

/*

Composition:

Library HAS-A Reader
Library HAS-A Book
Library HAS-A BorrowSlip
Library HAS-A LateFeePolicy

Lý do:
Không cùng bản chất nên dùng
Composition thay vì kế thừa.

Inheritance:

StudentReader IS-A Reader
FacultyReader IS-A Reader
SeniorReader IS-A Reader

Lý do:
Đều là các loại độc giả.

Đề xuất cải thiện:

Nên dùng LocalDate thay String
để quản lý ngày tháng.

*/

}