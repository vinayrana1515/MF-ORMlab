package rana.com.controller;


import javax.servlet.http.HttpServletRequest;





import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import rana.com.dao.UserDao;
import rana.com.models.EmailData;
import rana.com.models.UserData;
@Controller
@SessionAttributes("user")
public class WelcomeController {
    
	@Autowired
	private UserDao userdao;
	
	static String emailToRecipient,emailSubject, emailMessage,emailFileName;
	static final String emailFromRecipient = "v.rana54321@gmail.com";
	
//	static ModelAndView modelViewObj;
	
	@Autowired
	private JavaMailSender mailSenderObj;
	
	
//	@RequestMapping("/index")
//	public String welcomemsg() {
//		System.out.println("Inside index");
//		
//		return "login";
//	}
	@RequestMapping("/welcome")
	public String welce(Model model) {
		model.addAttribute("user",new UserData());
		return "login";
	}
	
	@RequestMapping(value="/login2", method=RequestMethod.GET)
	public String doLogin(@ModelAttribute("user") UserData ud,Model model) {
	//	String email=ud.getEmail();
		if(ud.getEmail().equals("Vinay@gmail.com"))
		{
			
			//ud=userdao.get(email);
//			
			ud.setName("Vinay");
			ud.setAge(21);
			ud.setPhone("1234567891");
//			
			model.addAttribute(ud);
			return "logged";
			
		}
		
		else
		{
			return "login";
		}
		

	}
	
	@RequestMapping("/eentry")
	public String eentry(Model model,@ModelAttribute("email") EmailData ed )
	{ String name="vinay";
	 model.addAttribute("name",name);
	 		
		
		
		return "EmailEntry";
	}
	
    @RequestMapping(value="/esend", method =RequestMethod.POST)
    public String esender(Model model, @ModelAttribute("email") EmailData ed) {
    	
    	emailSubject=ed.getSubject();
    	emailMessage=ed.getMessage();
    	emailToRecipient=ed.getMailsender();
    	emailFileName=ed.getFilename();
	mailSenderObj.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMessageHelper.setTo(emailToRecipient);
				mimeMessageHelper.setFrom(emailFromRecipient);
				mimeMessageHelper.setText(emailMessage);
				mimeMessageHelper.setSubject(emailSubject);
				if(emailFileName !="") {
				DataSource datasource = new FileDataSource(emailFileName);  
				mimeMessageHelper.addAttachment(emailFileName, datasource);
				
				}
				
			}
		});
	System.out.println("email sent successfully");
	model.addAttribute("email", ed);
    	return "EmailSend";
    }
	
	
////	@RequestMapping("/login")
//	public String log() {
//		
//		return "welcome";
//	}
//	@RequestMapping("/login")
//	public String wel(HttpServletRequest request,Model model) {
//		String id=request.getParameter("userId");
//		String pass=request.getParameter("pwd");
//		if(id.equals(pass)) {
//			model.addAttribute("msg",id);
//		}
//		else {
//			model.addAttribute("msg","Invalid Login");
//		}
//		
//		return "welcome";
//	}
//	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	
	
	@RequestMapping("/process")
	public String process(@Valid @ModelAttribute("Userdata")UserData ud1, BindingResult thebind,Model model) {
		
		if(thebind.hasErrors()) {
			
			return "UserForm";
		}
		
		else {
			   model.addAttribute("name",ud1.getName());
		       model.addAttribute("age",ud1.getAge());
		       model.addAttribute("pwd",ud1.getPwd());
		       model.addAttribute("phone",ud1.getPhone());
		       model.addAttribute("email",ud1.getEmail());
			return "SignedUP";
		}
		}
		
	@RequestMapping("/start")
	public String doStart(Model model) {
		model.addAttribute("Userdata",new UserData());
		return "UserForm";
	}
	
//	@RequestMapping("/start")
//	public String doStart(@ModelAttribute("Userdata") UserData us, Model model) {
//		model.addAttribute("msg",new UserData());
//		return "UserForm";
//	}
//    @RequestMapping("/SignedUP")
//    public String doSignup(@ModelAttribute("Userdata") UserData ud,Model model) {
//    //UserData ud=new UserData();
//       model.addAttribute("name",ud.getName());
//       model.addAttribute("age",ud.getAge());
//       model.addAttribute("pwd",ud.getPwd());
//       model.addAttribute("phone",ud.getPhone());
//       model.addAttribute("email",ud.getEmail());
//       
//    	
//    	return "SignedUP";
//    }


}