#### Mainichishinpou
Java: 1.8

IDE: IntelliJ

Database: Mysql workbench version 8

Cấu trúc thư mục 

src/main

* config: chứa các lớp cấu hình
* controller: chứa các lớp controller
* model: chứa các lớp trung gian được sử dụng làm cấu trúc request, dto, mapper
* entity: chứa các lớp đại diện cho các bảng
* repository: chứa các interface tương tác với database
* service: chứa các lớp xử lý business logic
* exception: chứa các lớp định nghĩa và xử lý ngoại lệ
* security: chứa các lớp liên quan đến bảo mật
* util: chứa các lớp có các hàm hữu ích có thể tái sử dụng

resources

* application.properties: file cấu hình chung project

* application-dev.properties: file cấu hình cho môi trường dev

* application-prod.properties: file cấu hình cho môi trường production

* test: chứa các lớp test

* pom.xml: file quản lý maven

