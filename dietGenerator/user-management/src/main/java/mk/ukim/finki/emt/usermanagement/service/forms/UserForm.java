package mk.ukim.finki.emt.usermanagement.service.forms;

import lombok.Data;
import mk.ukim.finki.emt.sharedkernel.domain.user.UserInfo;
import mk.ukim.finki.emt.usermanagement.domain.model.UserId;
import mk.ukim.finki.emt.usermanagement.domain.valueObjects.Goal;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class UserForm {
    @NotNull
    private UserInfo userInfo;
    @NotNull
    private Goal goal;
}
