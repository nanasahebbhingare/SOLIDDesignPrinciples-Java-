package com.solid.singleresponsibilityprinciple;

import java.util.Objects;

public class UserValidate {
	public Boolean isValidUser(User user) {
		if (Objects.isNull(user)) {
			return Boolean.FALSE;
		} else if (Objects.isNull(user.getUserId())) {
			return Boolean.FALSE;
		} else if (Objects.isNull(user.getUserName())) {
			return Boolean.FALSE;
		} else {
			return Boolean.TRUE;
		}
	}
}
