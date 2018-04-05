package lab.zlren.mp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zlren
 * @since 2018-04-05
 */
@TableName("app_ability")
public class AppAbility implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("app_id")
    private Integer appId;
    @TableField("ability_id")
    private Integer abilityId;
    /**
     * 该app下的该ability状态(开放/关闭)
     */
    private String status;
    /**
     * 调用量限制（100/天）
     */
    @TableField("invoke_limit")
    private Integer invokeLimit;
    /**
     * QPS限制
     */
    @TableField("qps_limit")
    private Integer qpsLimit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getInvokeLimit() {
        return invokeLimit;
    }

    public void setInvokeLimit(Integer invokeLimit) {
        this.invokeLimit = invokeLimit;
    }

    public Integer getQpsLimit() {
        return qpsLimit;
    }

    public void setQpsLimit(Integer qpsLimit) {
        this.qpsLimit = qpsLimit;
    }

    @Override
    public String toString() {
        return "AppAbility{" +
                ", id=" + id +
                ", appId=" + appId +
                ", abilityId=" + abilityId +
                ", status=" + status +
                ", invokeLimit=" + invokeLimit +
                ", qpsLimit=" + qpsLimit +
                "}";
    }
}
