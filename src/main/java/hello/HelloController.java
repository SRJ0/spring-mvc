package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//DispatcherServlet이 클라이언트 요청을 받아 각 요소를 연결하며 흐름을 제어하는 중추적 역할을 담당한다.
//HandlerMapping은 요청을 처리한 핸들러(컨트롤러)를 찾아주고
//컨트롤러에서 요청을 실제로 처리한 다음 모델과 뷰 이름을 돌려준다.
//dispatcher와 핸들러 사이에서 HandlerAdapter가 핸들러 종류에 관계없이 사용할 수 있도록 데이터를 변환해준다.
//viewresolver는 처리 결과를 생성할 view를 찾아주고
//최종적으로 view가 응답을 생성해서 전달한다.

@Controller
public class HelloController {

    @RequestMapping("/hello") // 서블릿 컨텍스트 경로를 기준으로 한다. webapp/sample이라면 http://host/sample/hello
    public String hello(Model model,
                        @RequestParam(value = "name", required = false) String name) {
        //HTTP request 파라미터를 바로 전달받는다. required ture인 파라미터 값이 없으면 익셉션 발생
        model.addAttribute("greeting", "안녕하세요" + name);
        //뷰에 전달할 데이터 지정.
        return "hello"; //뷰 논리적인 이름을 리턴
    }

}
