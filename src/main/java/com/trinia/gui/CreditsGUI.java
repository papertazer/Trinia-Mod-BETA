package com.trinia.gui;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.sun.prism.paint.Color;
import com.trinia.Reference;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.gui.stream.GuiStreamOptions;
import net.minecraft.client.gui.stream.GuiStreamUnavailable;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.stream.IStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.client.GuiModList;
import net.minecraftforge.fml.client.config.HoverChecker;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CreditsGUI extends GuiScreen implements GuiYesNoCallback
{
	 private ButtonBack buttonBack;
	 private ButtonMods buttonMods;
	 
	 public HoverChecker undoHoverChecker;
	 public HoverChecker resetHoverChecker;
	 public HoverChecker checkBoxHoverChecker;
	    
   // protected void actionPerformed(GuiButton button) throws IOException{} 
    public CreditsGUI(GuiScreen p_i1046_1_, GameSettings p_i1046_2_){}
    public void initGui(int p_73969_1_, int p_73969_2_){}
    public void confirmClicked(boolean result, int id){}
    
    //title
    protected String creditPageName = "Credits!";
    
    //Positions
    protected String creditLeader = "Leaders:";
    protected String creditDeveloper = "Developers:";
    protected String creditArtist = "Artists:";
    
    //people who helped
    protected String creditPapertazer = "-Papertazer";
    protected String creditOMGitsMiniMe = "-OMGitsMiniMe";
    protected String creditSnurly = "-Snurly";
    protected String creditMagikModder = "-MagikModder (help)";
    protected String creditTerreen = "-Terreen";
    
    //Copyright
    protected String creditMojang = "Minecraft is copyright of MOJANG AB.";
	private int xSize;
	private int ySize;
    
    public void drawGuiForgroundLayer(int par1, int par2){
    	
    }
    
    public void initGui()
    {
    	int i = this.height / 4 + 48;
    	this.addSingleplayerMultiplayerButtons(i, 24);
     
    }
    
    public void addSingleplayerMultiplayerButtons(int p_73969_1_, int p_73969_2_){
    	//The parameters of GuiButton are(id, x, y, width, height, text);
    	this.buttonList.add(this.buttonBack = new ButtonBack(1, 10, 10, 20, 20, I18n.format("PMC", new Object[0])));
        this.buttonList.add(this.buttonMods = new ButtonMods(2, 10, 40, 20, 20, I18n.format("PMC", new Object[0])));
       
        buttonBack.width = 20;
        buttonMods.width = 20;
     
        buttonBack.packedFGColour = 16777215;
        buttonMods.packedFGColour = 16777215;
     
    }
    
    
    
    protected void actionPerformed(GuiButton button) throws IOException
    {
        if (button.id == 1)
        {
        	 this.mc.displayGuiScreen(new GuiMainMenu());
        }
        if (button.id == 2)
        {
        	 this.mc.displayGuiScreen(new GuiModList(null));
        }
    }
    
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        
        //title
        this.drawCenteredString(this.fontRendererObj, this.creditPageName, this.width / 2, 15, 16777215);
     
        //Leaders
        this.drawCenteredString(this.fontRendererObj, this.creditLeader, this.width / 2, 60, 18668501);
        this.drawCenteredString(this.fontRendererObj, this.creditPapertazer, this.width / 2, 70, 561991081);
        this.drawCenteredString(this.fontRendererObj, this.creditOMGitsMiniMe, this.width / 2, 80, 561991081);
        
        //Developers
        this.drawCenteredString(this.fontRendererObj, this.creditDeveloper, this.width / 2, 110, 18668501);
        this.drawCenteredString(this.fontRendererObj, this.creditPapertazer, this.width / 2, 120, 561991081);
        this.drawCenteredString(this.fontRendererObj, this.creditOMGitsMiniMe, this.width / 2, 130, 561991081);
        this.drawCenteredString(this.fontRendererObj, this.creditMagikModder, this.width / 2, 140, 561991081);
        
        //Artists
        this.drawCenteredString(this.fontRendererObj, this.creditArtist, this.width / 2, 170, 18668501);
        this.drawCenteredString(this.fontRendererObj, this.creditSnurly, this.width / 2, 180, 561991081);
        this.drawCenteredString(this.fontRendererObj, this.creditTerreen, this.width / 2, 190, 561991081);
        
        //Copyright
        this.drawCenteredString(this.fontRendererObj, this.creditMojang, this.width / 2, 230, 18668501);
        
        super.drawScreen(mouseX, mouseY, partialTicks);
        
        
        
    }
	private void drawCenteredString(FontRenderer fontRendererObj,
			String format, int x, int y, float red) {
		// TODO Auto-generated method stub
		
	}
	private void drawRect(int left, int top, int right, int bottom, Object rgb) {
		// TODO Auto-generated method stub
		
	}
	
}