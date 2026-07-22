
# ☕ Coffee Menu Service (REST API)

> **Course:** CP353002 — Principles of Software Design and Development  
> **Repository:** [Lab05-Spring-Been-Scope](https://github.com/PavaritPramual/Lab05-Spring-Been-Scope)  
> **Team Members:** บอส (Boss) & โฟน (Phone)  



## 🛠️ Tech Stack & Prerequisites
* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Build Tool:** Maven
* **Storage:** In-Memory Data Structure (`ArrayList`)



## 📂 Project Structure

```text
Lab05-Spring-Been-Scope
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── lab05_bean_scope/
│   │   │               ├── Lab05BeanScopeApplication.java
│   │   │               ├── Coffee.java
│   │   │               └── CoffeeController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

```

---

## 🚀 How to Run (วิธีรันโปรเจกต์)

### 1. Clone Repository

```bash
git clone [https://github.com/PavaritPramual/Lab05-Spring-Been-Scope.git](https://github.com/PavaritPramual/Lab05-Spring-Been-Scope.git)
cd Lab05-Spring-Been-Scope

```

### 2. Run Spring Boot Application

เปิด Terminal ในโฟลเดอร์โปรเจกต์แล้วใช้คำสั่งดังนี้:

* **macOS / Linux:**
```bash
./mvnw spring-boot:run

```


* **Windows (Command Prompt / PowerShell):**
```cmd
mvnw spring-boot:run

```



แอปพลิเคชันจะเริ่มต้นทำงานที่พอร์ต **`8080`** (`http://localhost:8080`)

---

## 📡 API Endpoints & `curl` Examples (Bonus)

| HTTP Method | Endpoint | Description |
| --- | --- | --- |
| **GET** | `/coffees` | ดึงรายการเมนูกาแฟทั้งหมด |
| **POST** | `/coffees` | เพิ่มเมนูกาแฟใหม่ |
| **PUT** | `/coffees/{id}` | แก้ไขข้อมูลเมนูกาแฟตาม ID |
| **DELETE** | `/coffees/{id}` | ลบเมนูกาแฟตาม ID |

### 1. ดึงเมนูกาแฟทั้งหมด (GET)

```bash
curl -X GET http://localhost:8080/coffees

```

### 2. เพิ่มเมนูกาแฟใหม่ (POST)

```bash
curl -X POST http://localhost:8080/coffees \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Cappuccino",
    "price": 70.0
  }'

```

### 3. แก้ไขข้อมูลเมนูกาแฟ (PUT)

*(เปลี่ยน `<COFFEE_ID>` เป็น ID จริงที่ได้จากระบบ)*

```bash
curl -X PUT http://localhost:8080/coffees/<COFFEE_ID> \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Cappuccino Extra Shot",
    "price": 85.0
  }'

```

### 4. ลบเมนูกาแฟ (DELETE)

*(เปลี่ยน `<COFFEE_ID>` เป็น ID จริงที่ได้จากระบบ)*

```bash
curl -X DELETE http://localhost:8080/coffees/<COFFEE_ID>
```


## 🎯 Bonus Feature (+10 Points)

* **404 Not Found Handling:** มีการส่ง HTTP Status `404 Not Found` กลับไปอย่างถูกต้อง เมื่อไม่พบ `id` ที่ระบุในคำขอ `PUT` หรือ `DELETE`
* **Complete `curl` Documentation:** จัดทำเอกสารคำสั่ง `curl` ครบทุก Endpoint ในไฟล์ `README.md`


