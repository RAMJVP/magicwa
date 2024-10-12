package com.mw.magicw;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin({"http://localhost:5173","https://670922b4700eca55788415ae--admirable-smakager-729141.netlify.app/"})
public class MagicwController {

	
	static List<Blog> bs=List.of(new Blog(0, LocalDate.now(), 4, "", "मुनिगन निकट बिहग मृग जाहीं। बाधक बधिक बिलोकि पराहीं॥\r\n"
			+ "\r\n"
			+ "हित अनहित पसु पच्छिउ जाना। मानुष तनु गुन ग्यान निधाना॥\r\n"
			+ "\r\n"
			+ "पक्षी और पशु मुनियों के पास (बेधड़क) चले जाते हैं, पर हिंसा करने वाले बधिकों को देखते ही भाग जाते हैं। मित्र और शत्रु को पशु-पक्षी भी पहचानते हैं। फिर मनुष्य शरीर तो गुण और ज्ञान का भंडार ही है॥\r\n"
			+ "\r\n"
			+ "Birds and beasts go to the sages fearlessly, but they run away as soon as they see the violators. Even animals and birds recognize friends and foes. Then the human body is a storehouse of qualities and knowledge.\r\n"
			+ "\r\n"
			+ ""), new Blog(0, LocalDate.now(), 4, "", "बरषहिं जलद भूमि निअराएँ। जथा नवहिं बुध बिद्या पाएँ।\r\n"
					+ "\r\n"
					+ "बूँद अघात सहहिं गिरि कैसे। खल के बचन संत सह जैसें॥\r\n"
					+ "\r\n"
					+ "बादल पृथ्वी के समीप आकर (नीचे उतरकर) बरस रहे हैं, जैसे विद्या पाकर विद्वान्‌ नम्र हो जाते हैं। बूँदों की चोट पर्वत कैसे सहते हैं, जैसे दुष्टों के वचन संत सहते हैं॥\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "The clouds are coming close to the earth (descending) and it is raining, just as scholars become humble after gaining knowledge. How mountains bear the blow of drops, just as saints bear the words of the wicked."), new Blog(0, LocalDate.now(), 4, "", "1"), new Blog(0, LocalDate.now(), 4, "", "1"), new Blog(0, LocalDate.now(), 4, "", "1"),
			new Blog(0, LocalDate.now(), 4, "", "लोभ कें इच्छा दंभ बल काम कें केवल नारि।\r\n"
					+ "\r\n"
					+ "क्रोध कें परुष बचन बल मुनिबर कहहिं बिचारि॥\r\n"
					+ "\r\n"
					+ "लोभ को इच्छा और दम्भ का बल है, काम को केवल स्त्री का बल है और क्रोध को कठोर वचनों का बल है, श्रेष्ठ मुनि विचार कर ऐसा कहते हैं॥\r\n"
					+ "\r\n"
					+ "Greed is the power of desire and pride, lust is the power of woman, and anger is the force of harsh words, the best sages think and say so."), new Blog(0, LocalDate.now(), 4, "", "1"), new Blog(0, LocalDate.now(), 4, "", "1"),
			new Blog(0, LocalDate.now(), 4, "", "1"), new Blog(0, LocalDate.now(), 4, "", "1"));
	
	
	@GetMapping("/blogs")
	public List<Blog> blogs(){
		return bs;
		
		
	}
	
}
