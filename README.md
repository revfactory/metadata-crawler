# WebInfo API

This API allows you to retrieve the title, representative image, and description of a website by providing the URL of the website as an input.

## How to use
To use the API, send a GET request to the following endpoint:
```
/webinfo?url=<URL>
```
Replace <URL> with the URL of the website that you want to retrieve information for.  

The API will return a JSON object with the following structure:
```
{
  "title": "Title of the website",
  "imageUrl": "URL of the representative image",
  "description": "Description of the website"
}
```

## Example
Here is an example of how to use the API:
```
curl http://localhost:8080/webinfo?url=https://www.daum.net
```

This will return the following response:
```
{
  "title": "Daum",
  "image": "https://i1.daumcdn.net/svc/image/U03/common_icon/5587C4E4012FCD0001",
  "description": "이용자 선택권을 강화한 뉴스, 세상의 모든 정보를 연결하는 검색. Daum에서 나의 관심 콘텐츠를 즐겨보세요."
}
```
Note: This API is just an example and may not work for all websites. Some websites may use different tags or structures for their metadata, or may not include certain metadata at all. You may need to modify the code to handle these cases.

## Dependencies
This API uses the JSoup library to parse HTML and extract the website's title, representative image, and description. You will need to include the JSoup library as a dependency in your project in order to use this API.

To add the dependency to your project, include the following line in your build.gradle file:
```
implementation 'org.jsoup:jsoup:1.13.1'
```

