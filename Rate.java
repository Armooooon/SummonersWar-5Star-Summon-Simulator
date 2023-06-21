package sumrate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Rate {
	public static String randomStringFromArr() {
		 String[] monsterArray = {
				    "Archangel (Fire) - Velajuel",
				    "Archangel (Water) - Ariel",
				    "Archangel (Wind) - Eladriel",
				    "Art Master (Fire) - Jeogun",
				    "Art Master (Water) - Haegang",
				    "Art Master (Wind) - Cheongpung",
				    "Battle Angel (Fire) - Claire",
				    "Battle Angel (Water) - Amber",
				    "Battle Angel (Wind) - Sonia",
				    "Bayek (Fire)",
				    "Bayek (Wind)",
				    "Beast Monk (Fire) - Kumar",
				    "Beast Monk (Water) - Chandra",
				    "Beast Monk (Wind) - Ritesh",
				    "Beast Rider (Fire) - Masha",
				    "Beast Rider (Water) - Barbara",
				    "Beast Rider (Wind) - Savannah",
				    "Cannon Girl (Wind) - Christina",
				    "Chimera (Fire) - Rakan",
				    "Chimera (Water) - Taor",
				    "Chimera (Wind) - Lagmaron",
				    "Demon (Fire) - Bael",
				    "Demon (Water) - Belial",
				    "Demon (Wind) - Mephisto",
				    "Desert Queen (Fire) - Sekhmet",
				    "Desert Queen (Water) - Bastet",
				    "Desert Queen (Wind) - Hathor",
				    "Dragon (Fire) - Zaiross",
				    "Dragon (Water) - Verad",
				    "Dragon (Wind) - Jamire",
				    "Dragon Knight (Fire) - Laika",
				    "Dragon Knight (Water) - Chow",
				    "Dragon Knight (Wind) - Leo",
				    "Druid (Fire) - Bellenus",
				    "Druid (Water) - Abellio",
				    "Druid (Wind) - Taranys",
				    "Eivor (Water)",
				    "Ezio (Fire)",
				    "Ezio (Water)",
				    "Fairy King (Fire) - Daphnis",
				    "Fairy King (Water) - Psamathe",
				    "Fairy King (Wind) - Ganymede",
				    "Hell Lady (Fire) - Raki",
				    "Hell Lady (Water) - Beth",
				    "Hell Lady (Wind) - Ethna",
				    "Hollyberry Cookie (Fire)",
				    "Hollyberry Cookie (Water)",
				    "Hollyberry Cookie (Wind)",
				    "Kassandra (Fire)",
				    "Kassandra (Wind)",
				    "Kassandra (Water)",
				    "Lightning Emperor (Water) - Bolverk",
				    "Lightning Emperor (Wind) - Odin",
				    "Macaron Guard (Fire) - Alice",
				    "Macaron Guard (Water) - Manon",
				    "Macaron Guard (Wind) - Jade",
				    "Mage (Fire) - Coco",
				    "Mage (Water) - Nana",
				    "Mage (Wind) - Momo",
				    "Monkey King (Fire) - Mei Hou Wang",
				    "Monkey King (Water) - Shi Hou",
				    "Monkey King (Wind) - Xing Zhe",
				    "Occult Girl (Fire) - Rica",
				    "Occult Girl (Water) - Anavel",
				    "Occult Girl (Wind) - Charlotte",
				    "Onmyouji (Fire) - Tomoe",
				    "Onmyouji (Water) - Shizuka",
				    "Onmyouji (Wind) - Giou",
				    "Oracle (Fire) - Juno",
				    "Oracle (Water) - Praha",
				    "Oracle (Wind) - Seara",
				    "Paladin (Fire) - Ophilia",
				    "Paladin (Water) - Josephine",
				    "Paladin (Wind) - Louise",
				    "Panda Warrior (Fire) - Xiong Fei",
				    "Panda Warrior (Water) - Mo Long",
				    "Panda Warrior (Wind) - Feng Yan",
				    "Phoenix (Fire) - Perna",
				    "Phoenix (Water) - Sigmarus",
				    "Phoenix (Wind) - Teshar",
				    "Pioneer (Fire) - Chiwu",
				    "Pioneer (Water) - Woosa",
				    "Pioneer (Wind) - Pungbaek",
				    "Polar Queen (Fire) - Brandia",
				    "Polar Queen (Water) - Alicia",
				    "Polar Queen (Wind) - Tiana",
				    "Pudding Princess (Fire) - Lucia",
				    "Pudding Princess (Water) - Adriana",
				    "Pudding Princess (Wind) - Angela",
				    "Puppeteer (Fire) - Zima",
				    "Puppeteer (Water) - Zibala",
				    "Puppeteer (Wind) - Smicer",
				    "Pure Vanilla Cookie (Fire)",
				    "Pure Vanilla Cookie (Water)",
				    "Pure Vanilla Cookie (Wind)",
				    "Kassandra (Fire)",
				    "Kassandra (Wind)",
				    "Lightning Emperor (Water) - Bolverk",
				    "Lightning Emperor (Wind) - Odin",
				    "Sea Emperor (Fire) - Okeanos",
				    "Sea Emperor (Water) - Poseidon",
				    "Sea Emperor (Wind) - Triton",
				    "Shadow Claw (Fire) - Bernadotte",
				    "Shadowcaster (Fire) - Ren",
				    "Shadowcaster (Water) - Minato",
				    "Shadowcaster (Wind) - Zen",
				    "Sky Surfer (Fire) - John",
				    "Sky Surfer (Water) - Miles",
				    "Sky Surfer (Wind) - Oliver",
				    "Slayer (Fire) - Karnal",
				    "Slayer (Water) - Borgnine",
				    "Slayer (Wind) - Sagar",
				    "Striker (Fire) - Douglas",
				    "Striker (Water) - Moore",
				    "Striker (Wind) - KashmirT",
				    "Totemist (Fire) - Nora",
				    "Totemist (Water) - Aaliyah",
				    "Unicorn (Fire) - Helena",
				    "Unicorn (Water) - Amelia",
				    "Unicorn (Wind) - Diana",
				    "Valkyrja (Fire) - Vanessa",
				    "Valkyrja (Water) - Camilla",
				    "Valkyrja (Wind) - Katarina",
				    "Weapon Master (Fire) - Carlos",
				    "Weapon Master (Water) - Liam",
				    "Weapon Master (Wind) - DominicT",
				    "Totemist (Fire) - Nora",
				    "Totemist (Water) - Aaliyah"
				};
	        int randIdx = ThreadLocalRandom.current().nextInt(monsterArray.length);
	        String randomElem = monsterArray[randIdx];
	        return randomElem;
	    
	
	 }
public static void summon(){
	int summons = 1000;
	int Summons = 0;
	 
	for(int i = 0; i < summons; i++) {
		
		Random randI = new Random();
        Double myRandInt = randI.nextDouble(99);
        myRandInt = myRandInt+1;
		if (myRandInt <= 91.5) {
			System.out.println("Nat 3* summoned");
			System.out.println(myRandInt);
			Summons++;
			
		
		}else if(myRandInt >= 92.0 && myRandInt < 99.5 ) {
			System.out.println("Nat 4* summoned");
			System.out.println(myRandInt);
			Summons++;
			
			
		}else if(myRandInt >= 99.5) {
			System.out.println("Nat 5* summoned");
			System.out.println(myRandInt);
			Summons++;
			summons = 0;
			System.out.println("Would've oened " +  Summons + " Scrolls till you would've summoned a nat5*" );
			
		}
	}
	
	
}
public static void main(String[] args) {
	summon();
	System.out.println("You would've Summoned: " + randomStringFromArr());
}
}
