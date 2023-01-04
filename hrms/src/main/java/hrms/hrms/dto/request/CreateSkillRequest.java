package hrms.hrms.dto.request;

import hrms.hrms.model.Level;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateSkillRequest {

    @NotBlank
    private String name;
    @NotBlank
    private Level level;

}
