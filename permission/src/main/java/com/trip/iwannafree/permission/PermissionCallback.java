package com.trip.iwannafree.permission;

import java.io.Serializable;

/**
 * @author Created by Administrator on 2017/5/10 0010.
 */

public interface PermissionCallback extends Serializable {
    void onClose();

    void onFinish();

    void onDeny(String permission, int position);

    void onGuarantee(String permission, int position);
}
