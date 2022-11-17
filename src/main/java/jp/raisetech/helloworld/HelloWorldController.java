package jp.raisetech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/country")
    public String country(@RequestBody String country) {
        String message = "Hello World " + country + "の挨拶は";

        //"Post"で受け取った文字列に応じたメッセージを返す
        if (country.equals("us")) {
            return message + "hello";
        } else if (country.equals("japan")) {
            return message + "こんにちは";
        } else if (country.equals("france")) {
            return message + "Bonjour";
        } else if (country.equals("korea")) {
            return message + "アンニョンハセヨ";
        } else {
            return country + " ：ERROR リクエストを処理できませんでした ";
        }
    }
}
