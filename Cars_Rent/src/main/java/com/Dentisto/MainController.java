package com.Dentisto;





import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class MainController {

	
	@GetMapping("/")
	public String viewHomePage() {
		
		return "index";
		
	}
	


	// ADMIN Pages


	@GetMapping("/admin/login")
	public String viewAdminLoginPage() {
		
		return "admin/admin_login";
		
	}
	

	
	







    // EMP Pages


	@GetMapping("/register")
	public String viewUserRegisterPage() {

		return "user/register";

	}






	@GetMapping("/user/dash")
	public String viewUserDashPage() {

		return "user/emp_dash";

	}


















	@GetMapping("/forma")
	public String viewFormPage() {
		
		return "user/form";
		
	}

	@GetMapping("/forma1")
	public String viewForm1Page() {

		return "user/formV";

	}

	@GetMapping("/forma2")
	public String viewForm2Page() {

		return "user/formP";

	}


	@GetMapping("/user/login")
	public String viewSuuccPage() {

		return "user/emp_login";

	}





	@GetMapping("/user/dash/UserProfil")
	public String viewUserProfilPage() {

		return "user/UserProfil";

	}



	@GetMapping("/user/dash/CarInfo")
	public String viewCarPage() {

		return "user/CarInfo";

	}

	@GetMapping("/user/dash/Msg")
	public String viewMsgPage() {

		return "user/Msg";

	}

















}
