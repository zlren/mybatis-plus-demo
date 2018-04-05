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
public class Ability implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("zh_name")
    private String zhName;
    @TableField("en_name")
    private String enName;
    /**
     * 基础算法/模型算法
     */
    private String type;
    @TableField("model_id")
    private Integer modelId;
    /**
     * 默认调用量限制
     */
    @TableField("invoke_limit")
    private Integer invokeLimit;
    /**
     * 默认调用量限制
     */
    @TableField("qps_limit")
    private Integer qpsLimit;
    @TableField("restapi_url")
    private String restapiUrl;
    @TableField("doc_url")
    private String docUrl;
    private String description;
    private String version;
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

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
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

    public String getRestapiUrl() {
        return restapiUrl;
    }

    public void setRestapiUrl(String restapiUrl) {
        this.restapiUrl = restapiUrl;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
        return "Ability{" +
                ", id=" + id +
                ", zhName=" + zhName +
                ", enName=" + enName +
                ", type=" + type +
                ", modelId=" + modelId +
                ", invokeLimit=" + invokeLimit +
                ", qpsLimit=" + qpsLimit +
                ", restapiUrl=" + restapiUrl +
                ", docUrl=" + docUrl +
                ", description=" + description +
                ", version=" + version +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                "}";
    }
}
