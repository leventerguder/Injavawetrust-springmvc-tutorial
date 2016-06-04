package _22.apache.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {

	@RequestMapping(value = "/menu1")
	public String handleMenu1() {
		return "menu1View";
	}

	@RequestMapping(value = "/menu2")
	public String handleMenu2() {
		return "menu2View";
	}

	@RequestMapping(value = "/page1")
	public String handlePage1() {
		return "page1View";
	}

	@RequestMapping(value = "/page2")
	public String handlePage2() {
		return "page2View";
	}

	@RequestMapping(value = "/page3")
	public String handlePage3() {
		return "page3View";
	}

	@RequestMapping(value = "/page4")
	public String handlePage4() {
		return "page4View";
	}

	@RequestMapping(value = "/page5")
	public String handlePage5() {
		return "page5View";
	}

	@RequestMapping(value = "/page6")
	public String handlePage6() {
		return "page6View";
	}

}
