package lab.zlren.mp.entity;

import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

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
@TableName("ability_invoke_log")
public class AbilityInvokeLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("app_id")
    private Integer appId;
    @TableField("ability_id")
    private Integer abilityId;
    /**
     * 调用成功/失败
     */
    @TableField("invoke_result")
    private String invokeResult;
    @TableField("invoke_result_reason")
    private String invokeResultReason;
    /**
     * 调用时间
     */
    @TableField("invoke_time")
    private Date invokeTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getInvokeResult() {
        return invokeResult;
    }

    public void setInvokeResult(String invokeResult) {
        this.invokeResult = invokeResult;
    }

    public String getInvokeResultReason() {
        return invokeResultReason;
    }

    public void setInvokeResultReason(String invokeResultReason) {
        this.invokeResultReason = invokeResultReason;
    }

    public Date getInvokeTime() {
        return invokeTime;
    }

    public void setInvokeTime(Date invokeTime) {
        this.invokeTime = invokeTime;
    }

    @Override
    public String toString() {
        return "AbilityInvokeLog{" +
                ", id=" + id +
                ", appId=" + appId +
                ", abilityId=" + abilityId +
                ", invokeResult=" + invokeResult +
                ", invokeResultReason=" + invokeResultReason +
                ", invokeTime=" + invokeTime +
                "}";
    }
}
