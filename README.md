# Akademia-Java-Developer-PRO
Zadanie aplikacyjne na kurs

Opis zadania:
Stwórz aplikację, która będzie:
- Wykorzystywać publiczne API https://newsapi.org, pobierać artykuły w kategorii business, dla kraju Polska
- Zapisywać pobierane artykuły we wskazanym pliku tekstowym zgodnie z poniższym formatem:
title:description:author
title:description:author
…
Informacje dodatkowe:
- Aplikacja nie musi posiadać interfejsu graficznego - może działać w konsoli
- Możesz wykorzystać „czystą" Javę, ale jeśli wolisz, możesz zastosować znane Ci biblioteki lub frameworki, dodatkowym atutem będzie stworzeni testów jednostkowych

Sposób działania:
Po sklonowaniu projektu i uruchomieniu aplikacji, należy wykonać zapytanie typu GET na ten endpoint: http://localhost:8080/news
Wówczas zostanie wykonane zapytanie do NewsApi na adres: https://newsapi.org/v2/top-headlines?category=business&country=pl&apiKey=0feb907b0d7742858ab1c5a4e3aaeecd
W odpowiedzi uzyskamy artykuły z Polski o biznesowej tematyce.

Aplikacja automatycznie utworzy plik news.txt w głównym folderze projektu, do którego zostaną wpisane poszczególne artykuły (parsowanie odpowiedzi wymaga poprawy).
