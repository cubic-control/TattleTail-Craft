package com.cubic_control.TTM.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemTattleTail extends ModItem implements ICharge{
	String message;
	EnumChatFormatting nameColor;
	public int chargeInt = 0;

	public ModItemTattleTail(String name, float f1, int i) {
		super(name, f1);
		if(i == 1){
			nameColor = EnumChatFormatting.DARK_PURPLE;
		}else if(i == 2){
			nameColor = EnumChatFormatting.YELLOW;
		}else if(i == 3){
			nameColor = EnumChatFormatting.BLUE;
		}else if(i == 4){
			nameColor = EnumChatFormatting.WHITE;
		}else if(i == 5){
			nameColor = EnumChatFormatting.BLACK;
		}
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		message = tattleTailSpeach(message);
		
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.WHITE+"<"+nameColor+
				"TattleTail"+EnumChatFormatting.WHITE+">"+nameColor+message));
		return stack;
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int i1, boolean b1) {
		if(chargeInt != 0){
			--chargeInt;
		}
		if(chargeInt < 0){
			chargeInt = 0;
		}
		super.onUpdate(stack, world, entity, i1, b1);
	}
	@Override
	public boolean isOut(){
		if(chargeInt > 0){
			return false;
		}else{
			return true;
		}
	}
	
	private String tattleTailSpeach(String string){
		switch(this.itemRand.nextInt(70)){
		case 1:
			string=("Me Tattletail! Me lo-o-ove you!");
			return string;
		case 2:
			string=("Play time f-for me! Big fun!");
			return string;
		case 3:
			string=("Tattletail-l-l, that's me!");
			return string;
		case 4:
			string=("AH!");
			return string;
		case 5:
			string=("Ah!");
			return string;
		case 6:
			string=("Big sound...");
			return string;
		case 7:
			string=("Who's there-e!?");
			return string;
		case 8:
			string=("Aaah!");
			return string;
		case 9:
			string=("Back to bed...");
			return string;
		case 10:
			string=("Be careful...");
			return string;
		case 11:
			string=("Big mess! Hehehe!");
			return string;
		case 12:
			string=("Brush me!");
			return string;
		case 13:
			string=("Can't see me!");
			return string;
		case 14:
			string=("Choo-Choo!");
			return string;
		case 15:
			string=("Decorations!");
			return string;
		case 16:
			string=("Give me a treat!");
			return string;
		case 17:
			string=("Go away Mama!");
			return string;
		case 18:
			string=("Happy Birthday!");
			return string;
		case 19:
			string=("He he.");
			return string;
		case 20:
			string=("HEHEhehehe!");
			return string;
		case 21:
			string=("He hahehehehe!");
			return string;
		case 22:
			string=("Hide and Seek!");
			return string;
		case 23:
			string=("I didn't do an-... It wasn't me!");
			return string;
		case 24:
			string=("It's dark!");
			return string;
		case 25:
			string=("Let's play a game!");
			return string;
		case 26:
			string=("Light the candles!");
			return string;
		case 27:
			string=("Look what we did!");
			return string;
		case 28:
			string=("Hi Mama... In the b-bedroom... Okay... Bye Bye!");
			return string;
		case 29:
			string=("Mama hates you!");
			return string;
		case 30:
			string=("Mama saw yo-o-ou...");
			return string;
		case 31:
			string=("Mama's scary...");
			return string;
		case 32:
			string=("Mama's coming!");
			return string;
		case 33:
			string=("Mama's watching...");
			return string;
		case 34:
			string=("Me dizzy! Hehehehehe!");
			return string;
		case 35:
			string=("Me hiding!");
			return string;
		case 36:
			string=("Me hungry");
			return string;
		case 37:
			string=("Me know what you did...");
			return string;
		case 38:
			string=("Me love you!");
			return string;
		case 39:
			string=("Me scared");
			return string;
		case 40:
			string=("Me tired...");
			return string;
		case 41:
			string=("More! More!");
			return string;
		case 42:
			string=("No more Mama!");
			return string;
		case 43:
			string=("No peeking!");
			return string;
		case 44:
			string=("Now rewind the tape.");
			return string;
		case 45:
			string=("Oooh! Stinky");
			return string;
		case 46:
			string=("Oopsie daisy!");
			return string;
		case 47:
			string=("Presents for you!");
			return string;
		case 48:
			string=("Show me Mama!");
			return string;
		case 49:
			string=("Shut the door...");
			return string;
		case 50:
			string=("SHUT THE DOOR!!!");
			return string;
		case 51:
			string=("Tattletail go home...");
			return string;
		case 52:
			string=("Tattletail go night-night.");
			return string;
		case 53:
			string=("Thank you.");
			return string;
		case 54:
			string=("Uh Oh!");
			return string;
		case 55:
			string=("Wake up! Wake up! Wake up!");
			return string;
		case 56:
			string=("We need one more!");
			return string;
		case 57:
			string=("You're up! We are having a party for Mama! Come help us.");
			return string;
		case 58:
			string=("Wheeeee!");
			return string;
		case 59:
			string=("Where did you go!?");
			return string;
		case 60:
			string=("Where's Mama...?");
			return string;
		case 61:
			string=("Why you do bad?");
			return string;
		case 62:
			string=("Wooooooow!");
			return string;
		case 63:
			string=("Wow!");
			return string;
		case 64:
			string=("You found me!");
			return string;
		case 65:
			string=("You're in big trouble...");
			return string;
		case 66:
			string=("[Singing]");
			return string;
		case 67:
			string=("[Humming]");
			return string;
		case 68:
			string=("[Yawning]");
			return string;
		case 69:
			string=("[Snoring]");
			return string;
		}
		return string;
	}

}