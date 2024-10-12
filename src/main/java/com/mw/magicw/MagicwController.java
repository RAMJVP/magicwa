package com.mw.magicw;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin({"http://localhost:5173","https://admirable-smakager-729141.netlify.app/"})

//


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
					+ "The clouds are coming close to the earth (descending) and it is raining, just as scholars become humble after gaining knowledge. How mountains bear the blow of drops, just as saints bear the words of the wicked."), 
			new Blog(0, LocalDate.now(), 4, "", "धीरजु धरिअ त पाइअ पारू। नाहिं त बूड़िहि सबु परिवारू॥\n"
					+ "\n"
					+ "जौं जियँ धरिअ बिनय पिय मोरी। रामु लखनु सिय मिलहिं बहोरी॥\n"
					+ "\n"
					+ "आप धीरज धरिएगा, तो सब पार पहुँच जाएँगे। नहीं तो सारा परिवार डूब जाएगा। हे प्रिय स्वामी! यदि मेरी विनती हृदय में धारण कीजिएगा तो श्री राम, लक्ष्मण, सीता फिर आ मिलेंगे॥\n"
					+ "\n"
					+ "If you are patient, everything will be overcome. Otherwise the whole family will drown. Oh dear lord! If you keep my request in your heart, then Shri Ram, Lakshman and Sita will meet again.\n"
					+ "\n"
					+ "It highlights the virtue of steadfastness and faith in the face of adversity."), 
			new Blog(0, LocalDate.now(), 4, "", "करबि पायँ परि बिनय बहोरी। तात करिअ जनि चिंता मोरी॥\n"
					+ "\n"
					+ "बन मग मंगल कुसल हमारें। कृपा अनुग्रह पुन्य तुम्हारें॥\n"
					+ "\n"
					+ "फिर पाँव पकड़कर विनती करना कि हे पिताजी! आप मेरी चिंता न कीजिए। आपकी कृपा, अनुग्रह और पुण्य से वन में और मार्ग में हमारा कुशल-मंगल होगा॥\n"
					+ "\n"
					+ "Then hold your feet and pray, O father! Don't worry about me. With your kindness, grace and virtue, we will be prosperous in the forest and on the road."), 
			new Blog(0, LocalDate.now(), 4, "", "जनम मरन सब दुख सुख भोगा। हानि लाभु प्रिय मिलन बियोगा॥\n"
					+ "\n"
					+ "काल करम बस होहिं गोसाईं। बरबस राति दिवस की नाईं॥\n"
					+ "\n"
					+ "जन्म-मरण, सुख-दुःख के भोग, हानि-लाभ, प्यारों का मिलना-बिछुड़ना, हे स्वामी! काल और कर्म के अधीन रात और दिन की तरह\n"
					+ "\n"
					+ "स्वाभाविक रूप से होते रहते हैं॥\n"
					+ "\n"
					+ "Birth and death, enjoyment of happiness and sorrow, loss and gain, meeting and separation of loved ones, O Lord! Like night and day subject to time and action.\n"
					+ "\n"
					+ "Keep happening naturally."),
			new Blog(0, LocalDate.now(), 4, "", "लोभ कें इच्छा दंभ बल काम कें केवल नारि।\r\n"
					+ "\r\n"
					+ "क्रोध कें परुष बचन बल मुनिबर कहहिं बिचारि॥\r\n"
					+ "\r\n"
					+ "लोभ को इच्छा और दम्भ का बल है, काम को केवल स्त्री का बल है और क्रोध को कठोर वचनों का बल है, श्रेष्ठ मुनि विचार कर ऐसा कहते हैं॥\r\n"
					+ "\r\n"
					+ "Greed is the power of desire and pride, lust is the power of woman, and anger is the force of harsh words, the best sages think and say so."), new Blog(0, LocalDate.now(), 4, "", "1"), new Blog(0, LocalDate.now(), 4, "", "1"),
			new Blog(0, LocalDate.now(), 4, "", "जिअन मरन फलु दसरथ पावा। अंड अनेक अमल जसु छावा॥\n"
					+ "\n"
					+ "जिअत राम बिधु बदनु निहारा। राम बिरह करि मरनु सँवारा॥\n"
					+ "\n"
					+ "जीने और मरने का फल तो दशरथजी ने ही पाया, जिनका निर्मल यश अनेकों ब्रह्मांडों में छा गया। जीते जी तो श्री रामचन्द्रजी के चन्द्रमा के समान मुख को देखा और श्री राम के विरह को निमित्त बनाकर अपना मरण सुधार लिया॥\n"
					+ "\n"
					+ "The fruits of living and dying were achieved only by Dashrathji, whose pure fame spread across many universes. While alive, he saw the moon-like face of Shri Ramchandraji and corrected his death by making separation from Shri Ram the reason."), new Blog(0, LocalDate.now(), 4, "", "1"));
	
	
	@GetMapping("/blogs")
	public List<Blog> blogs(){
		return bs;
		
		
	}
	
	static List<Image> is=List.of(new Image(1,"https://i.imgur.com/EBsA49O.png"),new Image(1,"https://i.imgur.com/uHeZllR.png"),new Image(1,"https://i.imgur.com/J2DtqRK.jpeg"),
			new Image(1,"https://i.imgur.com/axtkx3m.jpeg"),new Image(1,"https://i.imgur.com/ctgMlwi.jpeg")
			,new Image(1,"https://i.imgur.com/NX30XIU.jpeg"),new Image(1,"https://i.imgur.com/KSViuYu.png"),new Image(1,"https://i.imgur.com/5tjx83F.png"),new Image(1,"https://i.imgur.com/kof6obs.png"),new Image(1,"https://i.imgur.com/VwoUutl.jpeg"),
			new Image(1,"https://i.imgur.com/0NSWBzz.png"),new Image(1,"https://i.imgur.com/G0htyyE.jpeg")
			);
	
	@GetMapping("/imgs")
	public List<Image> imgs(){
		return is;
		
		
	}
	
	
	
	
	
}
