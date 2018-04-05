package lab.zlren.mp.entity;

import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zlren
 * @since 2018-04-05
 */
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("developer_id")
    private Integer developerId;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 应用类型
     */
    private String type;
    /**
     * 应用平台
     */
    private String platform;
    @TableField("client_id")
    private String clientId;
    @TableField("client_secret")
    private String clientSecret;
    @TableField("ability_scope")
    private String abilityScope;
    private String description;
    /**
     * 状态（已上线、运行中、关闭、异常）
     */
    private String status;
    /**
     * 应用图标
     */
    @TableField("logo_file")
    private String logoFile;
    @TableField("create_date")
    private Date createDate;
    @TableField("update_date")
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAbilityScope() {
        return abilityScope;
    }

    public void setAbilityScope(String abilityScope) {
        this.abilityScope = abilityScope;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(String logoFile) {
        this.logoFile = logoFile;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "App{" +
                ", id=" + id +
                ", developerId=" + developerId +
                ", name=" + name +
                ", type=" + type +
                ", platform=" + platform +
                ", clientId=" + clientId +
                ", clientSecret=" + clientSecret +
                ", abilityScope=" + abilityScope +
                ", description=" + description +
                ", status=" + status +
                ", logoFile=" + logoFile +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                "}";
    }
}
