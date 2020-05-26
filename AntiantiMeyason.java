package meyason.test;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class AntiantiMeyason extends PluginBase implements Listener {

    public void onEnable(){
        getLogger().info("アンチめやそん迎撃システム起動しました。");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void AAM(PlayerChatEvent event){
        String chat = event.getMessage();
        if(chat.equals("めやそんぶす")){
            this.getServer().broadcastMessage("はったおすぞ");
        }
    }
}
