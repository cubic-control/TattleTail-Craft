package com.cubic_control.TTM.Items;

import com.cubic_control.TTM.Config.MConfig;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ModItemTattleTail extends ModItemBlockPlacer /*implements ICharge*/{
	String message;
	String sound;
	EnumChatFormatting nameColor;
	public int chargeInt = 0;

	public ModItemTattleTail(String name, float f1, int i, BaseBlock block) {
		super(name, f1, block);
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
		}else if(i == 6){
			nameColor = EnumChatFormatting.GOLD;
		}
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		message = tattleTailSpeach(message);
		sound = tattleTailSound(sound);
		
		if(world.isRemote){
			//if(MConfig.tattleTextMode){
				player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.WHITE+"<"+
						nameColor+"TattleTail"+EnumChatFormatting.WHITE+">"+nameColor+message));
			//}
		}else{
			//if(!MConfig.tattleTextMode){
				//world.playSoundAtEntity(player, RefStrings.MODID + ":" + sound, 0.5F, 1.0F);
			//}
		}
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
	
	private String tattleTailSpeach(String string){
		switch(this.itemRand.nextInt(69)){
		case 0:
			string=("Me Tattletail! Me lo-o-ove you!");
			return string;
		case 1:
			string=("Play time f-for me! Big fun!");
			return string;
		case 2:
			string=("Tattletail-l-l, that's me!");
			return string;
		case 3:
			string=("AH!");
			return string;
		case 4:
			string=("Ah!");
			return string;
		case 5:
			string=("Big sound...");
			return string;
		case 6:
			string=("Who's there-e!?");
			return string;
		case 7:
			string=("Aaah!");
			return string;
		case 8:
			string=("Back to bed...");
			return string;
		case 9:
			string=("Be careful...");
			return string;
		case 10:
			string=("Big mess! Hehehe!");
			return string;
		case 11:
			string=("Brush me!");
			return string;
		case 12:
			string=("Can't see me!");
			return string;
		case 13:
			string=("Choo-Choo!");
			return string;
		case 14:
			string=("Decorations!");
			return string;
		case 15:
			string=("Give me a treat!");
			return string;
		case 16:
			string=("Go away Mama!");
			return string;
		case 17:
			string=("Happy Birthday!");
			return string;
		case 18:
			string=("He he.");
			return string;
		case 19:
			string=("HEHEhehehe!");
			return string;
		case 20:
			string=("He hahehehehe!");
			return string;
		case 21:
			string=("Hide and Seek!");
			return string;
		case 22:
			string=("I didn't do an-... It wasn't me!");
			return string;
		case 23:
			string=("It's dark!");
			return string;
		case 24:
			string=("Let's play a game!");
			return string;
		case 25:
			string=("Light the candles!");
			return string;
		case 26:
			string=("Look what we did!");
			return string;
		case 27:
			string=("Hi Mama... In the b-bedroom... Okay... Bye Bye!");
			return string;
		case 28:
			string=("Mama hates you!");
			return string;
		case 29:
			string=("Mama saw yo-o-ou...");
			return string;
		case 30:
			string=("Mama's scary...");
			return string;
		case 31:
			string=("Mama's coming!");
			return string;
		case 32:
			string=("Mama's watching...");
			return string;
		case 33:
			string=("Me dizzy! Hehehehehe!");
			return string;
		case 34:
			string=("Me hiding!");
			return string;
		case 35:
			string=("Me hungry");
			return string;
		case 36:
			string=("Me know what you did...");
			return string;
		case 37:
			string=("Me love you!");
			return string;
		case 38:
			string=("Me scared");
			return string;
		case 39:
			string=("Me tired...");
			return string;
		case 40:
			string=("More! More!");
			return string;
		case 41:
			string=("No more Mama!");
			return string;
		case 42:
			string=("No peeking!");
			return string;
		case 43:
			string=("Now rewind the tape.");
			return string;
		case 44:
			string=("Oooh! Stinky");
			return string;
		case 45:
			string=("Oopsie daisy!");
			return string;
		case 46:
			string=("Presents for you!");
			return string;
		case 47:
			string=("Show me Mama!");
			return string;
		case 48:
			string=("Shut the door...");
			return string;
		case 49:
			string=("SHUT THE DOOR!!!");
			return string;
		case 50:
			string=("Tattletail go home...");
			return string;
		case 51:
			string=("Tattletail go night-night.");
			return string;
		case 52:
			string=("Thank you.");
			return string;
		case 53:
			string=("Uh Oh!");
			return string;
		case 54:
			string=("Wake up! Wake up! Wake up!");
			return string;
		case 55:
			string=("We need one more!");
			return string;
		case 56:
			string=("You're up! We are having a party for Mama! Come help us.");
			return string;
		case 57:
			string=("Wheeeee!");
			return string;
		case 58:
			string=("Where did you go!?");
			return string;
		case 59:
			string=("Where's Mama...?");
			return string;
		case 60:
			string=("Why you do bad?");
			return string;
		case 61:
			string=("Wooooooow!");
			return string;
		case 62:
			string=("Wow!");
			return string;
		case 63:
			string=("You found me!");
			return string;
		case 64:
			string=("You're in big trouble...");
			return string;
		case 65:
			string=("[Singing]");
			return string;
		case 66:
			string=("[Humming]");
			return string;
		case 67:
			string=("[Yawning]");
			return string;
		case 68:
			string=("[Snoring]");
			return string;
		}
		return string;
	}
	
	private String tattleTailSound(String string){
		switch(this.itemRand.nextInt(74)){
		case 0:
			string=("tt.ahh");
			return string;
		case 1:
			string=("tt.ahh.big.sound");
			return string;
		case 2:
			string=("tt.ahh.whos.there");
			return string;
		case 3:
			string=("tt.ahh2");
			return string;
		case 4:
			string=("tt.ahh3");
			return string;
		case 5:
			string=("tt.ahh4");
			return string;
		case 6:
			string=("tt.ahh5");
			return string;
		case 7:
			string=("tt.ahh6");
			return string;
		case 8:
			string=("tt.back.to.bed");
			return string;
		case 9:
			string=("tt.be.careful");
			return string;
		case 10:
			string=("tt.big.mess.hehehe");
			return string;
		case 11:
			string=("tt.brush.me");
			return string;
		case 12:
			string=("tt.cant.see.me");
			return string;
		case 13:
			string=("tt.choo.choo");
			return string;
		case 14:
			string=("tt.decorations");
			return string;
		case 15:
			string=("tt.give.me.a.treat");
			return string;
		case 16:
			string=("tt.go.away.mama");
			return string;
		case 17:
			string=("tt.happy.birthday");
			return string;
		case 18:
			string=("tt.happy.birthday2");
			return string;
		case 19:
			string=("tt.happy.birthday3");
			return string;
		case 20:
			string=("tt.he.he.he");
			return string;
		case 21:
			string=("tt.he.he.he.he.he");
			return string;
		case 22:
			string=("tt.he.he.he.he.he.he");
			return string;
		case 23:
			string=("tt.hide.and.seek");
			return string;
		case 24:
			string=("tt.honk.shoe");
			return string;
		case 25:
			string=("tt.i.didnt.do.it");
			return string;
		case 26:
			string=("tt.it.wasnt.me");
			return string;
		case 27:
			string=("tt.its.dark");
			return string;
		case 28:
			string=("tt.lets.play.a.game");
			return string;
		case 29:
			string=("tt.light.the.candles");
			return string;
		case 30:
			string=("tt.look.what.me.did");
			return string;
		case 31:
			string=("tt.mama.conversation");
			return string;
		case 32:
			string=("tt.mama.hates.you");
			return string;
		case 33:
			string=("tt.mama.saw.you");
			return string;
		case 34:
			string=("tt.mama.scary");
			return string;
		case 35:
			string=("tt.mamas.coming");
			return string;
		case 36:
			string=("tt.mamas.watching");
			return string;
		case 37:
			string=("tt.me.dizzy.hehe");
			return string;
		case 38:
			string=("tt.me.hiding");
			return string;
		case 39:
			string=("tt.me.hungry");
			return string;
		case 40:
			string=("tt.me.know.what.you.did");
			return string;
		case 41:
			string=("tt.me.love.you");
			return string;
		case 42:
			string=("tt.me.scared");
			return string;
		case 43:
			string=("tt.me.tired");
			return string;
		case 44:
			string=("tt.metattletail");
			return string;
		case 45:
			string=("tt.mmm");
			return string;
		case 46:
			string=("tt.more.more");
			return string;
		case 47:
			string=("tt.no.more.mama");
			return string;
		case 48:
			string=("tt.no.peeking");
			return string;
		case 49:
			string=("tt.now.rewind.the.tape");
			return string;
		case 50:
			string=("tt.ooh.stinky");
			return string;
		case 51:
			string=("tt.oopsie.daisy");
			return string;
		case 52:
			string=("tt.playtime");
			return string;
		case 53:
			string=("tt.presents.for.you");
			return string;
		case 54:
			string=("tt.show.me.mama");
			return string;
		case 55:
			string=("tt.shut.the.door");
			return string;
		case 56:
			string=("tt.shut.the.door.loud");
			return string;
		case 57:
			string=("tt.sing1");
			return string;
		case 58:
			string=("tt.tattletail.go.home");
			return string;
		case 59:
			string=("tt.tattletail.go.nightnight");
			return string;
		case 60:
			string=("tt.tattletailthatsme");
			return string;
		case 61:
			string=("tt.thank.you");
			return string;
		case 62:
			string=("tt.uh.oh");
			return string;
		case 63:
			string=("tt.wakeup");
			return string;
		case 64:
			string=("tt.we.need.one.more");
			return string;
		case 65:
			string=("tt.were.having.a.party.for.mama");
			return string;
		case 66:
			string=("tt.whee");
			return string;
		case 67:
			string=("tt.where.you.go");
			return string;
		case 68:
			string=("tt.wheres.mama");
			return string;
		case 69:
			string=("tt.why.you.do.bad");
			return string;
		case 70:
			string=("tt.wooow");
			return string;
		case 71:
			string=("tt.wow");
			return string;
		case 72:
			string=("tt.you.found.me");
			return string;
		case 73:
			string=("tt.youre.in.big.trouble");
			return string;
		}
		return string;
	}

}