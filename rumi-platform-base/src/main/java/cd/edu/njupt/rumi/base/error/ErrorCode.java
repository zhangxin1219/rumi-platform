package cd.edu.njupt.rumi.base.error;

import cd.edu.njupt.rumi.base.dto.PairValueDTO;
import cd.edu.njupt.rumi.base.enums.BaseEnum;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 错误码
 *
 * @author ZhangXin
 * @date 2020/9/18 15:12
 */
public enum ErrorCode implements BaseEnum {

    /**
     * 系统错误，请联系开发人员
     */
    SYSTEM_ERROR("sys_error", "系统错误，请联系开发人员");

    private final String label;

    private final String value;

    ErrorCode(String label, String value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public List<PairValueDTO> toList() {
        List<PairValueDTO> result = Lists.newArrayList();
        for (ErrorCode errorCode : ErrorCode.values()) {
            result.add(new PairValueDTO(errorCode.getLabel(), errorCode.getValue()));
        }
        return result;
    }
}
