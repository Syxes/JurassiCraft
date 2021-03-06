package net.ilexiconn.jurassicraft.ai;

import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftTameable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class JurassiCraftAISit extends EntityAIBase
{

    private EntityJurassiCraftTameable creature;
    private boolean isSitting;

    public JurassiCraftAISit(EntityJurassiCraftTameable entityTameable)
    {
        this.creature = entityTameable;
        this.setMutexBits(5);
    }

    public boolean shouldExecute()
    {
        if (!this.creature.isTamed())
        {
            return false;
        }
        else if (this.creature.isInWater())
        {
            return false;
        }
        else if (!this.creature.onGround)
        {
            return false;
        }
        else
        {
            EntityLivingBase entitylivingbase = this.creature.getOwner();
            return entitylivingbase == null ? true : (this.creature.getDistanceSqToEntity(entitylivingbase) < 144.0D && entitylivingbase.getAITarget() != null ? false : this.isSitting);
        }
    }

    public void startExecuting()
    {
        this.creature.getNavigator().clearPathEntity();
        this.creature.setSitting(true);
    }

    public void resetTask()
    {
        this.creature.setSitting(false);
    }

    public void setSitting(boolean par1)
    {
        this.isSitting = par1;
    }
}