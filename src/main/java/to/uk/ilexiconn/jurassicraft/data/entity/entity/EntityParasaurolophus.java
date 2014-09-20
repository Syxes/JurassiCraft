package to.uk.ilexiconn.jurassicraft.data.entity.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import to.uk.ilexiconn.jurassicraft.data.entity.EntityDinosaurCreature;
import to.uk.ilexiconn.jurassicraft.data.utility.ControlledParam;

public class EntityParasaurolophus extends EntityDinosaurCreature
{
	public int texid;
	public ControlledParam walkLean = new ControlledParam(0, 0, (float) Math.PI/2, 0);
	
    public EntityParasaurolophus(World world)
    {
        super(world, 11);
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        tasks.addTask(2, new EntityAIMate(this, 1.0D));
        tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
        tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        tasks.addTask(5, new EntityAIWander(this, 1.0D));
        tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        tasks.addTask(7, new EntityAILookIdle(this));
        texid = rand.nextInt(2);

    }

    public EntityParasaurolophus createChild(EntityAgeable entity)
    {
        return new EntityParasaurolophus(worldObj);
    }
    
    public String getLivingSound()
    {
    	        this.playSound("jurassicraft:ParaTrumpet01", 8.0F, 1.0F);
    	        return null;
    }
    
    public void onUpdate() {
    	super.onUpdate();
    	if (this.moveForward != 0) walkLean.change = 0.1F;
    	if (this.moveForward == 0) walkLean.change = -0.1F;
    	walkLean.update();
    }
}