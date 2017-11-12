package lab.zlren.mp.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlren
 * @since 2017-11-12
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("test_id")
    private Long testId;
    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 测试下划线字段命名类型
     */
    @TableField("test_type")
    private Integer testType;
    /**
     * 日期
     */
    @TableField("test_date")
    private Date testDate;
    /**
     * 测试
     */
    private Long role;
    /**
     * 手机号码
     */
    private String phone;
}
