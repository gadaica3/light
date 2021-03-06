package com.networknt.light.rule.user;

import com.networknt.light.rule.Rule;

import java.util.Map;

/**
 * Created by Steve Hu on 2015-01-19.
 */
public class UpdRoleEvRule extends AbstractUserRule implements Rule {
    public boolean execute (Object ...objects) throws Exception {
        Map<String, Object> eventMap = (Map<String, Object>) objects[0];
        Map<String, Object> data = (Map<String, Object>) eventMap.get("data");
        updRole(data);
        return true;
    }
}
