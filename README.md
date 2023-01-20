# db2022

```mermaid

erDiagram
    Student ||--o{ Phone : has
    Student }|--o| Grade : has
    Student ||--o{ StudentSchool : attends
    School ||--o{ StudentSchool : enrolls
    Student ||--o{ StudentHobby : has
    Hobby ||--o{ StudentHobby : involves
    
    
    Student {
        int StudentId
        string Name
        int GradeId
    }
    
    Phone {
        int PhoneId
        int StudentId
        tinyint IsHome 
        tinyint IsJob
        tinyint IsMobile
        string number
    }
    
    School {
        int SchoolId
        string name
        string City
    }
    
    StudentSchool {
        int StudentId
        int SchoolId
    }
    
    Hobby {
        int HobbyId
        string name
    }
    StudentHobby {
        int StudentId
        int HobbyId
    }
    
    Grade {
        int GradeId
        string name
    }
    
```

## Normalisera databas

```bash
cd ws
cd db2022
docker exec -i iths-mysql mysql -uiths -piths < normalisering.sql
winpty docker exec -it iths-mysql bash
mysql -uiths -piths
```

## Köra java kod

```bash
gradle check
```

