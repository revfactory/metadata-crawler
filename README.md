# metadata-crawler

## Prerequisites
Java 17 or higher
Gradle 7.5.1 or higher (optional, if you are using Gradle to build the project)

## Setting up the project
### 1. Clone the repository:
```
git clone https://github.com/revfactory/metadata-crawler.git
```

### 2. Navigate to the project directory:
```
cd metadata-crawler
```

### 3. Build the project:
```
./gradlew build
```

### 4. Run the application:
```
./gradlew bootRun
```

## Using the API
Once the application is running, you can use the API by sending a GET request to the /site-metadata endpoint, with the url query parameter set to the URL of the website you want to get the metadata for.

For example, to get the metadata for the website https://www.daum.net, you can send a request like this:
```
curl "http://localhost:8080/site-metadata?url=https://www.daum.net"
```

The API will return a JSON object containing the metadata for the website, including the title, representative image, and description.

Example response:
```
{
  "title": "Daum",
  "image": "https://i1.daumcdn.net/svc/image/U03/common_icon/5587C4E4012FCD0001",
  "description": "이용자 선택권을 강화한 뉴스, 세상의 모든 정보를 연결하는 검색. Daum에서 나의 관심 콘텐츠를 즐겨보세요."
}
```
Note: This API is just an example and may not work for all websites. Some websites may use different tags or structures for their metadata, or may not include certain metadata at all. You may need to modify the code to handle these cases.



